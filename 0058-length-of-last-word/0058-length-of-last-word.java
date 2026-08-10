class Solution {
    public int lengthOfLastWord(String s) {
        String st[]=s.split(" ");
        String l=st[st.length-1];
        return l.length();
    }
}