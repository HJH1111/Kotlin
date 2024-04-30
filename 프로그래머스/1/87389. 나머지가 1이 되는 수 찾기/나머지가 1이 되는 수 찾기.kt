class Solution {
    fun solution(n: Int): Int {
        var x : Int = 0
        
        for(q in 1..n) {
            if (n % q == 1){
                x = q
                break
            }
            
        }
        return x
    }
}