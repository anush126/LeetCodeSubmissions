class Solution {
    public boolean isDigit(char c){
        return c >= '0' && c <= '9';
    }

    public int myAtoi(String s) {

        int i = 0;
        int l = s.length();
        int ans = 0;

        while(i < l && s.charAt(i) == ' '){
            i++;
        }

        int sign = 1;

        if(i < l){
            if(s.charAt(i) == '-'){
                sign = -1;
                i++;
            }
            else if(s.charAt(i) == '+'){
                i++;
            }
        }
        
        while(i < l && isDigit(s.charAt(i))){

            int d = s.charAt(i) - '0';

            if(ans == Integer.MAX_VALUE / 10){
                if(sign == 1){
                    if(d >= 7){
                        return Integer.MAX_VALUE;
                    }
                }if(sign == -1){
                    if(d >= 8){
                        return Integer.MIN_VALUE;
                    }
                }
            }

            if(ans > Integer.MAX_VALUE / 10){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }
                else{
                    return Integer.MIN_VALUE;
                }
            }


            ans = ans * 10 + d;
            i++;
        }

        return sign * ans;
    }
}