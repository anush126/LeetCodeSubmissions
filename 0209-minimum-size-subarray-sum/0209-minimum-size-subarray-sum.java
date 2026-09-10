class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int runningsum = 0;
        int c = Integer.MAX_VALUE;
        int right = 0, left = 0;

        while (right < nums.length){
            runningsum += nums[right];
            while(runningsum >= target){
                c = Math.min(c, right - left + 1);
                runningsum -= nums[left];
                left++;
            }
            right++;
        }

        return c == Integer.MAX_VALUE ? 0 : c;
    }
}