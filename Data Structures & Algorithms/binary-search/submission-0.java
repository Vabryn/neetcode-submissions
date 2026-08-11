class Solution {
    public int search(int[] nums, int target) {
        int lowIndex = 0;
        int highIndex = nums.length - 1;


        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;

            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] > target) {
                highIndex = midIndex - 1;
            } else {
                lowIndex = midIndex + 1;
            }
        }
        return -1;
    }
}
