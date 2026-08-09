class Solution {
    public int romanToInt(String s) {
        Map <Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char ch[]=s.toCharArray();
        System.out.println(map);
        int ans=0,i,j;
        for(i=0, j=1; j<ch.length; i++,j++){
                if(map.get(ch[i])>=map.get(ch[j])){
                    ans+=map.get(ch[i]);
                     System.out.println(ans);
                }
                else{
                    ans-=map.get(ch[i]);
                     System.out.println(ans);
                }
            }
        ans+=map.get(ch[i]);
        return ans;
    }
}