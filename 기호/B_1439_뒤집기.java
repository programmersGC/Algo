import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		int cnt1=0;
		
		int min=Integer.MAX_VALUE;
		char cur;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(0) =='0') {
				if(str.charAt(i)=='1') {
					
					cnt1++;
					while(true) {
						if(i+1 < str.length()) {
							i++;
						}else {
							break;
						}
						//System.out.println(i);
						str.charAt(i);
						if(str.charAt(i)=='0') break;
					}	
				}
			}
			
			if(str.charAt(0) =='1') {
				if(str.charAt(i)=='0') {	
					cnt1++;
					while(true) {
						if(i+1 < str.length()) {
							i++;
						}else {
							break;
						}
						str.charAt(i);
						if(str.charAt(i)=='1') break;
					}
					
				}
			}
		}
		min = Math.min(min, cnt1);
		
		System.out.println(min);
	}
}
