class Solution {
    public boolean isArth(ArrayList<Integer> temp){        
    if(temp.size() == 2) return true;
        int diff = temp.get(1) - temp.get(0);
        for(int k=2;k<temp.size();k++){
            // System.out.print("DIFF: " + diff + "\n");
            // System.out.print(temp.get(k) - temp.get(k-1) + "r\n");
            if(temp.get(k) - temp.get(k-1)!=diff) return false;
    }
    return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

            ArrayList<Boolean> ans = new ArrayList<Boolean>();
     

            for(int i=0;i<l.length;i++){
                int firstIndex = l[i];
                int lastIndex = r[i];

                ArrayList<Integer> temp = new ArrayList<Integer>();
                for(int j=firstIndex;j<=lastIndex;j++){
                    temp.add(nums[j]);
                }
                // System.out.print(temp);
                // System.out.print("\n");
                Collections.sort(temp);

                if(isArth(temp)) ans.add(true);
                else    ans.add(false);
            }

            return ans;
    }
}
