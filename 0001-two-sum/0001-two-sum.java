class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2]; // to store the indices of the two numbers
        for (int i = 0; i < nums.length; i++) { // loop through each element in the array
            for (int j = i + 1; j < nums.length; j++) { // loop through the rest of the array to find the other number
                int sum = nums[i] + nums[j]; // calculate the sum of the two numbers
                if (sum == target) { // check if the sum equals the target value
                    ans[0] = i; // store the indices of the two numbers
                    ans[1] = j;
                    return ans; // return the answer
                }
            }
        }
        return ans; // if no such numbers exist, return an empty vector
    }
}