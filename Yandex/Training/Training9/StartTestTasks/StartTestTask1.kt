package StartTestTasks

/*
Вася начал изучать кодирование. В этот раз он изобрёл свой шифр, который меняет каждый символ строки по следующему правилу:
Символы с «a» по «i» отображаются в числа от «1» до «9» соответственно
Символы с «j» по «z» отображаются в числа от «10#» до «26#» соответственно
Например, строка «hello» по этому правилу будет закодирована последовательностью «8512#12#15#».
Вася научился кодировать строки. А вот с раскодированием у него проблемы. Помогите Васе раскодировать строку!
Гарантируется, что последовательность получена кодированием какой-то исходной строки, состоящей из строчных латинских букв.
*/

fun main() {
    val encodedWord = readln()
    val decodedWord = StringBuilder()
    var i = 0

    while (i < encodedWord.length) {
        if (i + 2 < encodedWord.length && encodedWord[i + 2] == '#') {
            val number = encodedWord.substring(i, i + 2).toInt()
            decodedWord.append(convertNumberToChar(number))
            i += 3
        } else {
            val number = encodedWord[i].toString().toInt()
            decodedWord.append(convertNumberToChar(number))
            i++
        }
    }

    println(decodedWord.toString())
}

fun convertNumberToChar(number: Int): Char {

    return ('a'.code + number - 1).toChar()
}
