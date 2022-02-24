import java.io.*;
import java.util.*;
public class B1541 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		int sum=0;
		int count=0;
		boolean flag =false;
		while(st.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(),"+");			
			while(st2.hasMoreTokens()) {
				count += Integer.parseInt(st2.nextToken());
			}
			
			if(!flag) {
				flag =true;
				sum = count;
				count=0;
			}
			
			sum-=count;
			count=0;
			System.out.println(sum);
			
		}

		System.out.println(sum);
	}

}
