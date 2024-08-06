
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        // Concatenate the string with itself and remove the first and last characters
        String combined = (s + s).substring(1, 2 * n - 1);
        
        // Check if the original string is a substring of this modified string
        return combined.contains(s);
    }
}
