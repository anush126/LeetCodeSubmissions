class Solution {
    public int singleNumber(int[] nums) {

        int bin = 0;
        for(int num : nums){
            bin ^= num;
        }
        return bin;
    }
}