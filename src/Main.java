import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Try first = new Try();
        first.printSomething();
//        first.setName("Alemu Sisay");
//        first.setAge(18);
//        System.out.println(first.getName() + " " + first.getAge());
//          loops();
//            strings();
            arrList();
    }

        static void strings(){
            String a = "eyuel";
            String name = "Eyuel";
//            System.out.println(a.length());
            int index = 0;
            while (index < a.length()){
                System.out.print(a.charAt(index));
                index++;
            }
            System.out.println("\n");

            if(a.contentEquals(name.toLowerCase())){
                System.out.println("similar");
            }
            else System.out.println("not similar");
        }


        public static void loops() {
            int numbers[] = makeArray();
            displayArr(numbers);
            System.out.println("\n");
            //reverse
            int index = numbers.length-1;
            while(index >= 0){
                System.out.print(numbers[index] + " ");
                index--;
            }
            //print out every two element
            int secondIndex = 0;
            System.out.println("\n");
            while(secondIndex < numbers.length){
                System.out.print(numbers[secondIndex] + " ");
                secondIndex+=2;
            }

        }

    public static void inputFunc(){
        String name;
        System.out.print("Enter your Name: ");
        Scanner getInput = new Scanner(System.in);
        name = getInput.nextLine();
        System.out.print("Your Name is " + name);

    }

    static int[] makeArray(){
        return new int[]{1,2,3,4,5,6,7,8,9,10};
    }
    public static void displayArr(int arr[]){
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }


    static void arrList(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);
        arr.forEach(a->{
            System.out.print(a + " , ");
        });
    }


}

