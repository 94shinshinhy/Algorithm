import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
		Arrays.fill(answer, "");
		
		for(int i=0; i<arr1.length; i++) {
			String conv1 = Integer.toBinaryString(arr1[i]);
			String conv2 = Integer.toBinaryString(arr2[i]);
			
			conv1 = fillZero(n, conv1);
			conv2 = fillZero(n, conv2);
			
			for(int j=0; j<arr1.length; j++) {
				if(conv1.charAt(j) == '1' || conv2.charAt(j) == '1') {
					answer[i] += "#";
				} else {
					answer[i] += " ";
				}
			}
		}
		
		return answer;
	}
	
	public static String fillZero(int n, String s) {
		StringBuilder sb = new StringBuilder();
		
		if(s.length() != n) {
			for(int i=0; i<n-s.length(); i++) {
				sb.append("0");
			}
		}
		
		sb.append(s);
		
		return sb.toString();
	}
}