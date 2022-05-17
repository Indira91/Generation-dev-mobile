import kotlin.math.pow
fun main(args: Array<String>) {
/*
Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

    print("Digite um numero inteiro: ")
    var num = readln().toDouble()
    var raiz = Math.sqrt(num)


    if (num % 2.0 == 0.0){
       print("Numero: par" +
               "\nRaiz quadrada: " + "%.2f".format(raiz))
    }else{
        print("Numero: impar" +
                "\nElevado à segunda potencia: " + (num * num) )
    }
}