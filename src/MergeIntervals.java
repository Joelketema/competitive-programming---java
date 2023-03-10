import java.util.*;

class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);


        List<int[]> mergedIntervals = new ArrayList<>();


        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            if (currentInterval[1] >= intervals[i][0]) {
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {

                mergedIntervals.add(currentInterval);
                currentInterval = intervals[i];
            }
        }


        mergedIntervals.add(currentInterval);


        return mergedIntervals.toArray(new int[mergedIntervals.size()][2]);
    }
}