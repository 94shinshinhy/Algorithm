import java.util.*;

class Solution {
    public String solution(String x, String y) {
        PriorityQueue<String> q = new PriorityQueue<String>(Collections.reverseOrder());
		String[] x_split = x.split("");
		String[] y_split = y.split("");
		PriorityQueue<String> x_q = new PriorityQueue<String>(Arrays.asList(x_split));
		PriorityQueue<String> y_q = new PriorityQueue<String>(Arrays.asList(y_split));
		String x_temp = "";
		String y_temp = "";
		
		StringBuilder answer = new StringBuilder();
		
		while(!(x_q.isEmpty() || y_q.isEmpty())) {
			x_temp = x_q.peek();
			y_temp = y_q.peek();
			
			if(x_temp.equals(y_temp)) {
				q.add(x_q.poll());
				y_q.poll();
			} else if(Integer.parseInt(x_temp) > Integer.parseInt(y_temp)) {
				y_q.poll();
			} else {
				x_q.poll();
			}
		}
		
		if(q.isEmpty()) {
			answer.append("-1");
		} else if("0".equals(q.peek())) {
			answer.append("0");
		} else {
			while(!q.isEmpty()) {
				answer.append(q.poll());
			}
		}
		
		return answer.toString();
    }
}