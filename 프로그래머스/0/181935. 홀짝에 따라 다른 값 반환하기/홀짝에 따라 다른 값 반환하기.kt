class Solution {
    fun solution(n: Int): Int {
        var a = 0
        for (i in n downTo 1 step 2) {
            a += if(n % 2 == 1) {
                i
            } else {
                (i*i)
            }
        }
        return a
    }
}