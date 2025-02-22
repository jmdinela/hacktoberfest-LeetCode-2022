/* 
217. Contains Duplicate
Easy

6747

1029

Add to List

Share
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/ 
class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Approach 1. Bruteforce O(N^2)
		// for(int i=0; i<nums.length-1; i++) {
		// 	for(int j=i+1; j<nums.length; j++) {
		// 		if(nums[i] == nums[j]) {
		// 			return true;
		// 		}
		// 	}
		// }
		// return false;
        
        //Approach 2. Using Sort 
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
        
    }
}