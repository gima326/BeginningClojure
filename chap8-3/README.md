# chap8-3

『はじめてのClojure』（P114 - 120）

## Usage

8.3 「『Heroku』でのサービス運用」における内容<br>

　・依存ライブラリを最新版に変更（多数あるので、[ ./hw_heroku/project.clj ]のコメントを参照）<br>
　・「Heroku」へのログイン<br>
　・「Heroku」へのリポジトリ作成<br>
　・「Heroku」へのデプロイ<br>
　・「Heroku」に nREPL で接続する（※repl に式を投げて eval した結果を受け取る、サンプルだが、実現できなかった）<br>


## Prerequisites

I used [Leiningen][1] 2.9.1 on Java 13.0.1 Java HotSpot(TM) 64-Bit Server VM<br>

[1]: https://github.com/technomancy/leiningen<br>


## Running

bash-3.2$ pwd<br>
chap8-3<br>

bash-3.2$ lein new heroku hw_heroku<br>
Java HotSpot(TM) 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.<br>
Generated new Heroku project in hw_heroku directory.<br>


■プロジェクト生成後、project.clj を編集しないとビルドが通らない<br>
　各種、試行錯誤の結果を[ ./hw_heroku/project.clj ]にコメントに残したので、そちらを参照ください。<br>


■「Heroku」にログイン<br>

bash-3.2$ pwd<br>
hw_heroku/<br>

bash-3.2$ heroku login<br>
heroku: Press any key to open up the browser to login or q to exit:<br>
Opening browser to https://cli-auth.heroku.com/auth/cli/browser/71bb7c55-b0fc-462c-bac5-77cbb0e5b494?requestor=SFMyNTY.g2gDbQAAAAwxMDYuMTU0LjEuMzduBgCQwqmYfQFiAAFRgA.xA_-HCX2Eey8xaXjW0Ny0woEY0rlP-3543Vx_K9SRzc<br>
Logging in... done<br>
Logged in as [ Heroku に登録したメールアドレス ]<br>


■「Heroku」にデプロイ<br>

bash-3.2$ ls .git<br>
ls: .git: No such file or directory<br>

bash-3.2$ git init<br>
hint: Using 'master' as the name for the initial branch. This default branch name<br>
hint: is subject to change. To configure the initial branch name to use in all<br>
hint: of your new repositories, which will suppress this warning, call:<br>
hint:<br>
hint: 	git config --global init.defaultBranch <name><br>
hint:<br>
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and<br>
hint: 'development'. The just-created branch can be renamed via this command:<br>
hint:<br>
hint: 	git branch -m <name><br>
Initialized empty Git repository in hw_heroku/.git/<br>

bash-3.2$ git add<br>
bash-3.2$ git commit -m "Initial commit"<br>

bash-3.2$ heroku apps:create<br>

bash-3.2$ git push heroku master<br>
bash-3.2$ heroku open<br>


■「Heroku」上の replの使用ユーザー、パスワードを登録する<br>

bash-3.2$ heroku config:add REPL_USER=[...] REPL_PASSWORD=[...]<br>
bash-3.2$ lein repl :connect http://$REPL_USER:$REPL_PASSWORD@hw_heroku.herokuapp.com/repl<br>


■ブラウザの URL 指定（"~/repl"）で、「Heroku」上の repl へ接続する<br>

式「(+ 2 3)」とオペレータ「eval」を repl に渡して、式を評価した結果を取得する、というものだが、実現できなかった。<br>


■ローカル環境から、「Heroku」上の repl へ接続する<br>

bash-3.2$ pwd<br>
hw_heroku/<br>

bash-3.2$ heroku run lein repl<br>
Running lein repl on ⬢ shrouded-savannah-28680... up, run.6165 (Free)<br>
Downloading Leiningen to /app/.lein/self-installs/leiningen-2.9.1-standalone.jar now...<br>
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current<br>
                                 Dload  Upload   Total   Spent    Left  Speed<br>
100   663  100   663    0     0   6835      0 --:--:-- --:--:-- --:--:--  6835<br>
100 13.9M  100 13.9M    0     0  29.1M      0 --:--:-- --:--:-- --:--:-- 29.1M<br>

Retrieving environ/environ.lein/0.2.1/environ.lein-0.2.1.pom from clojars<br>
Retrieving environ/environ.lein/0.2.1/environ.lein-0.2.1.jar from clojars<br>
Retrieving org/clojure/clojure/1.10.0/clojure-1.10.0.pom from central<br>
Retrieving org/clojure/spec.alpha/0.2.176/spec.alpha-0.2.176.pom from central<br>

（以下、166 行分省略）<br>

Retrieving hiccup/hiccup/1.0.3/hiccup-1.0.3.jar from clojars<br>
nREPL server started on port 39972 on host 127.0.0.1 - nrepl://127.0.0.1:39972<br>
REPL-y 0.4.3, nREPL 0.6.0<br>
Clojure 1.10.0<br>
OpenJDK 64-Bit Server VM 1.8.0_312-heroku-b05<br>
    Docs: (doc function-name-here)<br>
          (find-doc "part-of-name-here")<br>
  Source: (source function-name-here)<br>
 Javadoc: (javadoc java-object-or-class-here)<br>
    Exit: Control+D or (exit) or (quit)<br>
 Results: Stored in vars *1, *2, *3, an exception in *e<br>

hw_heroku.web=><br>


## License

Copyright © 2021 FIXME
