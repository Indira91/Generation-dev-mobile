import compras.Cliente

fun main(args: Array<String>) {
    /*Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
    e pelo menos mais duas opções de construtores conforme sua percepção,
    com os atributos: nome (String), endereço (String), telefone (String),
    listaDeCompras (mutableListOf<Strings>()).

    A classe precisará de métodos para adicionar, remover e listar os itens
    do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio,
    jogue uma exceção. Ao instanciar a classe cliente na função main(), não esquecer
    de colocar dentro de um bloco try catch.
     */
while(true) {

    println("Digite o nome: ")
    val nome = readln()
    println("Digite o cpf: ")
    val cpf = readln()

    try {
        val clientes = Cliente(nome, cpf, "11282726")

        while (true) {
            println("\n***Lista de opções***")
            println(
                        "\n1- Adicionar" +
                        "\n2- Deletar" +
                        "\n3- Listar " +
                        "\n4- Sair")
            print("\nOpção: ")
            var opcao = readln().toInt()


            when (opcao) {

                1 -> {
                    print("Digite um produto para incluir na lista: ")
                    val prod = readln()
                    clientes.adicCompra(prod)
                }

                2 -> {
                    print("Digite um produto para excluir da lista: ")
                    val prod2 = readln()
                    clientes.delCompra(prod2)
                }
                3 -> {
                    println("Segue a lista completa de compras: ")
                    clientes.listaDeCompras()
                }
                4 -> break

            }

        }
    }catch (e: Exception){
        println(e.message)
    }
    break
 }
}