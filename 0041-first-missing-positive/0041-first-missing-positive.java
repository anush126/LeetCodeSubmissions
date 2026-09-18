class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int t = 1;

        Arrays.sort(nums);

        for(int n : nums){
            if (n == t){
                t++;
            }
        }
        return t;
    }
}