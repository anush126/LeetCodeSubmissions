class Solution {
    public boolean isPalindrome(int x) {
        int rem=0,rev=0,temp=x;
        while (temp>0){
            rem=temp%10;
            temp=temp/10;
            rev=rev*10+rem;
            System.out.println(rem+" "+rev);
        }
        return rev==x;
    }
}