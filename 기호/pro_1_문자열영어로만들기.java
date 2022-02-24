class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] list = new char[s.length()];
        list = s.toCharArray();
        for(int i =0; i < list.length;i++){
            if(list[i]!=' '){
                if(list[i]>=65 && list[i]<=90){
                    if(list[i] + n >90){
                        list[i] =(char) (list[i] + n -26);
                    }else{
                         list[i] =(char) (list[i] + n);
                    }
                }
                else if(list[i]>=97 && list[i]<=122){
                    if(list[i] + n >122){
                        list[i] = (char) (list[i] + n -26);
                    }  else{
                         list[i] =(char) (list[i] + n);
                    }  
                }
                
            }else{
                list[i]=' ';
            }
            
            
        }
         for(int i =0; i < list.length;i++){
           answer += list[i];
        }
       
        return answer;
    }
}