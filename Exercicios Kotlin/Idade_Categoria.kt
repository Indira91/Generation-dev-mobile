fun main(args: Array<String>) {
/*
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 -> 10-14 infantil
 -> 15-17 juvenil
 -> 18-25 adulto
*/
    print("Digite sua idade: ")
    var idade = readln().toInt()

   if(idade in 10..14){
       print("Perfeito, Você esta na categoria: Infantil.")
   }else if(idade in 15..17){
       print("Perfeito, Você esta na categoria: Juvenil.")
   }else if(idade in 18..25){
       print("Perfeito, Você esta na categoria: Adulto.")
   }else {
       print("Sinto muito, sua idade não faz parte de nossas categorias!")
   }
}