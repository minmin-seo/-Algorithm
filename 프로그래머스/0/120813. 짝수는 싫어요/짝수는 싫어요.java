class Solution {
    public int[] solution(int n) {
		if (n % 2 == 0) {
			int[] answer = new int[n / 2];
			int cnt = 0;
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 1) {
					answer[cnt] = i;
					cnt++;
				} else {
					continue;
                }
			}
			return answer;
			} else {
			int[] answer = new int[n / 2 + 1];
			int cnt = 0;
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 1) {
					answer[cnt] = i;
					cnt++;
				} else {
					continue;
				}
			}
			return answer;
		}
    }
}
