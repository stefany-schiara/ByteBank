//É assim que se cria um construtor da classe, passa os parametros dentro dos parenteses no nome da classe
//conforme abaixo, dessa forma, eu obrigo sempre a quando criar um objeto do tipo conta,
//obrigo a setar um titular e um numero de conta
class Conta(
        var titular: String,
        val numeroConta: Int)
    {

     var saldo: Double = 0.0

    fun depositar(valorDeposito: Double){
        println("depositando valor..")
        this.saldo += valorDeposito

        println("Valor depositado $valorDeposito")
        println("Seu saldo atual é: ${this.saldo}")
    }

    fun sacar(valorSaque: Double) {
        println("Sacando valor...")
        if (this.saldo >= valorSaque){
            this.saldo -= valorSaque
        } else {
            println("Saldo insuficiente!")
        }
        println("Saldo atual: ${this.saldo}")
    }

    fun transferir(contaDestino: Conta, valorTransferencia: Double): Boolean {
        if(this.saldo >= valorTransferencia) {
            this.saldo -= valorTransferencia

            contaDestino.depositar(valorTransferencia)

            println("Transferencia realizada")

            return true
        }

        return false
    }

    override fun toString(): String {
        return "Teste(titular='$titular', numeroConta='$numeroConta', saldo='$saldo')"
    }
}