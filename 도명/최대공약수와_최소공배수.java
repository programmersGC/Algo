// 유클리드 호제법 참고 
// https://velog.io/@yerin4847/W1-%EC%9C%A0%ED%81%B4%EB%A6%AC%EB%93%9C-%ED%98%B8%EC%A0%9C%EB%B2%95
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = GCD(n, m);
        answer[1] = n * m / answer[0];
        // 최대공배수 = 두 수의 곱 / 두 수의 최대공약수
        
        return answer;
    }
    
    static int GCD(int n, int m){
        // 조건 n > m
        while(m != 0){ // m이 0이 될때까지
            int temp = n % m;
            n = m;
            m = temp;
        }
        return n;
    }
}