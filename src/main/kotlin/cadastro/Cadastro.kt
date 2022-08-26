package cadastro

abstract class Cadastro(

    val nome: String,
    val cpf: String,
    val endereco: String,
    val telefone: String,
)
{
    var email = ""
    var id = ""
    var funcao = ""

    constructor(

        nome: String,
        cpf: String,
        endereco: String,
        telefone: String,
        email: String,


    ) : this(nome, cpf,endereco,telefone){
            this.email = email

        }

    init {
        if (cpf == ""){
           throw Exception("Não foi possivel cadastrar um CPF vazio")
        }
    }
     open fun cadastrar(){
        print("")
    }

    open fun excluir(){
        print("")
    }
}