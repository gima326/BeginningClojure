### 「はじめてのClojure」ソースコード

* README.md ... これ。
* chap3-3   ... 3.3 「『Light Table』から『Leiningen』のプロジェクトに接続」（P53 - 56）
* chap3-4-1 ... 3.4 「エントリーポイント」（P56 - 57）
* chap3-4-2 ... 3.4 「エントリーポイント」（P57）
* chap3-5   ... 3.5 「『スタンドアローン・アプリケーション』化」（P58 - 59）
* chap4     ... 4.3 「『STM』と『Ref』」（P61 - 69）
* chap5-1   ... 5.1 「『Ring』とは」（P70 - 72）
* chap5-2   ... 5.2 「ハンドラ」（P73 - 76）
* chap5-3   ... 5.3 「Compojure で URL ルーティング」（P76 - 78）
* chap5-4   ... 5.4 「開発を爆速に！Ring プラグイン」（P79 - 80）
* chap5-5   ... 5.5 「Leiningen テンプレートも利用」（P80 - 81）
* chap5-6   ... 5.6 「モデルの設計」（P82 - 86）
* chap6-1   ... 6.1 「『MongoDB』とは」（P87 - 90）
* chap6-2   ... 6.2 「データの操作」（P90 - 92）
* chap6-3-1 ... 6.3 「ユーザー管理」（P93 - 98）
* chap6-3-2 ... 6.3 「ユーザー管理」（P93 - 98）
* chap6-4-1 ... 6.4 「『URL 短縮サービス』を『MongoDB』に対応させる」（P99）
* chap6-4-2 ... 6.4 「『URL 短縮サービス』を『MongoDB』に対応させる」（P99）
* chap6-5   ... 6.5 「『リレーショナル・データベース』との接続」（P100 - 101）
* chap7-2   ... 7.2 「『clojure.test』を使ったテスト」（P103 - 108）
* chap7-3   ... 7.3 「Ring アプリケーションのテスト」（P108 - 109）
* chap8-1   ... 8.1 「『テンプレート・エンジン』を組み込もう」（P110 - 112）
* chap8-2   ... 8.2 「フレームワーク『Luminus』でベースを簡単に作る」（P112 - 113）
* chap8-3   ... 8.3 「『Heroku』でのサービス運用」（P114 - 120）
* docs      ... 「正誤表」など。

* original  ... オリジナルのソースコード


### 正誤表

2021 年末に本書『はじめてのClojure』を読んで、見つけた誤りを追記しました。

