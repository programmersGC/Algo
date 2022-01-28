import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.ArrayList;
public class iSharp {
	static int n,m,k;
	static int[][] map;
	static boolean[][] visit;
	static int dr[] = {1,0,0,-1};
	static int dc[]= {0,1,-1,0};
	public static void main(String[] args)  throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		map = new int[n][m];
		visit = new boolean[n][m];
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			map[Integer.parseInt(st.nextToken())-1][Integer.parseInt(st.nextToken())-1] =1;	
		}
		Queue<food> q = new LinkedList<>();
		int nr,nc;
		int max_size=0;
		int cnt;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				cnt=0;
				if(map[i][j]==1 && !visit[i][j]) {
					q.add(new food(i,j));
					visit[i][j]=true;
					food f;
					cnt++;
					while(!q.isEmpty()) {
						f =q.poll();
						for (int k = 0; k < 4; k++) {
							nr = f.r +dr[k];
							nc = f.c +dc[k];
							if(nr>=0 && nc>=0 && nr <n && nc <m &&map[nr][nc]==1 && !visit[nr][nc]) {
								q.add(new food(nr,nc));
								visit[nr][nc]=true;
								cnt++;
							
							}
						}
					}
				}
				
				max_size = Math.max(max_size,cnt);
			}
		}
		System.out.println(max_size);



	}
}
class food{
	int r;
	int c;
	public food(int r, int c) {
		this.r =r;
		this.c =c;
	}
}
