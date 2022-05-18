fun main(args: Array<String>) {
/*
Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/
    var cont = 0
    var soma = 0.0

    do{
        print("Digite um numero diferente de zero: ")
        var num = readln().toDouble()
        soma += num
        cont++
    }while (num != 0.0)
    print("A soma de todos os numeros é: $soma")
}