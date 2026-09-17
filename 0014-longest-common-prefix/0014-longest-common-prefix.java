class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();

        for(int i = 0; i < strs.length - 1; i++){
            String f = strs[i];
            String s = strs[i + 1];

            int j = 0;
            int len = Math.min(f.length(), s.length());
            while(j < len){
                if(f.charAt(j) != s.charAt(j)){
                    break;
                }
                j++;
            }
            min = Math.min(min, j);
        }

        return strs[0].substring(0, min);
    }
}