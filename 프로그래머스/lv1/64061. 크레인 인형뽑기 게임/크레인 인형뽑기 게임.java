import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
		Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<board.length; i++) {
			map.put(i+1, new ArrayList<Integer>());
		}
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board.length; j++) {
				if(board[i][j] != 0) {
				    map.get(j+1).add(board[i][j]);
				}
			}
		}
		
		System.out.println("map : " + map);
		
		for(int i=0; i<moves.length; i++) {
			if(map.get(moves[i]).size() != 0) {
				list.add(map.get(moves[i]).get(0));
				map.get(moves[i]).remove(0);
			}			
		}
		
		return res(list, answer);
    }
    
    public static int res(List<Integer> list, int answer) {
		int temp = answer;
		
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i) == list.get(i+1)) {
				list.remove(i);
				list.remove(i);
			    answer += 2;
			}
		}
		
		if(temp == answer) {
			return answer;
		} else {
			return res(list, answer);
		}
    }
}