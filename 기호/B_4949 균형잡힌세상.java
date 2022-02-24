import java.io.*;
import java.util.*;
public class sdma {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		xx:while(true) {
			String str = br.readLine();
			if(str.equals(".")) break;
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < str.length(); i++) {

				if(stack.isEmpty()) { //큐가 비어있으면 넣어야지
					if(str.charAt(i)==')'||str.charAt(i)==']') {
						System.out.println("no");
						stack.clear();
						continue xx;
					}else if(str.charAt(i)=='('||str.charAt(i)=='['){
						stack.push(str.charAt(i));
					}else {
						continue;
					}
				}
				
				
				else{ //큐가 안비어있으면 확인해야지
					if(stack.peek()=='(') {
						if(str.charAt(i)==')') {
							stack.pop();
						
						}
						
						else if(str.charAt(i)==']') {
							System.out.println("no");
							stack.clear();
							continue xx;
						}
						
						else if(str.charAt(i)=='[') {
							stack.push(str.charAt(i));
						}
						else if(str.charAt(i)=='(') {
							stack.push(str.charAt(i));
						}
					}
					else if(stack.peek()=='[') {
						if(str.charAt(i)==']') {
							stack.pop();
						}
						
						else if(str.charAt(i)=='(') {
							stack.push(str.charAt(i));
							
						}
						
						else if(str.charAt(i)==')') {
							System.out.println("no");
							stack.clear();
							continue xx;
						}else if(str.charAt(i)=='[') {
							stack.push(str.charAt(i));
						}
					}
				}
			//	System.out.println(stack.toString());
			}
			if(stack.isEmpty()==false) {
				System.out.println("4no");
				stack.clear();
			}else
			System.out.println("yes");
		}

	}
}


