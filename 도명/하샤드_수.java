// 4 - 20줄 내가푼거 22 - 37줄 인터넷 참고... 나 왜케 어렵게 풀었지

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String number = String.valueOf(x);
        String[] num = number.split("");
    
        int ha = 0;
        for(int i = 0; i < num.length; i++){
            ha += Integer.parseInt(num[i]);
        }
        if(x % ha == 0){
            return answer;
        } else{
            return false;
        }
    }
}

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0; // 자릿수의 합
        int n = x; // 나누기 위해 x 값을 저장해둔다.
        
        while(x != 0){ // x가 0이 될 때 까지 각 자릿수를 추출해 더해준다.
            sum+= x % 10;
            x /= 10;
        }
        
        // 나누어 떨어지면 하샤드 수
        if(n % sum == 0) return answer;
        // 아니면 false 반환.
        return false;
    }
}