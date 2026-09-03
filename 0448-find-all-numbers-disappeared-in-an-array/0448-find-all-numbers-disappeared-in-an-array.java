class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int num : nums){
            set.add(num);
        }

        List<Integer> res = new ArrayList<>();

        for(int i = 1; i < n + 1; i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }

        return res;
    }
}