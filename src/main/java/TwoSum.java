
public class TwoSum {

    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        for(int i : result){
            System.out.println(i);
        }
    }

}
