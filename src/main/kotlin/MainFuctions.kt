import cadastro.Clientes
val lista = mutableListOf<Clientes>()


fun cadastrarClientes(){

        println("\n[Área do cliente]")
        print("Digite o seu nome: ")
        val nome = readln()

        print("Digite o seu cpf: ")
        val cpf = readln().toInt()

        print("Digite o seu endereço: ")
        val endereco = readln()

        print("Digite o seu telefone: ")
        val telefone = readln()

        print("Antes de concluir o cadastro, digite seu email: ")
        val email = readln()
        lista.add(Clientes(nome, cpf, endereco, telefone, email))



    print(lista)

}

fun removerClientes(){
    print("Digite o cpf para ser excluido")
    val cpfRemove = readln().toInt()


    lista.forEach{
        if (cpfRemove == it.cpf){
            lista.remove(it)
        }
    }
}


//[] [434637] [43743638]
