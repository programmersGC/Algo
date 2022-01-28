class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int t =x;
        int sum=0;
        for(int i = 4; i >= 0 ; i--){
            sum+= x / Math.pow(10,i);
            x = x % (int)(Math.pow(10,i));
        }

        if(t % sum !=0) { 
            answer = false;
        }
        return answer;
    }
}