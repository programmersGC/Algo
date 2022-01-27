import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayList;
public class iSharp {

	public static void main(String[] args)  throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<String> q = new LinkedList<>();

		while(true) {
			q.add(st.nextToken());
			if(!st.hasMoreTokens()) break;

		}
		String same = q.poll();
		Stack<Character> stack = new Stack<>();
		//same.trim();

		for (int i = 0; i < q.size(); i++) {
			while(true) {

				String tmp=q.poll();
				tmp = tmp.replace("[]", "-");
				//tmp.trim();
			
				char[] c = new char[tmp.length()];
				for (int j = 0; j < tmp.length()-1; j++) {
					c[j] = tmp.charAt(j);
				}
				//출력
				System.out.print(same);
				
				boolean flag =false;

				for (int j = tmp.length()-2; j >=0; j--) {
					if(!flag &&(65<= c[j]&& c[j] <=90 || 97<=c[j] &&c[j] <= 122)) {
						System.out.print(" ");
						stack.add(c[j]);
						flag=true;
					}
					else if(c[j]=='-') {
						System.out.print("[]");
					}
					else if(c[j]=='&') {
						System.out.print('&');
					}
					else if(c[j]=='*') {
						System.out.print('*');
					}
					else{
						stack.add(c[j]);
						//System.out.println("여기서 더해짐 "+ c[j]);
					}
					
				}
				while(true) {
					if(stack.isEmpty()) break;
					System.out.print(stack.pop());
				}
				System.out.print(";");
				System.out.println();

				if(q.isEmpty()) break;
			}
		}
	}
}
