class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int min=prices[0];
        int maxp=0;
        for(int i=1;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }else{
                int pro=prices[i]-min;
                if(pro>maxp){
                    maxp=pro;
                }
            }
        }
        return maxp;
    }
}