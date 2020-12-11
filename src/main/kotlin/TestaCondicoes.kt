class TestaCondicoes {
}

fun testarCondicaoIf(saldo: Double) {
    //esse trecho de codigo pode ser substituido pelo when
    if (saldo > 0.0) {
        println("conta positiva")
    } else if (saldo == 0.0) {
        println("conta neutra")
    } else {
        println("conta negativa")
    }
}

fun testarCondicaoWhen(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta positiva")
        saldo == 0.0 -> println("conta neutra")
        else -> {
            println("conta negativa")
        }
    }
}