import java.util.Arrays;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

		if (denom1 == denom2) {
			int n = numer1 + numer2;
			int d = denom1 + denom2;
			if (denom1 >= n) {
				for (int i = n; i > 0; i--) {
					if (n % i == 0 && denom1 % i == 0) {
						answer[0] = n / i;
						answer[1] = denom1 / i;
						break;
					}
				}
			} else {
				for (int i = denom1; i > 0; i--) {
					if (denom1 % i == 0 && n % i == 0) {
						answer[0] = n / i;
						answer[1] = denom1 / i;
						break;
					}
				}
			}
		} 
		
		else if (denom1 != denom2) {
			int resultd = denom1*denom2;
			int resultn = numer1*denom2 + numer2*denom1;
			if (resultd >= resultn) {
				for (int i = resultn; i > 0; i--) {
					if (resultn % i == 0 && resultd % i ==0) {
						answer[0] = resultn / i;
						answer[1] = resultd / i;
						break;
					}
				}
			} else {
				for (int i = resultd; i > 0; i--) {
					if (resultd % i == 0 && resultn % i == 0) {
						answer[0] = resultn / i;
						answer[1] = resultd / i;
						break;
					}
				}
			}
			
		}
			// answer = Arrays.toString(answer);
		
        
        
        
        
        return answer;
    }
}