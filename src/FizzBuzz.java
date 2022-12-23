import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> fizzbuzz = new <String> ArrayList();
        int index = 1;
        while(index <= n){
            if(index%3 == 0 && index%5 == 0){

                fizzbuzz.add("FizzBuzz");
            }
            else if(index%3 == 0){
                fizzbuzz.add("Fizz");
            }
            else if(index%5==0){
                fizzbuzz.add("Buzz");
            }
            else fizzbuzz.add(Integer.toString(index));
            index++;
        }
        return fizzbuzz;
    }
}