public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here


        int level = 0; // level is at sea level
        int valleys = 0;  //number of valley at sea level initially

        for (char c : path.toCharArray())
        {
            if (c == 'U') {
                level++;
                if (level == 0)
                {
                    valleys++;
                }
            }
            else {
                level--;
            }
        }
        return valleys;

    }

}
