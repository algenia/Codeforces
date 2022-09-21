// https://codeforces.com/problemset/problem/118/A
// String Task

fun main() {
    val line = readln().lowercase()
    val result = arrayListOf("")
    for (char in line.indices) {
        when (line[char]) {
            'a', 'o', 'y', 'e', 'u', 'i' -> 0 // not an elegant solution, change to (!in)
            else -> result.add("." + line[char])
        }
    }
 
    print(result.joinToString(""))
 
}
