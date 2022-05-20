fun main(args: Array<String>) {
/*Faça um programa que realice as operações basicas de uma calculadora*/

        println(
            "Digite 1 para adição, 2 para subtração, " +
                    "3 para multiplicação e 4 para divisão: ")
           var opcao = readln().toInt()

        if(opcao == 1){
            print("Digite o primer numero: ")
            var num1 = readln().toInt()
            print("Digite o segundo numero: ")
            var num2 = readln().toInt()
            println("A soma dos numeros e:  ${adicao(num1, num2)}")
        }else if(opcao == 2){
            print("Digite o primer numero: ")
            var num1 = readln().toInt()
            print("Digite o segundo numero: ")
            var num2 = readln().toInt()
            println("A subtração dos numeros e:  ${subtracao(num1, num2)}")
        }else if(opcao == 3){
            print("Digite o primer numero: ")
            var num1 = readln().toInt()
            print("Digite o segundo numero: ")
            var num2 = readln().toInt()
            println("A multiplicação dos numeros e:  ${mulltiplicacao(num1, num2)}")
        }else if(opcao == 4){
            print("Digite o primer numero: ")
            var num1 = readln().toInt()
            print("Digite o segundo numero: ")
            var num2 = readln().toInt()
            println("A divisão dos numeros e:  ${divisao(num1, num2)}")
        }else{
            println("Opção invalida")
        }


}
fun adicao(nu1: Int, nu2: Int ): Int{
    return nu1 + nu2
}
fun subtracao(nu1: Int, nu2: Int ): Int{
    return nu1 - nu2
}
fun mulltiplicacao(nu1: Int, nu2: Int ): Int{
    return nu1 * nu2
}
fun divisao(nu1: Int, nu2: Int ): Int{
    return nu1 / nu2
}