import cadastro.Clientes

fun main(args: Array<String>) {

    while (true){
        print("\n[CodPizza]")

        print("\n" +
                "1 - Área do cliente\n" +
                "2 - Cardapio\n" +
                "3 - Sair\n" +
                "000 - Cadastrar funcionários\n" +
                "Escolha a opção: ")
        when(readln().toInt()){
            1-> {
                print("\n[Menu]\n"+
                        "1 - Cadastrar cliente\n" +
                        "2 - Excluir cliente\n" +
                        "3 - Exibir clientes\n" +
                        "Escolha uma opção: ")
                when(readln().toInt()){
                    1 -> cadastrarClientes()
                    2 -> removerClientes()
                }
            }

        }
    }
}
