import cadastro.Clientes
import cadastro.Funcionarios

val lista = mutableListOf<Clientes>()

fun cadastrarClientes(){
        println("\n[Área do cliente]")
        print("Digite o seu nome: ")
        val nome = readln()

        print("Digite o seu CPF: ")
        val cpf = readln()

        print("Digite o seu endereço: ")
        val endereco = readln()

        print("Digite o seu telefone: ")
        val telefone = readln()

        print("Antes de concluir o cadastro, digite seu email: ")
        val email = readln()
        lista.add(Clientes(nome, cpf, endereco, telefone, email))
}

fun removerClientes(){
    print("Digite o cpf para ser excluido")
    val cpfRemove = readln()
    var cliente: Clientes? = null

    lista.forEach{
        if (cpfRemove == it.cpf){
            cliente = it
        }
    }
    lista.remove(cliente)
}
fun exibirClientes(){
    lista.forEach {
            println("[${it.nome} | ${it.cpf} | ${it.endereco} | ${it.telefone} | ${it.email}]")
    }
}

//Funcionarios //

var funcionarios = mutableListOf<Funcionarios>()


fun cadastrarFuncionarios(){

    println("\n[Área do funcionário]")
    print("Digite o seu nome: ")
    val nome = readln()

    print("Digite o seu CPF: ")
    val cpf = readln()

    print("Digite o seu endereço: ")
    val endereco = readln()

    print("Digite o seu telefone: ")
    val telefone = readln()

    print("Antes de concluir o cadastro, digite seu email: ")
    val email = readln()
    funcionarios.add(Funcionarios(nome, cpf, endereco, telefone))


}

fun removerFuncionarios(){
    print("Digite o cpf para ser excluido")
    val cpfRemove = readln()
    var funcionario: Funcionarios? = null

    funcionarios.forEach{
        if (cpfRemove == it.cpf){
            funcionario = it
        }

    }
    funcionarios.remove(funcionario)
}

fun exibirFuncionarios(){
    lista.forEach {
        println("[${it.nome} | ${it.cpf} | ${it.endereco} | ${it.telefone} | ${it.email}]")
    }
}



