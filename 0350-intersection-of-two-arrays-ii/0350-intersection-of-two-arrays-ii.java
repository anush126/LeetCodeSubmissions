class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for (int n : nums1) {
            map1.put(n, map1.getOrDefault(n, 0) + 1);
        }

        for (int n : nums2) {
            map2.put(n, map2.getOrDefault(n, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int n : map1.keySet()) {
            if (map2.containsKey(n)) {
                int x = Math.min(map1.get(n), map2.get(n));

                for (int i = 0; i < x; i++) {
                    list.add(n);
                }
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}