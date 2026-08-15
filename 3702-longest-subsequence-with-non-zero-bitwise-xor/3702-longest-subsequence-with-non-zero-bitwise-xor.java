class Solution {
    public int longestSubsequence(int[] nums) {
        int x = 0;
        boolean nz = false;
        for (int n : nums) {
            x ^= n;
            if (n != 0) {
                nz = true;
            }
        }
        if (!nz)
            return 0;
        if (x != 0)
            return nums.length;
        return nums.length - 1;
    }
}