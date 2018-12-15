/**
 * https://www.geeksforgeeks.org/maximum-profit-by-buying-and-selling-a-share-at-most-k-times/
 * https://www.youtube.com/watch?v=oDhu5uGq_ic
 *
 */
public class MaxStockProfit {

    public static void main(String[] args){
        int[] prices = {10, 22, 5, 75, 65, 80};
        int maxTrans = 2;
        System.out.println(maxProfit(prices, maxTrans));
    }

    static int maxProfit(int[] prices,int maxTrans){
        int[][] profitArray = new int[maxTrans + 1][prices.length];
        for(int t = 0; t <= maxTrans; t++){
            for(int i = 0; i < prices.length; i++){
                profitArray[t][i] = getProfit(profitArray, prices, t, i);
            }
        }
        return profitArray[maxTrans][prices.length - 1];
    }

    private static int getProfit(int[][] profitArray, int[] prices, int tranCnt, int day){
        if(tranCnt == 0 || day == 0)
            return 0;
        int maxProfit = 0;
        for(int i = 0; i < day; i++){
            int profitWithTran = profitArray[tranCnt - 1][i] + prices[day] - prices[i];
            if(profitWithTran > maxProfit)
                maxProfit = profitWithTran;
        }
        return Math.max(profitArray[tranCnt][day - 1], maxProfit);
    }
}
