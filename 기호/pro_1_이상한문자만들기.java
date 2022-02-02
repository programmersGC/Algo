import java.util.*;
import java.io.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int mok=0;
        String[] str = s.split("");
        for(int i =0 ; i< str.length;i++){
            if(str[i].equals(" ")){
                mok =0;
            }else if(mok % 2 ==0){
                str[i] = str[i].toUpperCase();
                mok++;
            }else if(mok % 2 ==1){
                str[i] =str[i].toLowerCase();
                mok++;
            }
        }
        for(int i =0; i<str.length; i++){
            answer +=str[i];
        }
        return answer;
    }
}