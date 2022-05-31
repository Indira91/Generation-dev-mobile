fun main(args: Array<String>) {

/*Realizar uma calculadora com as principais operações,
validando com os TESTES UNITARIOS J-UNIT
 */

   while(true){

       println("\nEscolha uma operação: ")
       println(
                     "1 -> Soma" +
                   "\n2 -> Multiplicação" +
                   "\n3 -> Divisão" +
                   "\n4 -> Subtração" +
                   "\n5 -> Exponenciação" +
                   "\n6 -> Raiz quadrada" +
                   "\n7 -> Sair"
       )
       print("\nOpcão: ")
       var opcoes = readln().toInt()

       when (opcoes) {

           1 -> {
               println("Digite o primer numero para somar: ")
               var num1 = readln().toInt()
               println("Digite o segundo numeropara somar: ")
               var num2 = readln().toInt()
               println("Digite o tercer numero decimal para somar: ")
               var num3 = readln().toDouble()

               println("A soma dos 3 numeros e: ${Calculadora.soma(num1, num2, num3)}")
           }
           2 -> {
               println("Digite o primer numero para multiplicar: ")
               var num1 = readln().toInt()
               println("Digite o segundo numero para multiplicar: ")
               var num2 = readln().toInt()

               println("A multiplicação entre os dois numeros e: ${Calculadora.mult(num1, num2)}")
           }
           3 -> {
               println("Digite o primer numero para dividir: ")
               var num1 = readln().toInt()
               println("Digite o segundo numero para dividir: ")
               var num2 = readln().toInt()

               println("A divisão entre os dois numeros e: ${Calculadora.divisao(num1, num2)}")

           }
           4 -> {
                   println("Digite o primer numero para subtrair: ")
                   var num1 = readln().toInt()
                   println("Digite o segundo numero para subtrair: ")
                   var num2 = readln().toInt()

                   println("A subtração entre os dois numeros e: ${Calculadora.subtracao(num1, num2)}")
           }
           5 -> {
               println("Digite o numero base: ")
               var num1 = readln().toDouble()
               println("Digite o exponente: ")
               var num2 = readln().toDouble()

               println("O resultado de potenciação e: ${Calculadora.exponenciaciao(num1, num2)}")
           }
           6 ->{
               println("Digite o numero para saber a raiz quadrada: ")
               var num1 = readln().toDouble()

               println("A raiz quadrada de $num1 e ${Calculadora.raizQuadrada(num1)}")
           }
           7 -> break
           else -> println("Valor invalido.")
       }
   }
}







