var casper = require("casper").create();

casper.start('http://jt.hbjxw.com.cn/login.aspx');

casper.waitFor(function check() {
	return this.visible('span[id=lbValid]');
}, function then() {
	auth_code = this.fetchText('span[id=lbValid]')
	this.fill('form[id=form1]', {
		'stuid' : 'xxxx',
		'psw' : 'xxxx',
		'code' : auth_code
	}, false);
	this.click('input[id=ImageButton1]');
}, function timeout() {
	this.echo('login time out');
	casper.exit();
}, 500);

casper.waitForUrl('http://jt.hbjxw.com.cn/default.aspx', function() {
	console.log('login success...');
}, function onTimeout() {
	console.log('login timeout. try again.');
	casper.exit();
}, timeout = 1000);


casper
		.thenOpen('http://jt.hbjxw.com.cn/book1bycoach.aspx?traintype=%E5%9C%BA%E5%86%85%E5%A4%96%E8%B7%AF&coachname=%E5%88%98%E6%B5%B7%E6%B3%A2(%E5%9C%BA%E5%86%85%E5%A4%96)');

casper.waitFor(function check() {
	return this.visible('a[id="20"]');
}, function then() {
	this.echo('Cars appearred.');
}, function timeout() {
	this.echo('select time out')
	casper.exit()
}, 1000);

casper.thenEvaluate(function() {
	__doPostBack('20', '');
});
casper.thenEvaluate(function() {
	__doPostBack('21', '');
});
casper.thenEvaluate(function() {
	__doPostBack('22', '');
});
casper.thenEvaluate(function() {
	__doPostBack('23', '');
});
casper.thenEvaluate(function() {
	__doPostBack('24', '');
});
casper.thenEvaluate(function() {
	__doPostBack('25', '');
});
casper.thenEvaluate(function() {
	__doPostBack('26', '');
});
casper.thenEvaluate(function() {
	__doPostBack('27', '');
});
casper.thenEvaluate(function() {
	__doPostBack('28', '');
});
casper.thenEvaluate(function() {
	__doPostBack('29', '');
});

casper.run();