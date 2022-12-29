class KthLargest {
    public String kthLargestNumber(String[] nums, int k) {
        // Arrays.sort(nums,Collections.reverseOrder());


        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Long.parseLong(nums[i]) < Long.parseLong(nums[j])){
                    String temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }


        // for(String i : nums){
        //     System.out.print(i + " ");
        // }

        // System.out.print("\n");

        String largest = "";
        for(int i=0;i<=k;i++){
            if(i == k){
                largest = nums[i-1];
            }
        }
        return largest;

    }
}