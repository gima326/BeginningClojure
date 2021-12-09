# chap6-4-1

『はじめてのClojure』（P99）

## Usage

6.4 「『URL 短縮サービス』を『MongoDB』に対応させる」における内容<br>

　・依存ライブラリを最新版に変更（「com.novemberain/monger」"1.7.0" -> "3.1.0"）<br>
　・「URL 短縮サービス」の最終形。
　・「MongoDB」への接続
　・プライマリーキー「ID」の生成方法いろいろ。<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ pwd<br>
chap6-4-1<br>

bash-3.2$ lein repl<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
WARNING: any? already refers to: #'clojure.core/any? in namespace: monger.collection, being replaced by: #'monger.collection/any?<br>
12月 07, 2021 12:44:56 午後 com.mongodb.diagnostics.logging.JULLogger log<br>
情報: Cluster created with settings {hosts=[127.0.0.1:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}<br>
12月 07, 2021 12:44:57 午後 com.mongodb.diagnostics.logging.JULLogger log<br>
情報: Opened connection [connectionId{localValue:1, serverValue:41}] to 127.0.0.1:27017<br>
12月 07, 2021 12:44:57 午後 com.mongodb.diagnostics.logging.JULLogger log<br>
情報: Monitor thread successfully connected to server with description ServerDescription{address=127.0.0.1:27017, type=STANDALONE, state=CONNECTED, ok=true, version=ServerVersion{versionList=[5, 0, 3]}, minWireVersion=0, maxWireVersion=13, maxDocumentSize=16777216, roundTripTimeNanos=12406840}<br>
nREPL server started on port 57457 on host 127.0.0.1 - nrepl://127.0.0.1:57457<br>
REPL-y 0.4.3, nREPL 0.6.0<br>
Clojure 1.10.0<br>
Java HotSpot(TM) 64-Bit Server VM 13.0.1+9<br>
    Docs: (doc function-name-here)<br>
          (find-doc "part-of-name-here")<br>
  Source: (source function-name-here)<br>
 Javadoc: (javadoc java-object-or-class-here)<br>
    Exit: Control+D or (exit) or (quit)<br>
 Results: Stored in vars *1, *2, *3, an exception in *e<br>

shorter.models.links-db=> (get-urls)<br>
12月 07, 2021 12:45:16 午後 com.mongodb.diagnostics.logging.JULLogger log<br>
情報: Opened connection [connectionId{localValue:2, serverValue:42}] to 127.0.0.1:27017<br>
({:_id #object[org.bson.types.ObjectId 0x28ec5732 "619f31204005d2e492983d6b"], :upsert true} {:_id #object[org.bson.types.ObjectId 0x5ef866ab "619f32334005d2e4c2f2c04a"], :url "google"} {:_id #object[org.bson.types.ObjectId 0x474cd6c9 "619f33094005d2e4ec763ce0"], :url "Clojure"} {:_id "current-id", :value 9} {:_id #object[org.bson.types.ObjectId 0x203921e9 "619fb1644005d2f4bd62d6e4"], :url "aiueo"})<br>

shorter.models.links-db=> (add-link! "www.yahoo.co.jp")<br>
"61aedb5785937286297d3035:9"<br>

shorter.models.links-db=> (fetch-link "61aedb5785937286297d3035")<br>
"www.yahoo.co.jp"<br>


## License

Copyright © 2021 FIXME
