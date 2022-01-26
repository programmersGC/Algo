import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};    
        int[] who = new int[3];
        
        for(int i = 0; i< answers.length; i++){
            if( a[i%5] == answers[i]) who[0] ++;
            if( b[i%8] == answers[i]) who[1] ++;
            if( c[i%10] == answers[i]) who[2] ++;
        }
        int max = 0;
        for(int i =0; i<3; i++){
            if(who[i]>=max) max =who[i];
        }
        ArrayList<Integer> ae = new ArrayList<>();
        
        for(int i =0; i<3; i++){
            if(who[i] == max) ae.add(i);
        }
        Collections.sort(ae);
        Arrays.sort(who);
        
        
        int cnt=1;
        for(int i =1; i>=0; i--){
            if(who[i]== who[2]) cnt++;
        }
        
         int answer[] = new int [cnt];
        for(int i=0; i<cnt;i++){
           answer[i] = ae.get(i)+1;
        }
        
        return answer;
        
    }
}