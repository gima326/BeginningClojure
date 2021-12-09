# chap3-3

『はじめてのClojure』（P53 - 56）

## Usage

3.3 「『Light Table』から『Leiningen』のプロジェクトに接続」における内容<br>

　・プロジェクトの生成<br>
　・repl 接続（また、それにより [ ~/chap3-3/target/classes/META-INF/maven/chap3-3/chap3-3/pom.properties ] 生成されること）<br>
　・プロジェクトで定義した「ネームスペース」、「関数」呼び出し<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ lein new first-project<br>
（省略）<br>

bash-3.2$ mv first-project/ chap3-3/<br>
bash-3.2$ cd chap3-3<br>
bash-3.2$ lein repl<br>
（省略）<br>

user=> (require '[first-project.hoge :as hoge])<br>
nil<br>
user=> (hoge/inc100 23)<br>
123<br>


## License

Copyright © 2021 FIXME
