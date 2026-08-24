import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Map<Integer , Integer> m = new HashMap <>();
        
        for (int i : array) {
            m.put(i, m.getOrDefault(i,0)+1);
        }
        int max = 0;
		
		for (int key : m.keySet()) {
			int cnt = m.get(key); 
			
			if( cnt>max) {
				max = cnt;
				answer = key;
				
			} else if (max == cnt) {
				answer = -1;
				}
		}
        return answer;
    }
}