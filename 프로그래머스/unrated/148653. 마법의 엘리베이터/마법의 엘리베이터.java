import java.util.Arrays;

class Solution {
    public int solution(int storey) {
        String[] stringSplit = String.valueOf(storey).split("");
		int[] intSplit = Arrays.stream(stringSplit).mapToInt(str -> Integer.parseInt(str)).toArray();
		int temp = 0;
		
		for(int i=intSplit.length-1; i>0; i--) {
			if(intSplit[i] >= 10) {
				intSplit[i-1] += 1;
				intSplit[i] -= 10;
			}
			
			if(intSplit[i] == 0) continue;
			
			if(intSplit[i] == 5) {
				if(intSplit[i-1] < 5) {
					temp += intSplit[i];
				} else {
					temp += (10 - intSplit[i]);
					intSplit[i-1] += 1;
				}
			} else if(intSplit[i] > 5){
				temp += (10 - intSplit[i]);
				intSplit[i-1] += 1;
			} else if(intSplit[i] < 5) {
				temp += intSplit[i];
			}
		}
		
		if(intSplit[0] >= 10) {
			temp += 1;
			intSplit[0] -= 10;
		}
		
		if(intSplit[0] > 5) {
			temp += (10 - intSplit[0]);
			temp += 1;
		} else {
			temp += intSplit[0];
		}
		
		return temp;
    }
}