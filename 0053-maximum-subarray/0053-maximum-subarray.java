class Solution {
    public int maxSubArray(int[] nums) {
       
      int maxSum = Integer.MIN_VALUE;
      int CurrSum = 0;
      for (int i = 0; i < nums.length; i++) {
        CurrSum += nums[i];
        if(CurrSum > maxSum)
        maxSum = CurrSum;
        if(CurrSum<0)
        CurrSum=0;
      }
      return maxSum;
    }
}