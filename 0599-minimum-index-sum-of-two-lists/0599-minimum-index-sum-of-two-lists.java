class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        
        for(int i = 0; i < list1.length; i++){
            map1.put(list1[i], i);
        }

        ArrayList<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < list2.length; i++){
            if(map1.containsKey(list2[i])){
                if(i + map1.get(list2[i]) < min){
                    min = i + map1.get(list2[i]);
                    list = new ArrayList<>();
                    list.add(list2[i]);
                }else if(i + map1.get(list2[i]) == min){
                    list.add(list2[i]);
                }
            }
        }

        int i = 0;
        String[] ans = new String[list.size()];
        for(String s : list){
            ans[i] = s;
            i++;
        } 

        return ans;
    }
}