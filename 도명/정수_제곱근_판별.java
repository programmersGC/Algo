class Solution {
    public long solution(long n) {
        long sqrt = (long)Math.sqrt(n);
        
        if(n == Math.pow(sqrt, 2)){
            return (long)(Math.pow(sqrt + 1, 2));
        } else{
            return -1;
        }
    }
}

// Math.pow(숫자, 거듭제곱 횟수): 거듭제곱 계산 함수 
// Math.sqrt(숫자): 제곱근 구해주는 함수