# chap8-2

『はじめてのClojure』（P112 - 113）

## Usage

8.2 「フレームワーク『Luminus』でベースを簡単に作る」における内容<br>

　・軽量な web アプリケーション・フレームワーク「Luminus」を利用する<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ pwd<br>
chap8-2<br>

bash-3.2$ lein new luminus luminus-sample +http-kit +mongodb<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
Generating a Luminus project.<br>

bash-3.2$ lein ring server<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
'ring' is not a task. See 'lein help'.<br>

Did you mean this?<br>
         run<br>

bash-3.2$ lein run server<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
Retrieving ch/qos/logback/logback-classic/1.2.7/logback-classic-1.2.7.pom from central<br>
Retrieving ch/qos/logback/logback-parent/1.2.7/logback-parent-1.2.7.pom from central<br>
Retrieving ch/qos/logback/logback-core/1.2.7/logback-core-1.2.7.pom from central<br>
Retrieving markdown-clj/markdown-clj/1.10.7/markdown-clj-1.10.7.pom from clojars<br>
Retrieving selmer/selmer/1.12.45/selmer-1.12.45.pom from clojars<br>
Retrieving org/clojure/tools.namespace/1.1.1/tools.namespace-1.1.1.pom from central<br>
Retrieving org/clojure/tools.reader/1.3.6/tools.reader-1.3.6.pom from central<br>
Retrieving ch/qos/logback/logback-classic/1.2.7/logback-classic-1.2.7.jar from central<br>
Retrieving ch/qos/logback/logback-core/1.2.7/logback-core-1.2.7.jar from central<br>
Retrieving org/clojure/tools.namespace/1.1.1/tools.namespace-1.1.1.jar from central<br>
Retrieving org/clojure/tools.reader/1.3.6/tools.reader-1.3.6.jar from central<br>
Retrieving markdown-clj/markdown-clj/1.10.7/markdown-clj-1.10.7.jar from clojars<br>
Retrieving selmer/selmer/1.12.45/selmer-1.12.45.jar from clojars<br>
2021-12-08 11:28:22,378 [main] INFO  luminus-sample.env - <br>
-=[luminus-sample started successfully using the development profile]=- <br>
2021-12-08 11:28:22,957 [main] INFO  luminus.http-server - starting HTTP server on port 3000 <br>
2021-12-08 11:28:22,982 [main] INFO  luminus-sample.nrepl - starting nREPL server on port 7000 <br>
2021-12-08 11:28:23,010 [main] INFO  luminus-sample.core - #'luminus-sample.config/env started <br>
2021-12-08 11:28:23,011 [main] INFO  luminus-sample.core - #'luminus-sample.handler/init-app started <br>
2021-12-08 11:28:23,011 [main] INFO  luminus-sample.core - #'luminus-sample.handler/app-routes started <br>
2021-12-08 11:28:23,011 [main] INFO  luminus-sample.core - #'luminus-sample.core/http-server started <br>
2021-12-08 11:28:23,011 [main] INFO  luminus-sample.core - #'luminus-sample.core/repl-server started <br>


■ブラウザからアクセス（http://localhost:3000/）<br>

「luminus-sample」ページが表示される。<br>


## License

Copyright © 2021 FIXME
