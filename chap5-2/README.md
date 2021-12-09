# chap5-2

『はじめてのClojure』（P73 - 76）

## Usage

5.2 「ハンドラ」における内容<br>

　・project.clj に追記（依存ライブラリ、-main 関数のあるネームスペース指定）<br>
　・依存ライブラリを最新版に変更（「http-kit」 "2.1.16" -> "2.5.3"、「ring」"1.2.1" -> "1.9.4"）<br>

　・ブラウザからアクセス　その２<br>

　　リクエストの内容をブラウザに返す。<br>
　　app2：（"http://localhost:8081"）<br>

　・ブラウザからアクセス　その３<br>

　　リクエストの内容をコンソールに出力。<br>
 　　app3：（"http://localhost:8082"）<br>

　・ブラウザからアクセス　その４<br>

　　リクエストから特定の項目を取り出し、ブラウザに返す。<br>
 　　app4：（"http://localhost:8083/abc/def?hoge=1234&fuga=5678"）<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ pwd<br>
chap5-2<br>

bash-3.2$ lein run<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>

（以降、待ち状態。ブラウザからアクセスがあれば、下記、文字列が出力される）<br>

■その２（ブラウザにリクエストを返す）<br>
[:remote-addr "127.0.0.1"][:headers {"sec-fetch-site" "none", "host" "localhost:8081", "user-agent" "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.15; rv:94.0) Gecko/20100101 Firefox/94.0", "cookie" "drawbridge-session=6e113f1a-4989-4887-ae5b-8660d454701f", "sec-fetch-user" "?1", "connection" "keep-alive", "upgrade-insecure-requests" "1", "accept" "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "accept-language" "ja,en-US;q=0.7,en;q=0.3", "sec-fetch-dest" "document", "accept-encoding" "gzip, deflate", "sec-fetch-mode" "navigate"}][:async-channel #object[org.httpkit.server.AsyncChannel 0x40098d70 "/127.0.0.1:8081<->/127.0.0.1:52672"]][:server-port 8081][:content-length 0][:websocket? false][:content-type nil][:character-encoding "utf8"][:uri "/"][:server-name "localhost"][:query-string nil][:body nil][:scheme :http][:request-method :get]<br>


■その３（レスポンスとして、:body に固定の文字列を設定し、ブラウザに返す。<br>
　コンソール側にはポート番号（:server-port）ちがいで、上記の内容が出力される）<br>
Hello, ring!<br>

■その４（リクエストマップから特定の項目を取得し、レスポンスとしてブラウザに返す）<br>
uri: [ /abc/def ]<br>
query-string: [ hoge=1234&fuga=5678 ] <br>


## License

Copyright © 2021 FIXME
