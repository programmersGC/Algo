import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

       
    }
}