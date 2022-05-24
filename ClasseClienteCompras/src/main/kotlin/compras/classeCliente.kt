package compras

class Cliente(private var nome: String, private var cpf: String) {

    private var telefone = ""
    private var listDeCompras = mutableListOf<String>()

    constructor(nome: String, cpf: String, telefone: String): this(nome, cpf){
        this.telefone = telefone
    }


    init {
        if(nome == ""){
            throw Exception("Precisa de um nome!")
        }
    }


    fun adicCompra (produto: String){
    if(produto != "" ){
        listDeCompras.add(produto)
        println("Produto adicionado com sucesso.")
    }else{
        println("Precisa adicionar algum produto.")
    }
 }
    fun delCompra (produto: String){
        if(listDeCompras.contains(produto)){
            listDeCompras.remove(produto)
            println("Produto removido com sucesso")
        }else if (produto == ""){
            println("Precisa especificar um produto.")
        }else {
            println("Produto não existe na lista.")
        }
    }
    fun listaDeCompras() {
        listDeCompras.forEach {
            println(it)
        }
    }
}

