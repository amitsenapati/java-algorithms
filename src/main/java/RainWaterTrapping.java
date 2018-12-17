public class RainWaterTrapping {

    public static void main(String[] args){
        int[] towers = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(getCapacity(towers));
    }

    static int getCapacity(int[] towers){
        int totCapacity = 0;
        for(int i = 0; i < towers.length; i++){
            int leftMax = 0, capacity = 0;
            for(int l = 0; l <= i; l++){
                if(towers[l] > leftMax)
                    leftMax = towers[l];
            }
            int rightMax = 0;
            for(int r = i; r < towers.length; r++){
                if(towers[r] > rightMax)
                    rightMax = towers[r];
            }
            int height = Math.min(leftMax, rightMax);
            if(height > 0){
                capacity = height - towers[i];
                totCapacity += capacity;
            }
        }
        return totCapacity;
    }
}
