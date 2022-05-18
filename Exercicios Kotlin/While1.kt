fun main(args: Array<String>) {
/*
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
*/

var idade = 0
var contador21 = 0
var contador50 = 0

while (idade != -99){
    print("Digite um número diferente de -99: ")
    idade = readln().toInt()
if(idade in 1..20){
    contador21++
}else if(idade > 50 ){
    contador50++
}

}
    println("Total de pessoas com menos de 21 anos é: $contador21")
    println("Total de pessoas com mais de 50 anos é: $contador50")
}