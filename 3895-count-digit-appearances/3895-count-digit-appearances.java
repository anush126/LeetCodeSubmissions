class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int num : nums){
            while(num>0){
                int m = num%10;
                num = num/10;
                if(m==digit){
                    count++;
                }
            }
        }
        return count;
    }
}