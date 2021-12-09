# chap5-5

『はじめてのClojure』（P80 - 81）

## Usage

5.5 「Leiningen テンプレートも利用」における内容<br>

　・project.clj で、-main 関数のあるネームスペース指定しない<br>
　・依存ライブラリを最新版に変更（「compojure」"1.1.6" ->  "1.6.1"、「ring/ring-defaults」"0.3.2"）<br>
　・-main 関数を明示しない。ring の固定ポート：3000 を使う。<br>

　・ブラウザからアクセス　その１<br>
　　ルートにアクセス（"http://localhost:3000"）<br>

　・ブラウザからアクセス　その２<br>
　　無効なアドレスにアクセス（"http://localhost:3000/foo"）<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ pwd<br>
chap5-5<br>

bash-3.2$ lein ring server<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
2021-12-06 13:38:27.688:INFO::main: Logging initialized @3460ms<br>
2021-12-06 13:38:32.549:INFO:oejs.Server:main: jetty-9.2.21.v20170120<br>
2021-12-06 13:38:32.618:INFO:oejs.ServerConnector:main: Started ServerConnector@5ca2f4ca{HTTP/1.1}{0.0.0.0:3000}<br>
2021-12-06 13:38:32.620:INFO:oejs.Server:main: Started @8392ms<br>
Started server on port 3000<br>

（強制的に、ブラウザへ移動する）<br>

■その１（ブラウザに固定文字を返す。リクエストをコンソールに出力）<br>
"Hello World"<br>

■その２（ブラウザに固定文字を返す）<br>
"Not found"<br>


## License

Copyright © 2021 FIXME
