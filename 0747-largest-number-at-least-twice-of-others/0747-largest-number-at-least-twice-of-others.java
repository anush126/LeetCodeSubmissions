class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = nums[i];
        }
        Arrays.sort(nums);
        int max = nums[n - 1];
        int max2 = nums[n - 2];

        if((max2 * 2) <= max){
            for(int i = 0; i < n; i++){
                if(arr[i] == max){
                    return i;
                }
            }
        }

        return -1;

    }
}