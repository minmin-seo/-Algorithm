import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
        List <Integer> list = new ArrayList<>();
        
        for (int i = 0 ; i < my_string.length() ; i ++) {
			if ( Character.isDigit(my_string.charAt(i))) {
				list.add((int) my_string.charAt(i)- '0');
			}
		}
        
        int[] answer = new int [list.size()];
        
        for (int j = 0; j < list.size() ; j++) {
			answer[j] = list.get(j);
		}
        
        Arrays.sort(answer);
        return answer;
    }
}