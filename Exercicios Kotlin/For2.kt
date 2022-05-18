fun main(args: Array<String>) {

    // Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

    var pares = 0
    var impares = 0

    for (i in 1..10){
        print("Digite um número inteiro: ")
        var num = readln().toInt()
        if (num % 2 == 0){
            pares += 1

        }else{
            impares += 1
        }
    }
    println("Temos $pares números pares")
    println("Temos $impares números impares")
}