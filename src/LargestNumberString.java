import java.util.*;

class LargestNumberString {
    public String largestNumber(int[] nums) {
        // Convert the integers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the strings using a custom comparator
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                return str2.compareTo(str1);
            }
        });

        // if the largest numbers is 0
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Concatenate the strings to form the largest number
        StringBuilder sb = new StringBuilder();
        for (String strNum : strNums) {
            sb.append(strNum);
        }
        return sb.toString();
    }}