# chap6-1

『はじめてのClojure』（P87 - 90）

## Usage

6.1 「『MongoDB』とは」における内容<br>

　・「MongoDB」（ver. 5.0.3）のインストール<br>
　・依存ライブラリを最新版に変更（「com.novemberain/monger」"1.7.0" -> "3.1.0"）<br>
　・「MongoDB」への接続<br>


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


■「ターミナル　その２」で REPL を起動し、「mongoDB」に接続する<br>

bash-3.2$ pwd<br>
chap6-1<br>

bash-3.2$ lein repl<br>
（省略）<br>

mongo.core=> (baz "test")<br>
12月 06, 2021 5:05:53 午後 com.mongodb.diagnostics.logging.JULLogger log<br>
情報: Cluster created with settings {hosts=[localhost:27017], mode=SINGLE, requiredClusterType=UNKNOWN, serverSelectionTimeout='30000 ms', maxWaitQueueSize=500}<br>
{:conn #object[com.mongodb.MongoClient 0x3d799df5 "Mongo{options=MongoClientOptions{description='null', readPreference=primary, writeConcern=WriteConcern{w=null, wTimeout=null ms, fsync=null, journal=null, readConcern=com.mongodb.ReadConcern@0, codecRegistry=org.bson.codecs.configuration.ProvidersCodecRegistry@5078c0fb, commandListeners=[], clusterListeners=[], serverListeners=[], serverMonitorListeners=[], minConnectionsPerHost=0, maxConnectionsPerHost=100, threadsAllowedToBlockForConnectionMultiplier=5, serverSelectionTimeout=30000, maxWaitTime=120000, maxConnectionIdleTime=0, maxConnectionLifeTime=0, connectTimeout=10000, socketTimeout=0, socketKeepAlive=false, sslEnabled=false, sslInvalidHostNamesAllowed=false, alwaysUseMBeans=false, heartbeatFrequency=10000, minHeartbeatFrequency=500, heartbeatConnectTimeout=20000, heartbeatSocketTimeout=20000, localThreshold=15, requiredReplicaSetName='null', dbDecoderFactory=com.mongodb.DefaultDBDecoder$1@7725cf44, dbEncoderFactory=com.mongodb.DefaultDBEncoder$1@1d75d22a, socketFactory=javax.net.DefaultSocketFactory@bcdbaca, cursorFinalizerEnabled=true, connectionPoolSettings=ConnectionPoolSettings{maxSize=100, minSize=0, maxWaitQueueSize=500, maxWaitTimeMS=120000, maxConnectionLifeTimeMS=0, maxConnectionIdleTimeMS=0, maintenanceInitialDelayMS=0, maintenanceFrequencyMS=60000}, socketSettings=SocketSettings{connectTimeoutMS=10000, readTimeoutMS=0, keepAlive=false, receiveBufferSize=0, sendBufferSize=0}, serverSettings=ServerSettings{heartbeatFrequencyMS=10000, minHeartbeatFrequencyMS=500, serverListeners='[]', serverMonitorListeners='[]'}, heartbeatSocketSettings=SocketSettings{connectTimeoutMS=20000, readTimeoutMS=20000, keepAlive=false, receiveBufferSize=0, sendBufferSize=0}}}"], :db #object[com.mongodb.DB 0x37156823 "DB{name='test'}"]}12月 06, 2021 5:05:53 午後 com.mongodb.diagnostics.logging.JULLogger log<br>
情報: Opened connection [connectionId{localValue:4, serverValue:12}] to localhost:27017<br>

12月 06, 2021 5:05:53 午後 com.mongodb.diagnostics.logging.JULLogger log<br>
情報: Monitor thread successfully connected to server with description ServerDescription{address=localhost:27017, type=STANDALONE, state=CONNECTED, ok=true, version=ServerVersion{versionList=[5, 0, 3]}, minWireVersion=0, maxWireVersion=13, maxDocumentSize=16777216, roundTripTimeNanos=1200855}<br>


## License

Copyright © 2021 FIXME
