import java.util.Arrays;

class Solution {
    public int[] solution(int[] prices) {
        int [] p_cnt = new int [prices.length];
        
        for(int i =0 ; i < prices.length ; i++) {
            int cnt= 0 ; 
            for(int j = i+1 ; j < prices.length ; j++) {
                cnt++;
                if (prices[i] > prices[j]) {
                    p_cnt[i]=cnt; 
                    break;
                } else {
                    p_cnt[i]=cnt;
                }
            }
        }
        
        return p_cnt;
    }
}