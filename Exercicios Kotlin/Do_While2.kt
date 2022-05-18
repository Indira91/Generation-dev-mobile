fun main(args: Array<String>) {
/*
Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
*/
    var cont = 0
    var soma = 0
    var media = 0

    do{
        print("Digite um numero diferente de zero: ")
        var num = readln().toInt()

        if(num %3==0 && num!=0 ) {
            soma += num
            cont++
            media = soma/cont
        }
    }while (num != 0)
    print("A soma de todos os numeros é: $media")
}