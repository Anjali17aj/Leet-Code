//Brute force approach. 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int arr[] = {i,j};
                    return arr;
                }
            }
        }
        return null;
    }
}
//TC =n square
//its not an optimal and better approach.