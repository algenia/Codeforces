// https://codeforces.com/problemset/problem/263/A
// Beautiful Matrix

fun abs(x: Int): Int {
    return if (x < 0) -x else x
}

fun main() {
    // positions in rows and columns are indexed as: [-2 -1 0 1 2]
    var i = -2
    var j = -2
    var line = ""
    var k = 1

    repeat(5) {
        val next = readln()
        line += next.filter{it.isDigit()}
    }

    val line1 = line.split("")
    var len = line.length

    while (len > 0 && line1[k].toInt() != 1) {
        i++
        if (i == 3) {
            j++
            i = -2
        }
        len--
        k++
    }

    println(abs(i) + abs(j))
}
