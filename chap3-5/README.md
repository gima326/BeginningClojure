# chap3-5

『はじめてのClojure』（P58 - 59）

## Usage

3.5 「『スタンドアローン・アプリケーション』化」における内容<br>

　・Leiningen に依存せず、Java コマンドで -main 関数を実行する<br>
　・「project.clj」への追記（「:aot [first-project.core]」など）<br>
　・「first-project.core.clj」への追記（「(:gen-class)」の有無）<br>

　　パターン０：project.clj　記述なし<br>
　　パターン１：project.clj　「:aot [first-project.core]」を使用<br>
　　パターン２：project.clj　「:uberjar-name "chap3-5-2-0.1.0-standalone.jar"<br>
　　　　　　　　　　　　　　:profiles {:uberjar {:aot :all}}」を使用<br>
　　パターン３：core.clj　　「(:gen-class)」をコメントアウト<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ lein new first-project<br>
bash-3.2$ mv first-project/ chap3-5/<br>
bash-3.2$ cd chap3-5/<br>

===== パターン　その０ =====<br>

bash-3.2$ cat project.clj<br>
(defproject chap3-5 "0.1.0-SNAPSHOT"<br>
  :description "FIXME: write description"<br>
  :url "http://example.com/FIXME"<br>
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"<br>
            :url "https://www.eclipse.org/legal/epl-2.0/"}<br>

;; Leiningen の clojure のバージョンに拠る<br>
  :dependencies [[org.clojure/clojure "1.10.0"]]<br>

;; 実行時の -main の記載されているクラス<br>
  :main first-project.core)<br>

---------------------------<br>

bash-3.2$ lein uberjar<br>
（中略）
Warning: specified :main without including it in :aot. <br>
Implicit AOT of :main will be removed in Leiningen 3.0.0. <br>
If you only need AOT for your uberjar, consider adding :aot :all into your<br>
:uberjar profile instead.<br>
Compiling first-project.core<br>
Created chap3-5/target/chap3-5-0.1.0-SNAPSHOT.jar<br>
Created chap3-5/target/chap3-5-0.1.0-SNAPSHOT-standalone.jar<br>

bash-3.2$ java -jar ./target/chap3-5-0.1.0-SNAPSHOT-standalone.jar 0 1 2 3<br>
Sum: 6<br><br>


===== パターン　その１ =====<br>

bash-3.2$ cat project.clj<br>
(defproject chap3-5 "0.1.0-SNAPSHOT"<br>
  :description "FIXME: write description"<br>
  :url "http://example.com/FIXME"<br>
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"<br>
            :url "https://www.eclipse.org/legal/epl-2.0/"}<br>
  :dependencies [[org.clojure/clojure "1.10.0"]]<br>
  :repl-options {:init-ns first-project.core}<br>

;; 実行時の -main の記載されているクラス<br>
  :main first-project.core<br>

;; 追記パターン　その１<br>
  :aot [first-project.core]<br>

;; 追記パターン　その２<br>
;;　:uberjar-name "chap3-5-2-0.1.0-standalone.jar"<br>
;;　:profiles {:uberjar {:aot :all}}<br>
　)<br>

---------------------------<br>

bash-3.2$ lein uberjar<br>
（中略）
Compiling first-project.core<br>
Compiling first-project.core<br>
Created chap3-5/target/chap3-5-0.1.0-SNAPSHOT.jar<br>
Created chap3-5/target/chap3-5-0.1.0-SNAPSHOT-standalone.jar<br>
bash-3.2$ java -jar ./target/chap3-5-0.1.0-SNAPSHOT-standalone.jar 1 2 3 4<br>
Sum: 10<br><br>


===== パターン　その２ =====<br>

bash-3.2$ cat project.clj<br>
(defproject chap3-5 "0.1.0-SNAPSHOT"<br>
  :description "FIXME: write description"<br>
  :url "http://example.com/FIXME"<br>
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"<br>
            :url "https://www.eclipse.org/legal/epl-2.0/"}<br>
;; Leiningen の clojure のバージョンに拠る<br>
  :dependencies [[org.clojure/clojure "1.10.0"]]<br>

;; 実行時の -main の記載されているクラス<br>
  :main first-project.core<br>

;; 追記パターン　その１<br>
;;  :aot [first-project.core]<br>

;; 追記パターン　その２<br>
　:uberjar-name "chap35-2-0.1.0-standalone.jar"<br>
　:profiles {:uberjar {:aot :all}}<br>
  )<br>

---------------------------<br>

bash-3.2$ lein uberjar<br>
（中略）
Compiling first-project.core<br>
Created chap3-5/target/chap3-5-0.1.0-SNAPSHOT.jar<br>
Created chap3-5/target/chap3-5-2-0.1.0-standalone.jar<br>

bash-3.2$ java -jar ./target/chap3-5-2-0.1.0-standalone.jar 2 3 4 5<br>
Sum: 14<br><br>


===== パターン　その３ =====<br>

bash-3.2$ cat src/first_project/core.clj<br>
(ns first-project.core<br>
　;; コメントアウト<br>
　;;(:gen-class)<br>
)<br>

(defn parse-int [str]<br>
　(Integer. str))<br>

(defn -main [& args]<br>
　(println (str "Sum: " (apply + (map parse-int args)))))<br>

---------------------------<br>

bash-3.2$ lein uberjar<br>
（中略）
Compiling first-project.core<br>
Warning: The Main-Class specified does not exist within the jar. It may not be executable as expected. A gen-class directive may be missing in the namespace which contains the main method, or the namespace has not been AOT-compiled.<br>
Created chap3-5/target/chap3-5-0.1.0-SNAPSHOT.jar<br>
Created chap3-5/target/chap3-5-2-0.1.0-standalone.jar<br>

bash-3.2$ java -jar ./target/chap3-5-2-0.1.0-standalone.jar 2 3 4 5<br>
エラー: メイン・クラスfirst_project.coreを検出およびロードできませんでした<br>
原因: java.lang.ClassNotFoundException: first_project.core<br>


## License

Copyright © 2021 FIXME
