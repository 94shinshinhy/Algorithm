import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> s = new Stack<Integer>();
		Integer[] boxed = Arrays.stream(ingredient).boxed().toArray(i -> new Integer[i]);
		Queue<Integer> q = new LinkedList<Integer>(Arrays.asList(boxed));
		int temp = 0;
		int answer = 0;
		
		while(!q.isEmpty()) {
			s.add(q.poll());
			
			if(s.size() >= 4 && s.peek() == 1) {
				temp = 0;
				temp += s.get(s.size()-1);
				temp += s.get(s.size()-2) *10;
				temp += s.get(s.size()-3) *100;
				temp += s.get(s.size()-4) *1000;
				
				if(temp == 1231) {
					answer++;
					for(int i=0; i<4; i++) {
						s.pop();
					}
				}
			}
		}
		
		return answer;
    }
}