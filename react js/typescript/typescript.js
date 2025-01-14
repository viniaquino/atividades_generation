console.log("hello world!");
var numero1 = 3;
var numero2 = 1;
var resul;
resul = numero1 + numero2;
console.log(resul);
;
var numeros = new Array(1, 5, 6, 8, 9);
console.table(numeros.sort());
function subtract(numero3, numero4) {
    return numero3 - numero4;
}
;
var resultado = subtract(10, 5);
console.log(resultado);
function addNumbers() {
    var number = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        number[_i] = arguments[_i];
    }
    var total = 0;
    number.forEach(function (num) { return total += num; });
    return total;
}
console.log(addNumbers(10, 20, 30));
