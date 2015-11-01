//Francesco Celato

//Esercizio1
function ex_1_I(array){
    somma = 0;
    for(i = 0; i < array.length; i++){
        if(array[i] < 0){
          return somma;
        } else {
        somma = somma + array[i];
        }
    }
    return somma;
}

//Esercizio1 Ricorsivo
function ex_1_R(array){
    if(array.length == 0 || array[0] < 0){
        return 0;
    } else {
        return array[0] + somma(array.slice(1));
    }
}

//Esercizio2 (svolto in classe)
function ex_2_I(n){
    var tot = 0;
    for(i = 0; i < n; ++i) {
        tot = tot + 1 + 2 * i;
    }
    return tot;
}

//Esercizio2 Ricorsivo (svolto in classe)
function ex_2_R(n) {
    if (n == 0) {
        return 0;
    } else {
        return 2 * n - 1 + ex_2_R(n - 1);
    }
}

//Esercizio2.1
//Tempo O(n)
//Spazio O(1)
function ex_2_1_I(n){
    sum = 0;
    for(j = 0; j <= n; j++){
        if(j%2 != 0){
            sum = sum + j;
        }
    }
    return sum;
}

//Esercizio3
//Tempo O(n)
//Spazio O(1)
function ex_3_I(array){
    som_Array = 0;
    for(k = 0; k < array.length; k++){
        som_Array = som_Array + array[k];
    }
    return som_Array/array.length;
}

//Esercizio4
//Tempo O(n)
//Spazio O(1)
function ex_4_I(primo_valore,secondo_valore){
    sum_Val = 0;
    if(primo_valore < secondo_valore){
        for(a = primo_valore; a <= secondo_valore; a++){
            sum_Val = sum_Val + a;
        }
    } else {
        for(b = secondo_valore; b <= primo_valore; b++){
            sum_Val = sum_Val + b;
        }
    }
    return sum_Val;
}

//Esercizio5
//Tempo O(n)
//Spazio O(1)
function ex_5_I(prim_Val,sec_Val){
    somma_Molt = 0;
    for(t = 0; t < sec_Val; t++){
        somma_Molt = somma_Molt + prim_Val;
    }
    return somma_Molt;
}

//Esercizio6
//Tempo O(n)
//Spazio O(1)
function ex_6_I(v1,v2){
    quoziente = 0;

    while(v1 >= v2){
            v1 = v1-v2;
            quoziente++;
    }    
    return console.log('Ci sta ' + quoziente + ' volta' + ', con resto ' + v1 + ';');
}

//Esercizio7
//Tempo O(n)
//Spazio O(1)
function ex_7_I(x,y){
    molt = x
    while(y>1){
        molt = ex_5_I(molt,x);
        y--;
    }
    return molt;
}

