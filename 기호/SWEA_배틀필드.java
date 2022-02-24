import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 배틀필드 {
	//					좌 상 우 하
	static int []dr = {0,0,-1,0,1};
	static int []dc = {0,-1,0,1,0};
	public static void main(String[] args) throws Exception{
		//System.setIn(new FileInputStream("sample_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		for (int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			char[][] map = new char[H][W];
			for (int i = 0; i < H; i++) {
				map[i]=br.readLine().toCharArray();
			}
			//			print(map);
			int num = Integer.parseInt(br.readLine());
			char[] order = br.readLine().toCharArray();

			//현재 탱크 위치 찾기
			int nr=0,nc=0;
			char tank;
			int dir=0;
			xx:for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if(map[i][j]=='<'||map[i][j]=='v'||map[i][j]=='^'||map[i][j]=='>') {
						nr=i;
						nc=j;
						tank =map[i][j];
						if(tank=='<') dir =1; 
						if(tank=='^') dir =2; 
						if(tank=='>') dir =3; 
						if(tank=='v') dir =4; 
						break xx;
					}
				}
			}
			//명령 시작

			for (int i = 0; i < order.length; i++) {
				//시작할때 포탄위치 = 탱크위치
				int shotR =nr;
				int shotC =nc;
				//System.out.println(order[i]);
				if(order[i]=='S') {
					while(true) {
						if(shotR +dr[dir]>=0 && shotC +dc[dir]>=0 && shotC +dc[dir]<W &&shotR +dr[dir]<H) {
							//범위를 벗어나지 않는다면 일단 dir방향으로 포탄 발사
							shotR = shotR +dr[dir];
							shotC = shotC +dc[dir];

							//발사된 포탄의 자리 확인
							if(map[shotR][shotC] =='.' || map[shotR][shotC] =='-') {
								
								continue;
							}
							if(map[shotR][shotC]=='*') {
								map[shotR][shotC]='.';
								break;
							}
							if(map[shotR][shotC]=='#') {
								break;
							}
						}else {
							break;
						}
					}
				}if(order[i]=='U') {
					//방향바꾸고
					dir = 2;
					tank ='^';
					//조건에 맞으면 전진
					if(nr +dr[dir]>=0 && nc +dc[dir]>=0 && nc +dc[dir]<W &&nr +dr[dir]<H) {
						if(map[nr +dr[dir]][nc +dc[dir]]=='.') {
							map[nr][nc]='.';// 지나간 땅은 바꾸고
							nr = nr+dr[dir];
							nc = nc+dc[dir];
							map[nr][nc]=tank;
						}else {
							map[nr][nc]=tank;

						}
					}
				}if(order[i]=='D') {
					//방향바꾸고
					dir = 4;
					tank ='v';
					//조건에 맞으면 전진
					if(nr +dr[dir]>=0 && nc +dc[dir]>=0 && nc +dc[dir]<W &&nr +dr[dir]<H) {
						if(map[nr +dr[dir]][nc +dc[dir]]=='.') {
							map[nr][nc]='.';// 지나간 땅은 바꾸고
							nr = nr+dr[dir];
							nc = nc+dc[dir];
							map[nr][nc]=tank;
						}else {
							map[nr][nc]=tank;

						}
					}
				}if(order[i]=='L') {
					//방향바꾸고
					dir = 1;
					tank ='<';
					//조건에 맞으면 전진
					if(nr +dr[dir]>=0 && nc +dc[dir]>=0 && nc +dc[dir]<W &&nr +dr[dir]<H) {
						if(map[nr +dr[dir]][nc +dc[dir]]=='.') {
							map[nr][nc]='.';// 지나간 땅은 바꾸고
							nr = nr+dr[dir];
							nc = nc+dc[dir];
							map[nr][nc]=tank;
						}else {
							map[nr][nc]=tank;

						}
					}
				}if(order[i]=='R') {
					//방향바꾸고
					dir = 3;
					tank ='>';
					//조건에 맞으면 전진
					if(nr +dr[dir]>=0 && nc +dc[dir]>=0 && nc +dc[dir]<W &&nr +dr[dir]<H) {
						if(map[nr +dr[dir]][nc +dc[dir]]=='.') {
							map[nr][nc]='.';// 지나간 땅은 바꾸고
							nr = nr+dr[dir];
							nc = nc+dc[dir];
							map[nr][nc]=tank;
						}else {
							map[nr][nc]=tank;

						}
					}
				}
			}
			System.out.print("#" +tc);
			print(map);
		}

	}

	private static void print(char[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);	
			}
			System.out.println();
		}

	}

}
