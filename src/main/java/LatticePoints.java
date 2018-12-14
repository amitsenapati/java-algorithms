/**
 * https://www.geeksforgeeks.org/circle-lattice-points/
 */

public class LatticePoints {

    public static void main(String[] args){
        int radius = 5;
        int latticePointCnt = getLatticePointCount(radius);
        System.out.println("lattice point count: " + latticePointCnt);
    }

    static int getLatticePointCount(int radius){
        int count = 0;
        for(int x = radius * -1; x <= radius; x++){
            for(int y = radius * -1; y <= radius; y++){
                if(Math.sqrt(x *x + y * y) == 5){
                    count++;
                }
            }
        }
        return count;
    }
}
