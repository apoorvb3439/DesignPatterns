"use strict";

function cacheDecorator(func){

    let m = new Map();

    return function (x) {
        if(m.has(x)){
            return m.get(x);
        }else{
            let val=func(x);
            m.set(x,val);
            return m.get(x);
        }
    };

}

function factorial(n){
	if(n==0){
		return 0;
	}
	if(n==1){
		return 1;
	}
	
	document.write("<p>factorial called for "+n+"\n</p>");
    return factorial(n-1)+factorial(n-2);
}

factorial=cacheDecorator(factorial);

document.write("<h1>Factorial called for 10th first time</h1>");
document.write(factorial(10)+" ");

document.write("<h1>Factorial called for 10th second time</h1>");
document.write(factorial(10)+" ");

function powerOf2(x){
    if(x==0){
		return 1;
	}
	document.write("<p>PowerOf2 called with exponent "+x+"\n</p>");
	return 2*powerOf2(x-1);
}

powerOf2=cacheDecorator(powerOf2);

document.write("<h1>PowerOf2 called with exponent 10 first time</h1>");
document.write(powerOf2(10)+" ");

document.write("<h1>PowerOf2 called with exponent 10 second time</h1>");
document.write(powerOf2(10)+" ");
