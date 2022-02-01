class Solution {
    public String solution(String s) {
        int idx = 0; 
        String[] str = s.split(""); 
        String strange = "";
        
        for(int i = 0; i < str.length; i++){
            if(s.charAt(i) == ' '){ // 경우 1. 공백
                idx = 0;
                
            } else if(idx % 2 == 0){ // 경우 2. 짝수
                str[i] = str[i].toUpperCase();
                idx++;
                
            } else{ // 경우 3. 홀수
                str[i] = str[i].toLowerCase();
                idx++;
            }
            
            strange += str[i]; 
        }
        
        return strange;
    }
}