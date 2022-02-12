class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
          int[][] arr = new int[arr1.length][arr1[0].length]; 
          // 두 행렬은 행과 열의 크기가 같으므로 임의로 한 배열의 크기로 배열을 선언한다.
          // arr1배열의 행의 개수, arr1배열의 열의 개수 선언 => arr1과 arr2는 행과 열의 크기가 같음
          /* 2차원 배열에서의 .length => 행의 개수를 나타냄
             각 행마다 별도의 length필드가 있으며 배열변수[인덱스].length는 각 행이 가지고 있는 열의 개수를 나타냄 */
          for(int i=0; i<arr1.length; i++) {  // 행렬의 행만큼 반복
              for(int j=0; j<arr1[0].length; j++) { // 행렬의 열만큼 반복
                  arr[i][j] = arr1[i][j] + arr2[i][j]; 
                  // 각 행렬의 index 값을 더해 새로운 행렬의 index에 더한다.
              }
          }
        
          return arr;
      }
    }

