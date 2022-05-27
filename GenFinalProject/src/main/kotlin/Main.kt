fun main()
{
    while(true){
        when(inicio())
        {
            1 -> {
                try {
                    println("Insira sua informaçoes para se cadastrar como Doador: ")

                    print("Digite o seu nome: ")
                    val nomeDoador = readLine()!!

                    print("Digite o seu cpf, somente números: ")
                    val enderecoDoador = readLine()!!

                    print("Digite o seu telefone: ")
                    val telefoneDoador = readLine()!!

                    print("Digite o seu email: ")
                    val emailDoador = readLine()!!

                    print("Digite o seu cpf, somente números: ")
                    val cpfDoador = readLine()!!


                    println("Escolha uma cesta para Doar:")

                    val doador1 = Doador(nomeDoador, enderecoDoador, telefoneDoador, emailDoador, cpfDoador)

                    println("Escolha qual cesta ira doar: ")

                    Ong.printlist()

                    var cesta = readln()
                    doador1.doarCesta(cesta)
                } catch (e:Exception){
                    println(e.message)
                }

            }

            2 ->{
                try {
                    println("Insira sua informaçoes para se cadastrar como Beneficiário: ")

                    print("Digite o seu nome: ")
                    val nomeBeneficiario = readLine()!!

                    print("Digite o seu cpf, somente números: ")
                    val enderecoBeneficiario = readLine()!!

                    print("Digite o seu telefone: ")
                    val telefoneBeneficiario = readLine()!!

                    print("Digite o seu email: ")
                    val emailBeneficiario = readLine()!!

                    print("Digite o seu cpf, somente números: ")
                    val cpfBeneficiario = readLine()!!

                    print("Escreva uma mensagem descrevendo sua situação: ")
                    val msg = readln()!!

                    val beneficiario1 = Beneficiario(
                        nomeBeneficiario,
                        enderecoBeneficiario,
                        cpfBeneficiario,
                        telefoneBeneficiario,
                        emailBeneficiario,
                        msg
                    )
                }catch (e:Exception) {
                    println(e.message)
                }

            }


        }

    }


}

fun inicio(): Int {
    var operation: Int

    do {
        println("\n\nDigite 1 para Doar\nDigite 2 para ser um beneficiário:")
        operation = readln().toInt()
        if (!(operation == 1 || operation == 2)) {
            println("Opção inválida\n")
        }
    } while (!(operation == 1 || operation == 2))

    return operation
}
