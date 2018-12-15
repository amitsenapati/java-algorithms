/**
 * https://www.geeksforgeeks.org/find-maximum-possible-stolen-value-houses/
 */
public class StealHouse {

    public static void main(String[] args){
        int[] hval = {6, 7, 1, 3, 8, 2, 4};
        System.out.println(getMaxStealValue(hval));
    }

    /**
     * max steal value at index i = maxOf(maxSteal[i-1], maxSteal[i-2] + hval[i])
     * @param hval
     * @return
     */
    static int getMaxStealValue(int[] hval){
        int[] maxSteal = new int[hval.length];
        for(int i = 0; i < hval.length; i++){
            switch (i){
                case 0:
                    maxSteal[i] = hval[0];
                    break;
                case 1:
                    maxSteal[i] = Math.max(maxSteal[i-1], hval[i]);
                    break;
                default:
                    maxSteal[i] = Math.max(maxSteal[i-1], hval[i] + maxSteal[i-2]);
                    break;
            }
        }
        return maxSteal[hval.length - 1];
    }
}
