import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        // Write your code here
        int beforeLastIndex = n-2;
        int lastElement = arr.get(n-1);

        while(beforeLastIndex>=0 && lastElement < arr.get(beforeLastIndex)){

            if(arr.get(beforeLastIndex) > lastElement){
                arr.set(beforeLastIndex+1, arr.get(beforeLastIndex));
            }
            beforeLastIndex--;
            arr.forEach(a->{
                System.out.print(a + " ");
            });
            System.out.print("\n");
        }

        arr.set(beforeLastIndex+1,lastElement);
        arr.forEach(a->{
            System.out.print(a + " ");
        });

        System.out.print("\n");

    }


}

public class InsertionSortSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result1.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
