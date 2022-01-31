class Solution {
    public boolean solution(String s) {
       char[] ch = new char[s.length()];
        boolean answer = false;
        for(int i =0;i < s.length();i++){
            ch[i] = s.charAt(i);
        }
        for(int i =0;i < s.length();i++){
            if(s.length()==4 ||s.length()==6) { //길이가 4이나 6인가
                // if(ch[i]=='0' || ch[i]=='1' ||ch[i]=='2' ||ch[i]=='3' ||ch[i]=='4' ||ch[i]=='5' ||ch[i]=='6' ||ch[i]=='7' ||ch[i]=='8' ||ch[i]=='9' ) 
                if(ch[i]<'0' || ch[i]>'9'){
                    answer = false;
                   break;
                    
                }else {
                     System.out.println(ch[i] + " : answer ->  "+ answer);
                    answer = true;
                    // break;
                }
            }else break;
        }
    
        return answer;
    }
}