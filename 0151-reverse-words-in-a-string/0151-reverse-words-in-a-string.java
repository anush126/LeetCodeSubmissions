class Solution {
    public String reverseWords(String s) {
        String[] str = s.strip().split("\\s+");
        int i = 0;
        int l = str.length - 1;

        while(i < l){
            String temp = str[i];
            str[i] = str[l];
            str[l] = temp;
            i++;
            l--;
        }

        return String.join(" ", str);
    }
}