class Solution {
    boolean solution(String s) {
         
        boolean answer = true;

        int sum = 0; 
        
        outer:  
        for (int i = 0 ; i <s.length() ; i++) {
         char c = s.charAt(i);
         if (c == '(') {
        	 sum += 1;
         } else {
        	 sum-=1;
         }
         
         if (sum <0) {
        	 answer = false;
        	 break outer;
         }
         
        }
        
        if(sum==0) {
       	 answer = true;
        } else {
       	 answer = false;
        }
        
 
        return answer;
        }   }
