var casper = require("casper").create({
	verbose: true,
	logLevel: "debug"
});
casper.start('http://10.211.55.7:3000/');

casper.waitFor(function check() {
	return this.visible('a[id="linka"]');
}, function then() {
	console.log('I find linka!');
});

casper.thenEvaluate(function() {
	document.querySelector('a[id="linka"]').innerHTML = 'abc';
});


casper.then(function() {
	console.log(this.getHTML('a[id="linka"]'));
});

casper.run()