/*
풀다가 생각난 정렬 알고리즘 맨날까먹어
- 버블정렬: 앞의 수가 뒤의 수보다 크다면 둘의 위치를 바꿔라 (버블정렬은 인접한 두 숫자를 바꾸면서 정렬)
if(a[j] > a[j+1]){
    temp = a[j];
    a[j] = a[j+1];
    a[j+1] = temp;
}

- 선택정렬: 임시변수(min)의 위치에 있는 값 보다 작은 값이 있다면 그 값의 위치를 임시변수에 저장하라.
(선택정렬은 한 텀 돌 때 마다 가장 작은 값을 찾는 동작을 함)
for(...){
    if(array[j] < array[min]){
        min = j;
    }
}

- 삽입정렬: 값을 우측으로 쉬프트 하라 (삽입 정렬은 정렬하면서 쉬프트를 하는 특징이 있음)
for(...){
    a[j+1] = a[j];
}
*/

class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1){
            
            return new int[]{-1};
        }
        
        int min = 0;        
        for(int i = 0; i < arr.length; i++) {
            if(arr[min] > arr[i]) {
                    min = i;
            }
        }
        
        int[] answer = new int[arr.length-1];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(min == i) continue;
            answer[idx] = arr[i];
            idx++;
        }
        
        return answer;
    }
}