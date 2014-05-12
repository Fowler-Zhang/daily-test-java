var casper = require('casper').create({
verbose: true,
logLevel: "debug"
});


casper.start('http://fd1-www.leclercdrive.fr/057701/courses/pgeWMEL009_Courses.aspx#RS284323');

// here i simulate the click on "Fruits et légumes"
casper.evaluate(function() {
   __doPostBack('objLienReceptdionEvenement','2@@284323');
});


casper.then(function() {
console.log(' new location is ' + this.getCurrentUrl());
});

casper.run();