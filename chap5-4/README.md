# chap5-4

『はじめてのClojure』（P79 - 80）

## Usage

5.4 「開発を爆速に！Ring プラグイン」における内容<br>

　・project.clj で、-main 関数のあるネームスペース指定しない<br>
　・依存ライブラリを最新版に変更（「http-kit」 "2.1.16" -> "2.5.3"、「ring」"1.2.1" -> "1.9.4"、「compojure」"1.1.6" ->  "1.6.2"）<br>
　・-main 関数を明示しない。ring の固定ポート：3000 を使う。<br>

　・ブラウザからアクセス　その１<br>
　　ルートにアクセス（"http://localhost:3000"）<br>

　・ブラウザからアクセス　その２<br>
　　ルート以外にアクセス（"http://localhost:3000/contacts"）<br>

　・ブラウザからアクセス　その３<br>
　　無効なアドレスにアクセス（"http://localhost:3000/foo"）<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ pwd<br>
chap5-4<br>

bash-3.2$ lein ring server<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
2021-12-06 12:13:46.976:INFO::main: Logging initialized @2527ms to org.eclipse.jetty.util.log.StdErrLog<br>
2021-12-06 12:13:50.987:INFO:oejs.Server:main: jetty-9.4.42.v20210604; built: 2021-06-04T17:33:38.939Z; git: 5cd5e6d2375eeab146813b0de9f19eda6ab6e6cb; jvm 13.0.1+9<br>
2021-12-06 12:13:51.068:INFO:oejs.AbstractConnector:main: Started ServerConnector@1a0e5c0c{HTTP/1.1, (http/1.1)}{0.0.0.0:3000}<br>
2021-12-06 12:13:51.069:INFO:oejs.Server:main: Started @6621ms<br>
Started server on port 3000<br>

（強制的に、ブラウザへ移動する）<br>

■その１（ブラウザに固定文字を返す。リクエストをコンソールに出力）<br>
"top"<br>

■その２（ブラウザに固定文字を返す。リクエストをコンソールに出力）<br>
"contacts"<br>

■その３（ブラウザに固定文字を返す）<br>
"Not found"<br>


## License

Copyright © 2021 FIXME
