import java.util.Arrays;

public class practice {

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return nums;
    }
}


//nums = [2,7,11,15], target = 9
