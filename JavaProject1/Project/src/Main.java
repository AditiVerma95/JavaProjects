import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter your num to be calculated factorial of");
        int num1 = num.nextInt();
        Factorial.factorialOfGivenNum( num1);
    }
}
