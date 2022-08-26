package cadastro

 class Funcionarios(
    nome: String,
    cpf: String,
    endereco: String,
    telefone: String,

) : Cadastro(nome, cpf, endereco, telefone){


     override fun cadastrar(){
         print("Funcionário foi cadastrado com sucesso")

     }

     override fun excluir() {
         print("Funcionário excluído com sucesso")
     }

     override fun toString(): String {
         return "$nome | $cpf | $endereco | $telefone | $email"
     }


}