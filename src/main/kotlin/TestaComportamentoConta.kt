class TestaComportamentoConta {
}
    public fun testarComportamentosConta() {
        val contaStefany = Conta("Stefany", 1000)
        contaStefany.saldo = 0.0

        //posso utilizar labels que é a mesma coisa do de cima, porém, posso passar os parametros na ordem que eu quiser
        val contaOgawa = Conta(titular = "Ogawa", numeroConta = 1001)
        contaOgawa.saldo = 0.0

        println("Bem vindo ao ByteBank, ${contaStefany.titular}")

        contaStefany.depositar(250.0)
        contaStefany.sacar(50.0)
        contaStefany.transferir(contaOgawa, 50.0)

        println("Saldo conta Stefany: ${contaStefany.saldo}")
        println("Saldo conta Ogawa: ${contaOgawa.saldo}")
    }

