public class duplicate {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 2, 3, 3, 4, 6, 99};
        int newLength = s.removeDuplicates(nums);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
