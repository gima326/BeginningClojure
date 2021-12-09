# chap7-3

『はじめてのClojure』（P108 - 109）

## Usage

7.3 「Ring アプリケーションのテスト」における内容<br>

　・依存ライブラリを最新版に変更（「compojure」"1.1.6" -> "1.6.1"、「lein-ring」"0.8.10" -> "0.12.5"、「ring/ring-mock」"0.1.5" -> "0.3.2"、「ring/ring-defaults」"0.3.2"）<br>
　・「Ring アプリケーション」のテスト<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ pwd<br>
chap7-3<br>

bash-3.2$ lein test<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>

lein test chap7-3.handler-test<br>

Ran 1 tests containing 3 assertions.<br>
0 failures, 0 errors.<br>

========================================<br>

bash-3.2$ lein ring server<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
2021-12-07 17:04:24.884:INFO::main: Logging initialized @2074ms<br>
2021-12-07 17:04:29.079:INFO:oejs.Server:main: jetty-9.2.21.v20170120<br>
2021-12-07 17:04:29.164:INFO:oejs.ServerConnector:main: Started ServerConnector@1727e0ec{HTTP/1.1}{0.0.0.0:3000}<br>
2021-12-07 17:04:29.165:INFO:oejs.Server:main: Started @6355ms<br>
Started server on port 3000<br>


## License

Copyright © 2021 FIXME
