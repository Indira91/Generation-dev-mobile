fun main(args: Array<String>) {
    val funcionarios = Funcionario(
            "Josefina",
            "555.555.555-44",
            "253565-k",
            35,
            "Atendente de caixa.",
            1700.00,
            8
        )
    funcionarios.listar()
    funcionarios.horaExtra()

}