[正誤表](https://gima326.github.io/BeginningClojure/errata.html)


### 2021 年末、『はじめてのClojure』（登尾徳誠：Tokusei Noborio著）をはじめて読んでみたのだが…。

アマゾンの購入履歴によれば、発売日からひと月経っていない [ 2014/6/4 ] には購入していたらしい。<br>
それから６〜７年くらい「積ん読」状態だったわけだ。<br>

…でも、それもむべなるかな、といふもの。<br>
まずもって、この装丁デザインのひどさ（「工学社」の本すべてに言えることだけど）。<br>
手にとったときに伝わる存在感、雰囲気の軽薄さ（Stuwart Halloway著　川合史郎訳の『プログラミング Clojure』比）。<br>

「…まぁ、1,900 円（外税）という金額だし」<br>

真っ白な心でページを繰ってみるも、誤字・脱字のほうから、ぽんぽんと目に飛び込んでくる。<br>
それが「文体」と相まって、読もうとする僕の意欲は、毎度ポッキリとくじかれてきた、というわけだ。<br>

「ほかに読むべき本はたくさんあるしねぇ…」<br>

そうやって、平積みの山に戻してきたのでした。<br>
それが、なんの気の迷いか 2021 年も残り n ヶ月という時期に（そうそう、オリンピックって開催したんだっけ？）、<br>
腹を括って、読み通してみました。…何か悪いものでも食べたかなぁ？<br>

冗談はさておき。<br>
たぶんそれは、なんだか浮き世離れした「関数型プログラミング」、「マクロ」、「モナド」、「非決定計算」だとか。<br>
そのあたりに足を踏み入れ、腰のあたりまで浸かったことからだろう。<br>

「…で、これで何ができるわけ？」<br>

その方面については、ちょっと途方にくれておるところですが、…ま、それは置いといて（苦笑）。<br>
そんなときに手にとったのが、この『はじめてのClojure』でした。つまり、Clojure で解決できる「現実的な問題」って？<br>
そのへんのヒントや、見通しなど得られないかな、と。そういうわけです。<br>

「また逢えたね」<br>

挨拶もそこそこに、ページをめくるも、その悪印象はまったく色褪せることはなかった（苦笑）。<br>
誤字脱字の山。そして、動かないサンプルコード。誤字脱字のせい？経年による変化のせいなのぉ？もはや判別できない。<br>
そして、出版社のサポートページも、著者の GitHub も、書籍のクオリティーを反映しているだけの代物。<br>
まったく頼りになりゃしません。憤死しそうになりましたよ、ええ。<br>
The Last Man Standing。<br>

「コードすべてを動くようにしてやろう！細大漏らさず、この本を味わい尽くしてやろう！」<br>

半ばやけくそでそう決意を固め、短くも過酷なこの道のりを踏破した。<br>
思いっきり眉間にしわをよせながら、ね。<br>

その間、…もしも、と思ったものです。<br>
この本が半額くらいの電子書籍だったなら、と。<br>
たぶん適当につまみ食いして済ませて、時間を無駄にすることもなかったろうな、と。<br>
そして、動くようコードを書き直したり、正誤表を刷新したり（僕ひとりで 26 個見つけてやったぞ、このやろー！）、<br>
こんなふーに恨み辛みを書き連ねることもなかったろうに、とも。<br>

この本は、お世辞にも「名著」とは言いがたい出来です。<br>
…ですが、ちゃんと読み終えた今、本書には、それらの欠点を補って余りある魅力があることに気がつきました。<br>
それは、まるで『The Velvet Underground and Nico』（1967年）の伝説のようだな、と。<br>
曰く、「当時、このレコードは売れなかったが、聞いた全員がバンドを始めた」。<br>

つまり、本書は、読者の「なにかしたくなる」スイッチを押すんだろう（直したくなる、か：苦笑）。<br>
「これ、動かないんですけどぉ？」と。<br>

例示しようか？<br>
なんじゃ、こんなに醜いコード！？（P68 - 69）<br>
てゆーか、これじゃビルドすら通らないだろ！（P99）<br>

…と、そんな調子。最後の最後（P120）まで、ね（一切、誇張してないからねっ！）。<br>
でも、それでも、古びてはいるものの、まだ多少の手直しくらいでサンプルコードが動くことを確認できます。<br>
そしてその間の読者の暗闘は、本書の記述、範疇をこえて、その後の人生においても有用でしょう。<br>
中古住宅のリフォーム業者になったような、なんとも言えない気分とともに（苦笑）。<br>

文句ばかり言ってますが、Clojure の文法を説明している「第２章」（P15 - 47）が好きです。<br>
コンパクトで、よくまとまっていて、ちょっと感嘆しました。<br>

そして、これまでなんとなくで使ってきた Leiningen の基礎（「第３章」）を勉強しなおすとこからはじまり、<br>
以降、Web まわりの処理（ルーティングなど）と、それらのためのライブラリ、フレームワーク群、RDB、NoSQL への接続、<br>
Heroku へのデプロイ、と広範なトピックが目白押しです。<br>
それらが、この 130 ページ弱のなかに収まっている。<br>
これはちょっと驚きです。<br>

出版社の作業の粗さや、著者のこなれていない語り口のせいで、本書が読まれないのはもったいない。<br>
…まぁ、その欠点の威力、実績については、他ならぬ僕自身がよく知っているわけで（ええ、７年ほっぽってました）。<br>
加えて、経年により古びてしまっている部分もある。<br>

…だったら、古びたとこは俺っちがアップデートしてやるよ、と。<br>
そして、この駄文とこの吹きだまりが誰かの目に止まり、もしも、こう思わせられたなら？<br>

「コイツ、なんでこんな駄本にネチネチ言ってるわけ？」<br>
「2021 年に、なにやってんの！？」<br>
「もう、令和だよ！？」<br>

うまくすれば誰かの好奇心をくすぐるんじゃないかな。<br>
そして、この本の欠点をいくらかでも軽減しておけば、「はじめて」の印象がこれ以上悪くなることはないだろう、と。<br>
こうしてお節介を焼いてみたわけだけれど、…どうだろう、出来てるかなぁ？<br>

最後に。<br>
つぎに続く読者が、あまりのフラストレーションに憤死しそうになったとき、いくらかでも助けになったなら。<br>
そして、「あなただけじゃないよ」と伝えられたなら、この労力も報われるというものです。<br>

僕が、本書の「最後の読者」とならないことを願いつつ（苦笑）。<br>
お読みいただき、ありがとうございます。<br>