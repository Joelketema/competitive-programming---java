class Solution {
    public int minPairSum(int[] nums) {
    Arrays.sort(nums);
    int startIndex = 0;
    int endIndex = nums.length - 1;
    int maximumPairSum = -1;
    while (startIndex < endIndex) {
      int currSum = nums[startIndex++] + nums[endIndex--];

      if(maximumPairSum == -1) maximumPairSum = currSum;
      else maximumPairSum = Math.max(maximumPairSum, currSum);
    }
    return maximumPairSum;
  }
        
    }
