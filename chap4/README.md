# chap4

『はじめてのClojure』（P61 - 69）

## Usage

4.3 「『STM』と『Ref』」における内容<br>

　・「短縮 URL サービス」の実装<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ pwd<br>
chap4<br>

bash-3.2$ lein repl<br>
（省略）<br>

shorter.models.links.core=> (add-link! "http://www.yahoo.co.jp")<br>
{"1" "http://www.yahoo.co.jp"}<br>

shorter.models.links.core=> (fetch-link "1")<br>
"http://www.yahoo.co.jp"<br>

shorter.models.links.core=> (fetch-link "2")<br>
nil<br>


## License

Copyright © 2021 FIXME
