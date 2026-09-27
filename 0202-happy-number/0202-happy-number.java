class Solution {

    public int sqSum(int n) {
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            n = n / 10;
            sum += (d * d);
        }
        System.out.print(sum);
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);

            n = sqSum(n);
        }
        return true;
    }
}