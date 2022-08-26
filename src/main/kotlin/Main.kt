import cadastro.Clientes

fun main(args: Array<String>) {

    try{
    while (true) {
        print("\n[CodPizza]")

        print(
            "\n" +
                    "0 - Cadastrar funcionários\n"+
                    "1 - Área do cliente\n" +
                    "2 - Cardapio\n" +
                    "3 - Sair\n" +
                    "Escolha a opção: "
        )
        when (readln().toInt()) {

            0 -> {
                print(
                    "\n[Menu]\n" +
                            "1 - Cadastrar funcionários\n" +
                            "2 - Excluir funcionários\n" +
                            "3 - Exibir funcionários\n" +
                            "Escolha uma opção: "
                )
                when (readln().toInt()) {
                    1 -> cadastrarFuncionarios()
                    2 -> removerFuncionarios()
                    3 -> exibirFuncionarios()
                }
            }
            1 -> {
                print(
                    "\n[Menu]\n" +
                            "1 - Cadastrar cliente\n" +
                            "2 - Excluir cliente\n" +
                            "3 - Exibir clientes\n" +
                            "Escolha uma opção: "
                )
                when (readln().toInt()) {
                    1 -> cadastrarClientes()
                    2 -> removerClientes()
                    3 -> exibirClientes()
                }
            }
            2 -> {
                print(
                    "\n[Cardápio]\n" +
                            "1 - Bug Pizza (tomate e massa)\n" +
                            "2 - Kotlin Pizza (Frango catupiry)\n" +
                            "3 - Java Pizza (Escarola com aliche)\n" +
                            "4 - Python Pizza (Calabresa com cogumelos)\n" +
                            "5 - JavaScript Pizza (4 Queijos)\n" +
                            "6 - CSharp Pizza (Presunto, ovo, queijo e Ervilhas)\n" +
                            "7 - C Pizza (Mussarela)\n" +
                            "Escolha uma opção: "
                )
                when (readln().toInt()) {
                    1 -> print("\nSua Bug Pizza ficará pronta em 20 minutos\n")
                    2 -> print("\nSua Kotlin Pizza ficará pronta em 20 minutos\n")
                    3 -> print("\nSua Java Pizza ficará pronta em 20 minutos\n")
                    4 -> print("\nSua Python Pizza ficará pronta em 20 minutos\n")
                    5 -> print("\nSua JavaScript Pizza ficará pronta em 20 minutos\n")
                    6 -> print("\nSua CSharp Pizza ficará pronta em 20 minutos\n")
                    7 -> print("\nSua C Pizza ficará pronta em 20 minutos\n")

                }
                }
            3 -> break

            else -> print("\nOpção inválida, retornando ao inicio do programa!\n")

            }
        }

    }catch (e: Exception){
       print(e.message)
    }
}

