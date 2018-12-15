/**
 * https://www.geeksforgeeks.org/find-the-minimum-distance-between-two-numbers/
 */
public class MinimumDistance {

    public static void main(String[] args){
        int[] input = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        int x = 3, y = 6;
        System.out.println(getMinimumDistance(input, x, y));
    }

    static int getMinimumDistance(int[] input, int x, int y){
        int xIndex = -1, yIndex = -1, minDistance = Integer.MAX_VALUE;
        for(int i = 0;i < input.length; i++){
            if(input[i] == x)
                xIndex = i;
            if(input[i] == y)
                yIndex = i;
            if(xIndex != -1 && yIndex != -1){
                if((Math.abs(xIndex - yIndex) < minDistance))
                    minDistance = Math.abs(xIndex - yIndex);
            }
        }
        return minDistance;
    }
}
