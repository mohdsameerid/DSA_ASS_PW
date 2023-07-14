// Question Link -https://leetcode.com/problems/two-sum/description/
// 💡 **Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// **Example:**
// Input: nums = [2,7,11,15], target = 9
// Output0 [0,1]

// **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1][

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2]; 
        int n = nums.length;
        for(int i = 0;i < n;i++){
            for(int j = i+1;j<n;i++){
                if(nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
}
