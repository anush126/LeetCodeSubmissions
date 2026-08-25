class Solution {
    public int findNumbers(int[] nums) {

        int eveCount = 0;
        
        for(int n : nums){
            int d = 0;
            while(n > 0){
                d++;
                n = n / 10;
            }
            if(d % 2 == 0){
                eveCount++;
            }
        }

        return eveCount;
    }
}