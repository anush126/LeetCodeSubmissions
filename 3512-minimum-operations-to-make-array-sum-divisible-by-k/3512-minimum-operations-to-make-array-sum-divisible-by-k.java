class Solution {
    public int minOperations(int[] nums, int k) {
        int t = 0;
        int count = 0;
        for (int num : nums) {
            t += num;
        }
        while (t % k != 0) {
            count++;
            t--;
        }
        return count;
    }
}