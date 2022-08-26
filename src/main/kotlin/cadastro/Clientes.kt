package cadastro

//var pessoa = mutableListOf<String>() ó o carro do peixe - by Fabiano
class Clientes(
    nome: String,
    cpf: Int,
    endereco: String,
    telefone: String,
    email: String
) : Cadastro(nome, cpf, endereco, telefone, email){


    override fun cadastrar(){
        print("Cliente foi cadastrado com sucesso")

    }

    override fun excluir() {

    }



}