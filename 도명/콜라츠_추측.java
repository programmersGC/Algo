/* 왜 long으로 값 복사해서 풀어야되는겨?! long으로 하자마자 통과돼서 열받는다
그리고 전위, 후위 헷갈리지말자 */

class Solution {
    public int solution(int number) {
        long num = number;
        int answer = 0;
        while(num != 1){
            if(num % 2 == 0){
                num = num / 2;           
            } else{
                num = (num * 3) + 1;      
            }         
            ++answer; 
        }   
         if(answer >= 500){
                return -1;
            }     
        return answer;        
    }
}