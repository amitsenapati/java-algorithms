/**
 * https://www.geeksforgeeks.org/printing-items-01-knapsack/
 * https://www.youtube.com/watch?v=nLmhmB6NzcM
 */

public class KnapSack {

    public static void main(String[] args){
        int[] val = {40, 100, 50, 60};
        int[] weights = {20, 10, 40, 30};
        int weight = 60;
        System.out.print(maxValue(val, weights, weight));
    }

    /**
     * totalVal[i][w] = Max {totalVal[i-1][w], totalVal[i-1][w-w[i] + val[i]}
     *
     * @param val
     * @param weights
     * @param weight
     * @return
     */
    static int maxValue(int[] val, int[] weights, int weight){
        int[][] totalVal = new int[val.length + 1][weight + 1];
        for(int i = 0; i <= val.length; i++){
            for(int w = 0; w <= weight; w++){
                if(i == 0 || w == 0)
                    totalVal[i][w] = 0;
                else if(w - weights[i -1] >= 0){
                    totalVal[i][w] = Math.max(
                            totalVal[i-1][w],
                            totalVal[i-1][w-weights[i-1]] + val[i-1]
                    );
                } else
                    totalVal[i][w] = totalVal[i-1][w];
            }
        }
        return totalVal[val.length][weight];
    }
}
