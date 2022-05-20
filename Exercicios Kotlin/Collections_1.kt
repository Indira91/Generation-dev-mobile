fun main() {

/*Crie um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
    println("***Bem-vindo ao programa de controle de estoque***\n")
    val itens = mutableListOf<String>()

    while(true){
        println("Escolha uma alternativa: " +
                "\n1 cadastrar " +
                "\n2 remover " +
                "\n3 alterar " +
                "\n4 ver todos os itens" +
                "\n5 sair")
        print("\nOpção: ")
        var opcao = readln().toInt()
        when(opcao) {

            1 -> {
                print("Digite um iten para adicionar na lista: ")
                val valor = readln()
                if (valor != "") {
                    itens.add(valor)
                } else {
                    break
                }
              }
            2 -> {
                println("A lista dos produtos atuais e: ")
                itens.forEach {
                    println(it)
                }
                print("Digite um iten para você deletar da lista: ")
                val valor = readln()

                if (itens.contains(valor)) {
                    itens.remove(valor)
                    break
                } else {
                    println("O iten $valor não existe na lista")
                }
              }

            3-> {
                print("Digite um iten para você alterar na lista: ")
                val valor = readln()
                if (itens.contains(valor)) {
                    val index = itens.indexOf(valor)
                    print("Digite o novo nome: ")
                    val novo = readln()
                    itens[index] = novo
                    println("O nome foi atualizado com sucesso!")
                    break
                } else {
                    println("O nome $valor não existe na lista")
                    itens.forEach {
                        println(it)
                    }
                }
            }
            4 -> {
                print("A lista dos produtos atuais e: ")
                itens.forEach {
                    println(it)
                }
            }
            5 -> break
            else -> println("Opção inválida.")
        }

    }
}

