fun main(args: Array<String>) {
// Faça um programa que entre com três números inteiros e coloque em ordem crescente.

    print("Digite o primer numero inteiro: ")
    var num1 = readln().toInt()
    print("Digite o segundo numero inteiro: ")
    var num2 = readln().toInt()
    print("Digite o tercer numero inteiro: ")
    var num3 = readln().toInt()

    if(num1 < num2){
        if(num2 < num3){
            println("A ordem crescente dos numeros é: $num1, $num2, $num3")
        }
        else if(num1 < num3){
            println("A ordem crescente dos numeros é: $num1, $num3, $num2")
        }else {
            println("A ordem crescente dos numeros é: $num3, $num1, $num2")
        }
    }
    else if (num2 < num3){
        if(num1 < num3){
            println("A ordem crescente dos numeros é: $num2, $num1, $num3")
        }else{
            println("A ordem crescente dos numeros é: $num2, $num3, $num1")
        }
    }else {
        println("A ordem crescente dos numeros é: $num3, $num2, $num1")
    }
}