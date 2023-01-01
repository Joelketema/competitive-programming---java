import java.util.Scanner;

public class DominoPilling
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double a=input.nextInt();
        double b=input.nextInt();
        double c=a*b;
        System.out.println((int)Math.floor(c/2));
    }
}