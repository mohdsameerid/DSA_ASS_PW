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




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  **Q2.** Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// - Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// - Return k.

// **Example :**
// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_*,_*]

// leetcode - https://leetcode.com/problems/remove-element/description/

// Solution
class Solution {
    public int removeElement(int[] nums, int val) {
        // Counter for keeping track of elements other than val
        int count = 0;
        // Loop through all the elements of the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is not val
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





// Question3 

// 💡 **Q3.** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// **Example 1:**
// Input: nums = [1,3,5,6], target = 5
// leetcode Question - https://leetcode.com/problems/search-insert-position/description/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = nums.length; // Default answer when target is greater than all elements
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid; // Update the answer to the current index
                end = mid - 1;
            }
        }
        
        return ans;
    }
} 