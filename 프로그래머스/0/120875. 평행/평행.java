class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double d1 = (double)(dots[0][0]-dots[1][0]) / (dots[0][1]-dots[1][1]); 
		double d2 = (double)(dots[0][0]-dots[2][0]) / (dots[0][1]-dots[2][1]); 
		double d3 = (double)(dots[0][0]-dots[3][0]) / (dots[0][1]-dots[3][1]); 
		double d4 = (double)(dots[1][0]-dots[2][0]) / (dots[1][1]-dots[2][1]); 
		double d5 = (double)(dots[1][0]-dots[3][0]) / (dots[1][1]-dots[3][1]); 
		double d6 = (double)(dots[2][0]-dots[3][0]) / (dots[2][1]-dots[3][1]); 
		
		double [] d = new double [6];
		d[0] = d1;
		d[1] = d2;
		d[2] = d3;
		d[3] = d4;
		d[4] = d5;
		d[5] = d6;
		
		if (d[0] == d[5]) {
            answer = 1;
            return answer;
        }
		
		if (d[1] == d[4])  {
            answer = 1;
            return answer;
        }
		
		if (d[2] == d[3]) {
            answer = 1;
            return answer;
        }
        
        return answer;
    }
}