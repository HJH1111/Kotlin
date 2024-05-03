class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var my_chars = my_string.toCharArray()
        
        for (i in overwrite_string.indices) {
            my_chars[i+s] = overwrite_string[i]
            
        
        }
        return my_chars.joinToString("")
    }
}