# chap8-1

『はじめてのClojure』（P110 - 112）

## Usage

8.1 「『テンプレート・エンジン』を組み込もう」における内容<br>

　・HTML テンプレートエンジン「cuma」（クマー）の利用<br>
　・依存ライブラリを最新版に変更（「cuma」"0.0.6" -> "0.1.1"）<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ pwd<br>
chap8-1<br>

bash-3.2$ lein repl<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
nREPL server started on port 60517 on host 127.0.0.1 - nrepl://127.0.0.1:60517<br>
REPL-y 0.4.3, nREPL 0.6.0<br>
Clojure 1.10.0<br>
Java HotSpot(TM) 64-Bit Server VM 13.0.1+9<br>
    Docs: (doc function-name-here)<br>
          (find-doc "part-of-name-here")<br>
  Source: (source function-name-here)<br>
 Javadoc: (javadoc java-object-or-class-here)<br>
    Exit: Control+D or (exit) or (quit)<br>
 Results: Stored in vars *1, *2, *3, an exception in *e<br>

cuma-sample.core=> <br>

cuma-sample.core=> (r {:name "gima"})<br>
"Hello, gima!"<br>

cuma-sample.core=> (r2 {:name "world"})<br>
"Hello, WORLD!"<br>

cuma-sample.core=> (html {:html "<html><body>hoge</body></html>"})<br>
"&lt;html&gt;&lt;body&gt;hoge&lt;/body&gt;&lt;/html&gt;"<br>

cuma-sample.core=> (raw-html {:html "<html><body>hoge</body></html>"})<br>
"<html><body>hoge</body></html>"<br>

cuma-sample.core=> (cuma-if {:msg "hello, if"})<br>
" <div>hello, if</div> "<br>

cuma-sample.core=> (cuma-if {:msg nil})<br>
""<br>

cuma-sample.core=> (cuma-if {:msg2 "hello, if"})<br>
""<br>


## License

Copyright © 2021 FIXME
