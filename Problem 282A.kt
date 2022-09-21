// https://codeforces.com/problemset/problem/282/A
// Bit++

fun main() {
    var n = readln().toInt()
    var x = 0
    while (n > 0) { // read n lines
        val next = readln()
        if (next[1].compareTo('+') == 0) x++
        else x--
        n--
    }
    println(x)
}
