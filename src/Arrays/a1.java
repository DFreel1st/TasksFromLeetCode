package Arrays;

public class a1 {
    int[] nums = {2, 7, 11, 15};
    int target = 9;


    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int one = target - nums[i];
            for (int y = i + 1; y < nums.length; y++) {
                if (nums[y] == one) {
                    return new int[]{i, y};
                }
            }
        }
        return new int[0];
    }
}
