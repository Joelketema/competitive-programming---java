class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] smaller = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    smaller[i]++;
                }
            }
        }

        return smaller;

    }
}