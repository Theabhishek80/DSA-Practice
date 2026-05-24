package BinearySearch;
// 34. Find First and Last Position of Element in Sorted Array
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.


public class Leetcode34 {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);

        System.out.println("First Index: " + result[0]);
        System.out.println("Last Index: " + result[1]);
    }

    // Main function
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = findIndex(nums, target, true);   // find first position
        ans[1] = findIndex(nums, target, false);  // find last position

        return ans;
    }

    // Binary search function
    static int findIndex(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Target found
                ans = mid;

                if (findStartIndex) {
                    end = mid - 1;   // move LEFT
                } else {
                    start = mid + 1; // move RIGHT
                }
            }
        }

        return ans;
    }
}
        