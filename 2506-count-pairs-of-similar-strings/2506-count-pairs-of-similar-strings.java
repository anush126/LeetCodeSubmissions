class Solution {
    public int similarPairs(String[] words) {
        int ans = 0, n = words.length;

        for(int i = 0; i < n; i++){
            Set <Character> set = new HashSet<>();
            for(char ch : words[i].toCharArray()){
                set.add(ch);
            }
            
            for(int j = i + 1; j < n; j++){
                Set <Character> set2 = new HashSet<>();
                for(char ch : words[j].toCharArray()){
                    set2.add(ch);
                }

                if(set.equals(set2)){
                    ans++;
                }
            }
        }
        return ans;
    }
}