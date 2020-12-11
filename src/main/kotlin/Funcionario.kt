class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    fun calcularBonificacao(): Double{
        return salario * 0.1
    }

    override fun toString(): String {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }


}