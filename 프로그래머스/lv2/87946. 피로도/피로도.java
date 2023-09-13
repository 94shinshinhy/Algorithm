class Solution {
	public static int answer = 0;
    public static boolean[] v;
    
    public int solution(int k, int[][] dungeons) {		
        v = new boolean[dungeons.length];
		int cnt = 0;
		
		dfs(k, dungeons, cnt);
		
		return answer;
    }
    
    public static void dfs(int k, int[][] dungeons, int cnt) {		
		for(int i=0; i<dungeons.length; i++) {
			if(v[i]) continue;			
			
			if(k >= dungeons[i][0]) {
				v[i] = true;
				dfs(k-dungeons[i][1], dungeons, cnt+1);
				v[i] = false;
			}
		}
		answer = Math.max(answer, cnt);
	}
}