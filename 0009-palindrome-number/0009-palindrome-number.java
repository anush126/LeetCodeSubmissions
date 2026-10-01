class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int res = 0;

        if(n < 0){
            return false;
        }

        while(n > 0){
            int d = n % 10;
            n = n / 10;
            res = res * 10 + d;
        }
        System.out.print(res+" "+n);
        return res == x;
    }
}