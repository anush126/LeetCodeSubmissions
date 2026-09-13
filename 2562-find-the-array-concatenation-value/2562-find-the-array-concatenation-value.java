class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int f = 0;
        int l = nums.length - 1;
        long ans = 0;

        while(f <= l){
            String a = Integer.toString(nums[f]);
            String b = Integer.toString(nums[l]);
            String c = "";
            if(f == l){
                c = a;
            }else{
                c = a + b;
            }
            ans += Integer.parseInt(c);
            f++;
            l--;
        }
        return ans;
        
    }
}