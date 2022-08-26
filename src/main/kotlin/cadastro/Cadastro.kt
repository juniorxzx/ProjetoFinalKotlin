package cadastro

abstract class Cadastro(

    val nome: String,
    val cpf: Int,
    val endereco: String,
    val telefone: String,
)
{
    var email = ""
    var id = ""
    var funcao = ""

    constructor(

        nome: String,
        cpf: Int,
        endereco: String,
        telefone: String,
        email: String,
//        id: String,
//        funcao: String

    ) : this(nome, cpf,endereco,telefone){
            this.email = email
//            this.id = id
//            this.funcao = funcao
        }

     open fun cadastrar(){
        print("")
    }

    open fun excluir(){
        print("")
    }
}