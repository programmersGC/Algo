import java.util.Scanner;

// 문자열 다루기 기본 => 프로그래머스 문제
class Solution {
    public boolean solution(String str) {
        if(str.length() == 4 || str.length() == 6) {
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(ch < '0' || ch > '9')
					return false;
			}
			return true;
		} else
			return false;
    }
}

// + 문장 입력, 설명 디테일 추가 (4-16라인 주석필요)
public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	
    	System.out.printf("문장을 입력해주세요: ");
    	String str = input.nextLine();
    	solution(str);
    	
    	if(solution(str) == true) {
    		System.out.println("완벽한 문장입니다!");
    	} else{
    		System.out.println("문장의 길이가 4 또는 6이 아니거나 문자가 섞여있습니다.");
    	}
    }

	private static boolean solution(String str1) {		
		if(str1.length() == 4 || str1.length() == 6){
			for(int i = 0; i < str1.length(); i++){
				char ch = str1.charAt(i);
				if(ch < '0' || ch > '9')
					return false;
			}
			return true;

		} else{
			return false;
		}
	}
}

