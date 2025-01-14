console.log("hello world!");

let numero1: number = 3;
let numero2: number = 1;
let resul: number;

resul = numero1 + numero2;

console.log(resul);;

const numeros: Array<Number> = new Array<Number>(1,5,6,8,9);

console.table(numeros.sort());

function subtract(numero3: number, numero4: number) : number {
    return numero3 - numero4
};

let resultado: number = subtract(10, 5);

console.log(resultado);

//Parametros Rest

function addNumbers(...number: number[]) : number {
    let total = 0;
    number.forEach((num) => total+= num);
    
    return total;
}

console.log(addNumbers(10,20,30));
