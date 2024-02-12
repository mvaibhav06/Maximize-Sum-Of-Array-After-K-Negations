import java.util.Arrays;

public class MaxSum {
    public static int largestSum(int[] nums, int k){

        for (int i=0; i<k; i++){
            Arrays.sort(nums);
            nums[0] = -1*nums[0];
        }

        return Arrays.stream(nums).sum();
    }

    public static void main(String[] args) {
        int[] nums = {-2,5,0,2,-2};
        System.out.println(largestSum(nums,3));
    }
}
