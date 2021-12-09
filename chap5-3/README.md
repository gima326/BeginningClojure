# chap5-3

『はじめてのClojure』（P76 - 78）

## Usage

5.3 「Compojure で URL ルーティング」における内容<br>

　・project.clj に追記（依存ライブラリ、-main 関数のあるネームスペース指定）<br>
　・依存ライブラリを最新版に変更（「http-kit」 "2.1.16" -> "2.5.3"、「ring」"1.2.1" -> "1.9.4"、「compojure」"1.1.6" ->  "1.6.2"）<br>
　・-main 関数を明示することで、ring 使用時とはちがい、任意のポートを使える。<br>

　・ブラウザからアクセス　その１<br>
　　ルートにアクセス（"http://localhost:8080"）<br>

　・ブラウザからアクセス　その２<br>
　　ルート以外にアクセス（"http://localhost:8080/contacts"）<br>

　・ブラウザからアクセス　その３<br>
　　無効なアドレスにアクセス（"http://localhost:8080/foo"）<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ pwd<br>
chap5-3<br>

bash-3.2$ lein run<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>

（以降、待ち状態。ブラウザからアクセスがあれば、下記、文字列が出力される）<br>

■その１（ブラウザに固定文字を返す。リクエストをコンソールに出力）<br>
"top"<br>

■その２（ブラウザに固定文字を返す。リクエストをコンソールに出力）<br>
"contacts"<br>

■その３（ブラウザに固定文字を返す）<br>
"Not found"<br>


## License

Copyright © 2021 FIXME
