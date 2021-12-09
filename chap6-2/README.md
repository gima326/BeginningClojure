# chap6-2

『はじめてのClojure』（P90 - 92）

## Usage

6.2 「データの操作」における内容<br>

　・依存ライブラリを最新版に変更（「com.novemberain/monger」"1.7.0" -> "3.1.0"）<br>
　・「MongoDB」への接続、ドキュメントの取得、挿入、更新、削除<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

■「ターミナル　その１」から「mongoDB」を起動する

bash-3.2$ mongosh<br>
Current Mongosh Log ID:	61adc206be0405f6ee5287f6<br>
Connecting to:		mongodb://127.0.0.1:27017/?directConnection=true&serverSelectionTimeoutMS=2000<br>
Using MongoDB:		5.0.3<br>
Using Mongosh:		1.1.2<br>

For mongosh info see: https://docs.mongodb.com/mongodb-shell/<br>


To help improve our products, anonymous usage data is collected and sent to MongoDB periodically (https://www.mongodb.com/legal/privacy-policy).<br>
You can opt-out by running the disableTelemetry() command.<br>

------<br>
   The server generated these startup warnings when booting:<br>
   2021-12-01T08:11:52.577+09:00: Access control is not enabled for the database. Read and write access to data and configuration is unrestricted<br>
------<br>

Warning: Found ~/.mongorc.js, but not ~/.mongoshrc.js. ~/.mongorc.js will not be loaded.<br>
  You may want to copy or rename ~/.mongorc.js to ~/.mongoshrc.js.<br>


test> show dbs<br>
admin          41 kB<br>
config       36.9 kB<br>
local        73.7 kB<br>
mbrs          115 kB<br>
monger-test  73.7 kB<br>
mydb         90.1 kB<br>
shorter      73.7 kB<br>
test         77.8 kB<br>
users        73.7 kB<br>
test><br>

==========================================<br>

test> use test<br>
already on db test<br>

test> show tables<br>
documents<br>
test<br>

test> db.documents.find()<br>
[<br>
  {<br>
    _id: ObjectId("61a0414d4005d2ff503ca517"),<br>
    name: 'gima',<br>
    age: '45'<br>
  }<br>
]<br>

==========================================<br>

test> use users<br>
switched to db users<br>
users><br>

users> show tables<br>
users<br>

==========================================<br>


■「ターミナル　その２」から「mongoDB」に接続する<br>

bash-3.2$ pwd<br>
chap6-2<br>

bash-3.2$ lein repl<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
WARNING: any? already refers to: #'clojure.core/any? in namespace: monger.collection, being replaced by: #'monger.collection/any?<br>
12月 09, 2021 10:58:05 午前 com.mongodb.diagnostics.logging.JULLogger log<br>
情報: Cluster created with settings {hosts=[127.0.0.1:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}<br>
12月 09, 2021 10:58:05 午前 com.mongodb.diagnostics.logging.JULLogger log<br>
情報: Opened connection [connectionId{localValue:1, serverValue:1}] to 127.0.0.1:27017<br>
12月 09, 2021 10:58:05 午前 com.mongodb.diagnostics.logging.JULLogger log<br>
情報: Monitor thread successfully connected to server with description ServerDescription{address=127.0.0.1:27017, type=STANDALONE, state=CONNECTED, ok=true, version=ServerVersion{versionList=[5, 0, 3]}, minWireVersion=0, maxWireVersion=13, maxDocumentSize=16777216, roundTripTimeNanos=1486717}<br>
nREPL server started on port 49803 on host 127.0.0.1 - nrepl://127.0.0.1:49803<br>
REPL-y 0.4.3, nREPL 0.6.0<br>
Clojure 1.10.0<br>
Java HotSpot(TM) 64-Bit Server VM 13.0.1+9<br>
    Docs: (doc function-name-here)<br>
          (find-doc "part-of-name-here")<br>
  Source: (source function-name-here)<br>
 Javadoc: (javadoc java-object-or-class-here)<br>
    Exit: Control+D or (exit) or (quit)<br>
 Results: Stored in vars *1, *2, *3, an exception in *e<br>

mongo.core=> (print-colls)<br>
12月 09, 2021 11:02:31 午前 com.mongodb.diagnostics.logging.JULLogger log<br>
情報: Opened connection [connectionId{localValue:2, serverValue:15}] to 127.0.0.1:27017<br>
{:_id #object[org.bson.types.ObjectId 0xf12520d 61a0414d4005d2ff503ca517], :name gima, :age 45}<br>
(nil)<br>


## License

Copyright © 2021 FIXME
