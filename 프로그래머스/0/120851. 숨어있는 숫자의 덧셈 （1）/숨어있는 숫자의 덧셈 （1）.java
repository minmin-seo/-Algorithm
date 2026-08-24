class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
		int sum = 0;
		
		for (int i = 0 ; i < my_string.length() ; i++) {
			if(Character.isDigit(my_string.charAt(i))) {
				sum+=Character.getNumericValue(my_string.charAt(i));
			}
		}
		answer =sum;
        
        return answer;
    }
}