// https://codeforces.com/problemset/problem/112/A
// Petya and Strings

fun main() {
    val line1 = readln().lowercase()
    val line2 = readln().lowercase()
    var more = 0
    var less = 0
    var i = line1.length
    var j = 0
    while (i > 0 && more == 0 && less == 0) {
        if (line1[j] > line2[j]) {
            println("1")
            more++
        }
        else if (line1[j] < line2[j]){
            println("-1")
            less++
        }
        else {
            i--
            j++
            if (i == 0) println("0")
        }
    }
}
