class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long res = 0;
        int l = 0,
            r = nums.length - 1;
        while(l < r){

            String first = Integer.toString(nums[l]);
            String last = String.valueOf(nums[r]);
            String comb = first + last;
            res += Integer.parseInt(comb);

            l++;
            r--;
        }
        if (l == r) {
            res += nums[l];
        }

        return res;
    }
}