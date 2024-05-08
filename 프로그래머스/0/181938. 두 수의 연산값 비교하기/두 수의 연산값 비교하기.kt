class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer = (a.toString() + b.toString()).toInt()
        
        return if (answer >= 2 * a * b) answer else 2 * a * b
    }
}