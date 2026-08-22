class Solution {
    public boolean checkDivisibility(int n) {
        int dsum = 0;
        int dprod = 1;
        int x = n;

        while(x > 0){
            int l = x % 10;
            x = x / 10;
            dsum += l;
            dprod *= l;
        }

        if ( n % (dsum + dprod) == 0 ){
            return true;
        }

        return false;
    }
}