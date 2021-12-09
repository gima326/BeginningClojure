# chap6-5

『はじめてのClojure』（P100 - 101）

## Usage

6.5 「『リレーショナル・データベース』との接続」における内容<br>

　・「MySQL」（ver. 8.0.27）のインストール<br>
　・依存ライブラリを最新版に変更（「org.clojure/java.jdbc」"0.3.3" -> "0.7.12"、「mysql/mysql-connector-java」"8.0.22"）<br>
　・「MySQL」への接続<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

■「ターミナル　その１」から「MySQL」を起動する

bash-3.2$ mysql.server start<br>
Starting MySQL<br>
 SUCCESS! <br>

bash-3.2$ 2021-12-07T04:32:48.6NZ mysqld_safe A mysqld process already exists<br>

bash-3.2$ mysql -u root -p<br>
Enter password: <br>
Welcome to the MySQL monitor.  Commands end with ; or \g.<br>
Your MySQL connection id is 11<br>
Server version: 8.0.27 Homebrew<br>

Copyright (c) 2000, 2021, Oracle and/or its affiliates.<br>

Oracle is a registered trademark of Oracle Corporation and/or its<br>
affiliates. Other names may be trademarks of their respective<br>
owners.<br>

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.<br>

mysql> <br>



■「ターミナル　その２」で REPL を起動し、「MySQL」に接続する<br>

bash-3.2$ pwd<br>
chap6-5<br>

bash-3.2$ lein repl<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
WARNING: update already refers to: #'clojure.core/update in namespace: jdbc.core, being replaced by: #'jdbc.core/update
nREPL server started on port 57785 on host 127.0.0.1 - nrepl://127.0.0.1:57785<br>
REPL-y 0.4.3, nREPL 0.6.0<br>
Clojure 1.10.0<br>
Java HotSpot(TM) 64-Bit Server VM 13.0.1+9<br>
    Docs: (doc function-name-here)<br>
          (find-doc "part-of-name-here")<br>
  Source: (source function-name-here)<br>
 Javadoc: (javadoc java-object-or-class-here)<br>
    Exit: Control+D or (exit) or (quit)<br>
 Results: Stored in vars *1, *2, *3, an exception in *e<br>

jdbc.core=> (s "gima326")<br>
{:id 1, :name gima326, :age 45, :email gima326@google.com}<br>
(nil)<br>


## License

Copyright © 2021 FIXME
