fun main() {

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
