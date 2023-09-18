import java.util.*;

class Solution {
    public int[] solution(int n, int[] stages) {
        int[] answer = new int[n];
		int[] compare = new int[n];

		double fail = 0.0;

		Map<Integer, Double> map = new HashMap<Integer, Double>();
		
		for(int i=0; i<n; i++) {
			compare[i] = i+1;
			int clear = 0;
			int stay = 0;
			for(int j=0; j<stages.length; j++) {
				if(compare[i] == stages[j]) stay++;
				if(compare[i] < stages[j]) clear++;
			}
            if(stay == 0 && clear == 0){
                fail = 0;
            } else{
			    fail = (double)stay / ((double)stay + (double)clear);}
			map.put(compare[i], fail);
		}
		
		List<Integer> list = new ArrayList<>(map.keySet());
		List<Integer> list2 = new ArrayList<Integer>();
		
		Collections.sort(list, (value1, value2) -> map.get(value2).compareTo(map.get(value1)));
		
		for(Integer i : list) {
			list2.add(i);
		}
		
		//answer = list2.stream().mapToInt(i -> i).toArray();
		answer = list2.stream().mapToInt(i -> i.intValue()).toArray();
		
		System.out.println(Arrays.toString(answer));
		
        
        return answer;
    }
}