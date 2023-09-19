import java.util.*;

class Solution {
    public static final int S = 1;
	public static final int D = 2;
	public static final int T = 3;
	public static final String STAR = "*";
	public static final String ACHA = "#";
    
    public int solution(String dartResult) {
        Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("S", S);
		map.put("D", D);
		map.put("T", T);
		
		Queue<String> q = new LinkedList<String>();
		for(int i=0; i<dartResult.length(); i++) {
			q.add(String.valueOf(dartResult.charAt(i)));
		}
		
		Stack<Integer> s = new Stack<Integer>();
		
		int i = 0;
		int temp = 0;
		int answer = 0;
		
		while(!q.isEmpty()) {
			i = Integer.parseInt(q.poll());
			
			if("0".equals(q.peek())) {
				q.poll();
				i = 10;
			}

			temp = (int) Math.pow(i, map.get(q.poll()));
			
			if(STAR.equals(q.peek())) {
				q.poll();
				temp = temp * 2;
				if(!s.isEmpty()) {
				    answer += s.peek();
				}
			} else if(ACHA.equals(q.peek())) {
				q.poll();
				temp = -temp;
			}
			
			answer += temp;
			
			s.add(temp);
		}
		
		return answer;
    }
}