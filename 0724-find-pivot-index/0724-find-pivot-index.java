class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            int lsum = 0, rsum = 0;
            for(int l = 0; l < i; l++){
                lsum += nums[l];
            } 
            for(int r = n - 1; r > i; r--){
                rsum += nums[r];
            }
            if(lsum == rsum){
                return i;
            }
            i++;
        }
        return -1;
    }
}