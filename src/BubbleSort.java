import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
        // Write your code here
        int swapNumber = 0;
        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.size()-1;j++){

                if(a.get(j) > a.get(j + 1))
                {
                    Collections.swap(a,j+1,j);
                    swapNumber++;
                }
            }
        }

        // a.forEach(el->{
        //     System.out.print(el + " ");
        // });
        int firstNumber = a.get(0);
        int lastNumber = a.get(a.size()-1);

        System.out.print("Array is sorted in " + swapNumber + " swaps." + "\n");
        System.out.print("First Element: " + firstNumber + "\n");
        System.out.print("Last Element: " + lastNumber + "\n");

    }

}

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        result.countSwaps(a);

        bufferedReader.close();
    }
}
