function initialArray() {
	var seed = 1;
	function random() {
		var x = Math.sin(seed++) * 10000;
		return Math.floor(x);
	}

	var a = [];
	for(var i = 0; i < 10000; ++i) {
		a.push(random());
	}
	return a;
}

function somma(a){
    var som = 0;
    for(var j = 0; j < 10000; ++j){
        if(a[j] >= 0) {
        som = som + a[j];
        }
    }
    return som;
}

function ex_1(a,n) { //a --> array n --> 5070
      
    counter = 0;
    if(a.length == 0) {
    return counter;
        } else { 
    if(a[0] == n) {
        counter++;
    }
    return counter + ex_1(a.slice(1),n);    
    }

}

function ex_2(a) {

    var array = a.filter(function(x) {return x % 2 == 0;});
    var myarray = array.filter(function(x){return x > 0;});
    var arrRed = myarray.map(function(x) {return x * x;});
    var sumAll= arrRed.reduce(function(acc, x) {return acc + x;}, 0);
    return Math.sqrt(sumall);

}

function ex_5(a){

    var albero = new BST();
    a.forEach(function(x) {
        albero.add(x);
    });
   
    function cerca(ex_5, max){
        if(ex_5 == null) {
            return max;
        } else {
            max = ex_5.item;
            return cerca(ex_5.r, max);
        }
    }
    return cerca(albero.root, 0);
}