import java.util.*;
class Solution {
    static int dr[] = {0,0,1,-1};
    static int dc[] = {1,-1,0,0};
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for(int t = 0; t< 5;t++){
            boolean[][] visit;
            char[][] map = new char[5][5];
            for(int i =0;i<5;i++){            
                    map[i] = places[t][i].toCharArray();    
            }
            
            xx: for(int r=0;r<5;r++){
                    for(int c=0;c<5;c++){
                    int dis=0;
                    visit = new boolean[5][5]; 
                    if(map[r][c]=='P'){ 
                        Queue<p> q = new LinkedList<>();
                        q.add(new p(r,c,dis+1));
                        visit[r][c] =true;
                        p cur;
                        int nr,nc;
                        while(!q.isEmpty()){
                            cur = q.poll(); 
                            //거리가 2일때는 
                            for(int d=0;d<4;d++){ 
                                nr = cur.r +dr[d];
                                nc = cur.c +dc[d];
                                if(nr>=0 && nc>=0 && nr<5 && nc<5 &&!visit[nr][nc]){
                                    if( map[nr][nc]=='P'){                                      
                                        answer[t] =0;
                                        break xx;
                                    }
                                    if(map[nr][nc]=='O'){
                                       if(cur.dis >=2){			
											continue ;
										}else if( cur.dis ==1){
											q.add(new p(nr,nc,cur.dis+1));
											visit[nr][nc] =true;
										}
                                    }
                                    if(map[nr][nc]=='X'){ 
                                        continue ;
                                    }
                                }
                            }
                        }  
                    } 
                    answer[t] =1;
                }
            }
        }
        
        return answer;
    }
}

class p{
    int r;
    int c;
    int dis;
    public p(int r, int c, int dis){
        this.r =r ;
        this.c= c;
        this.dis = dis;
    }
