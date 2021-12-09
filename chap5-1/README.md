# chap5-1

『はじめてのClojure』（P70 - 72）

## Usage

5.1 「『Ring』とは」における内容<br>

　・project.clj に追記（依存ライブラリ、-main 関数のあるネームスペース指定）<br>
　・依存ライブラリを最新版に変更（「http-kit」 "2.1.16" -> "2.5.3"）<br>
　・ブラウザからアクセス（"http://localhost:8080/"）<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ pwd<br>
chap5-1<br>

bash-3.2$ lein run<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>

（以降、待ち状態。ブラウザからアクセスがあれば、下記、文字列が出力される）<br>

Hello, ring!<br>


## License

Copyright © 2021 FIXME
