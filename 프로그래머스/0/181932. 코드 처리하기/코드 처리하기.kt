class Solution {
    fun solution(code: String): String {
        val sb = StringBuilder()
        var mode = 0
        code.forEachIndexed { index, _ ->
            if (code[index] == '1') {
                mode = 1 - mode
            } else if (index % 2 == mode) {
                sb.append(code[index])
            }
        }

        return sb.toString().ifEmpty { "EMPTY" }
    }
}