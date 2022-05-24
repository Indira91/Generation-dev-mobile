class Funcionario (
    val nome: String,
    val cpf: String,
    val rg: String,
    val idade: Int,
    val funcao: String,
    val salario: Double,
    val horasDemais: Int
) {
    var status = true
    var valorextra = 18

    fun horaExtra() {
        val adicional = horasDemais * valorextra
        print("A remuneração final e: ${adicional+salario}")
    }
    fun listar(){
        println("Digite o nome para procurar o registro: ")
        var digiteonome = readLine().toString()
        if (digiteonome == "Josefina"){
            println("Nome: $nome")
            println("CPF: $cpf")
            println("Identidade: $rg")
            println("Idade: $idade")
            println("Função: $funcao")
            println("Salario atual: $salario")
            println("Horas extras trabalhadas: $horasDemais")
        }
    }

}