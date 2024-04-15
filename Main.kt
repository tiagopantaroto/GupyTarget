fun main() {

}

fun calcularFibonacci(num: Int): String {
    var mensagem: String
    if (num < 0) {
        mensagem = "O número informado não pertence à sequência."
    } else if (num == 0 || num == 1) {
        mensagem = "O número informado pertence à sequência."
    } else {
        var anterior = 0
        var atual = 1
        var igual = false
        var aux: Int
        while (num > atual && igual == false) {
            aux = anterior
            anterior = atual
            atual += aux

            if (atual == num) {
                igual = true
            }
        }
        when (igual) {
            true -> mensagem = "O número informado pertence à sequência."
            false -> mensagem = "O número informado não pertence à sequência."
        }
    }

    return mensagem
}

fun inverterString(s: String): String {
    var sInvertida = ""
    var tamanhoDaString = s.length - 1
    while (tamanhoDaString >= 0) {
        sInvertida += s.get(tamanhoDaString)
        tamanhoDaString--
    }

    return sInvertida
}
