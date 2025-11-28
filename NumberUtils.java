public class NumberUtils {

    public static int findEqualLengthNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int abs = Math.abs(nums[i]);
            String numString = "" + abs;
            if (numString.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
