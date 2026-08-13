class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minSoFar = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - minSoFar;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }

            if (prices[i] < minSoFar) {
                minSoFar = prices[i];
            }
        }
        return maxProfit;
    }
}
