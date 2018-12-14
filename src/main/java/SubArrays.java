public class SubArrays {

    private static final int[] array = new int[]{1, 2, 3, 4, 5, 8};

    public static void main(String args[]){

//        generate all sub arrays of the given array

        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(array[k]);
                }
                System.out.println();
            }
        }
    }
}
