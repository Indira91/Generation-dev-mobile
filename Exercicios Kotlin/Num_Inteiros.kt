fun main(args: Array<String>) {
//Faça um programa que receba três inteiros e diga qual deles é o maior.

    print("Digite o primer numero: ")
    var num1 = readln().toInt()
    print("Digite o segundo numero: ")
    var num2 = readln().toInt()
    print("Digite o tercer numero: ")
    var num3 = readln().toInt()

    when {
        num1 >= num2 && num1 >= num3
        -> println("$num1 e o numero maior.")
        num2 >= num1 && num2 >= num3
        -> println("$num2 e o numero maior.")

        else -> println("$num3 e o numero maior.")
    }
}