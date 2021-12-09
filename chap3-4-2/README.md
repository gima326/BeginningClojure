# chap3-4-2

『はじめてのClojure』（P57）

## Usage

3.4 「エントリーポイント」における内容<br>

　・「project.clj」に「:main first-project.core」がない状態<br>
　・ターミナルから -main 関数を実行する<br>
　・ -main 関数への引数渡し<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ lein new first-project<br>
bash-3.2$ mv first-project/ chap3-4-2/<br>
bash-3.2$ cd chap3-4-2/<br>
bash-3.2$ cat project.clj<br>
(defproject chap3-4-2 "0.1.0-SNAPSHOT"<br>
  :description "FIXME: write description"<br>
  :url "http://example.com/FIXME"<br>
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"<br>
            :url "https://www.eclipse.org/legal/epl-2.0/"}<br>
  :dependencies [[org.clojure/clojure "1.10.0"]]<br>
  :repl-options {:init-ns first-project.core}<br>

　;; 追記＆コメントアウト<br>
  ;;:main first-project.core)<br>

bash-3.2$ lein run -m first-project.core 1234 2345<br>
Sum: 3579<br>

bash-3.2$ lein run 1234 2345<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
java.lang.Exception: Error loading chap3-4-2/project.clj<br>
 at leiningen.core.project$read_raw$fn__7295.invoke (project.clj:1046)<br>
    leiningen.core.project$read_raw.invokeStatic (project.clj:1040)<br>
    leiningen.core.project$read_raw.invoke (project.clj:1036)<br>
    leiningen.core.project$read.invokeStatic (project.clj:1057)<br>
    leiningen.core.project$read.invoke (project.clj:1054)<br>
    leiningen.core.project$read.invokeStatic (project.clj:1058)<br>
    leiningen.core.project$read.invoke (project.clj:1054)<br>
    leiningen.core.main$_main$fn__6681.invoke (main.clj:447)<br>
    leiningen.core.main$_main.invokeStatic (main.clj:442)<br>
    leiningen.core.main$_main.doInvoke (main.clj:439)<br>
    clojure.lang.RestFn.applyTo (RestFn.java:137)<br>
    clojure.lang.Var.applyTo (Var.java:705)<br>
    clojure.core$apply.invokeStatic (core.clj:665)<br>
    clojure.main$main_opt.invokeStatic (main.clj:491)<br>
    clojure.main$main_opt.invoke (main.clj:487)<br>
    clojure.main$main.invokeStatic (main.clj:598)<br>
    clojure.main$main.doInvoke (main.clj:561)<br>
    clojure.lang.RestFn.applyTo (RestFn.java:137)<br>
    clojure.lang.Var.applyTo (Var.java:705)<br>
    clojure.main.main (main.java:37)<br>
Caused by: clojure.lang.Compiler$CompilerException: Syntax error reading source at (chap3-4-2/project.clj:11:1).<br>
#:clojure.error{:phase :read-source, :line 11, :column 1, :source "chap3-4-2/project.clj"}<br>
 at clojure.lang.Compiler.load (Compiler.java:7642)<br>
    clojure.lang.Compiler.loadFile (Compiler.java:7573)<br>
    clojure.lang.RT$3.invoke (RT.java:327)<br>
    leiningen.core.project$read_raw$fn__7295.invoke (project.clj:1044)<br>
    leiningen.core.project$read_raw.invokeStatic (project.clj:1040)<br>
    leiningen.core.project$read_raw.invoke (project.clj:1036)<br>
    leiningen.core.project$read.invokeStatic (project.clj:1057)<br>
    leiningen.core.project$read.invoke (project.clj:1054)<br>
    leiningen.core.project$read.invokeStatic (project.clj:1058)<br>
    leiningen.core.project$read.invoke (project.clj:1054)<br>
    leiningen.core.main$_main$fn__6681.invoke (main.clj:447)<br>
    leiningen.core.main$_main.invokeStatic (main.clj:442)<br>
    leiningen.core.main$_main.doInvoke (main.clj:439)<br>
    clojure.lang.RestFn.applyTo (RestFn.java:137)<br>
    clojure.lang.Var.applyTo (Var.java:705)<br>
    clojure.core$apply.invokeStatic (core.clj:665)<br>
    clojure.main$main_opt.invokeStatic (main.clj:491)<br>
    clojure.main$main_opt.invoke (main.clj:487)<br>
    clojure.main$main.invokeStatic (main.clj:598)<br>
    clojure.main$main.doInvoke (main.clj:561)<br>
    clojure.lang.RestFn.applyTo (RestFn.java:137)<br>
    clojure.lang.Var.applyTo (Var.java:705)<br>
    clojure.main.main (main.java:37)<br>
Caused by: java.lang.RuntimeException: EOF while reading, starting at line 1<br>
 at clojure.lang.Util.runtimeException (Util.java:221)<br>
    clojure.lang.LispReader.readDelimitedList (LispReader.java:1405)<br>
    clojure.lang.LispReader$ListReader.invoke (LispReader.java:1243)<br>
    clojure.lang.LispReader.read (LispReader.java:285)<br>
    clojure.lang.LispReader.read (LispReader.java:216)<br>
    clojure.lang.Compiler.load (Compiler.java:7629)<br>
    clojure.lang.Compiler.loadFile (Compiler.java:7573)<br>
    clojure.lang.RT$3.invoke (RT.java:327)<br>
    leiningen.core.project$read_raw$fn__7295.invoke (project.clj:1044)<br>
    leiningen.core.project$read_raw.invokeStatic (project.clj:1040)<br>
    leiningen.core.project$read_raw.invoke (project.clj:1036)<br>
    leiningen.core.project$read.invokeStatic (project.clj:1057)<br>
    leiningen.core.project$read.invoke (project.clj:1054)<br>
    leiningen.core.project$read.invokeStatic (project.clj:1058)<br>
    leiningen.core.project$read.invoke (project.clj:1054)<br>
    leiningen.core.main$_main$fn__6681.invoke (main.clj:447)<br>
    leiningen.core.main$_main.invokeStatic (main.clj:442)<br>
    leiningen.core.main$_main.doInvoke (main.clj:439)<br>
    clojure.lang.RestFn.applyTo (RestFn.java:137)<br>
    clojure.lang.Var.applyTo (Var.java:705)<br>
    clojure.core$apply.invokeStatic (core.clj:665)<br>
    clojure.main$main_opt.invokeStatic (main.clj:491)<br>
    clojure.main$main_opt.invoke (main.clj:487)<br>
    clojure.main$main.invokeStatic (main.clj:598)<br>
    clojure.main$main.doInvoke (main.clj:561)<br>
    clojure.lang.RestFn.applyTo (RestFn.java:137)<br>
    clojure.lang.Var.applyTo (Var.java:705)<br>
    clojure.main.main (main.java:37)<br>


## License

Copyright © 2021 FIXME
