class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int i = 0;
        for(int n : nums){
            ans[i] = n*n;
            i++;
        }

        Arrays.sort(ans);

        return ans;
    }
}