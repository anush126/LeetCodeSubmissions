class Solution {
    public int missingInteger(int[] nums) {
        int s = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1] + 1){
                s += nums[i];
            }else{
                break;
            }
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(s == nums[i]){
                s++;
            }
        }
        return s;
    }
}