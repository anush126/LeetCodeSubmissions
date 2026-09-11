class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int l = word1.length() + word2.length();
        for(int i = 0; i < l; i++){
            if(i < word1.length()){
                res += word1.charAt(i);
            }
            if(i < word2.length()){
                res += word2.charAt(i);
            }
        }
        return res;
    }
}