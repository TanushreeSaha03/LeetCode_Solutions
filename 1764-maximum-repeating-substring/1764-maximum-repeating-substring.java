class Solution {
    public int maxRepeating(String sequence, String word) {
        int maxRepeats = 0;
        StringBuilder repeatedWord = new StringBuilder(word);
        
        while (sequence.contains(repeatedWord)) {
            maxRepeats++;
           repeatedWord.append(word);
        }
        
        return maxRepeats;
    }
}