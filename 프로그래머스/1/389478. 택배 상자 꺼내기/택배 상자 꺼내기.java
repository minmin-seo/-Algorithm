import java.util.Stack;
class Solution {
    public int solution(int n, int w, int num) {
        int cnt = 1;
			int ans_stack = 0;
			int ans = 0;
			int popped = 0;

			Stack<Integer>[] stacks = new Stack[w];

			for (int i = 0; i < w; i++) {
				stacks[i] = new Stack<>();
			}

			while (cnt <= n) {
				for (int i = 0; i < w && cnt <= n; i++) {
					if (cnt == num) {
						ans_stack = i;
					}
					stacks[i].push(cnt);
					cnt++;
				}

				for (int i = w - 1; i >= 0 && cnt <= n; i--) {
					if (cnt == num) {
						ans_stack = i;
					}
					stacks[i].push(cnt);
					cnt++;
				}
			}

			for (int i = 0; i < n / w + 1; i++) {
				popped = stacks[ans_stack].pop();
				ans++;

				if (popped == num) {
					break;
				}

			}
        
        return ans;
    }
}