import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        Arrays.sort(array); 
            
        for(int i =0 ; i<array.length ; i++) {
            if ((Math.abs(array[i] - n)) <min ) {
                min = (Math.abs(array[i] - n));
            }
        }
        for(int i =0 ; i<array.length ; i++) {
            if((Math.abs(array[i] - n)==min)) {
                answer = array[i];
                break;
            }
        }
        
        
        return answer;
    }
}