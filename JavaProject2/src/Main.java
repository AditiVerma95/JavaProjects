import java.util.Scanner;

//palindrome check
public class Main {
    public static void main(String[] args) {
        int revNum = 0;
        System.out.println("enter num to be checked for palindrome");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int checkNum = num1;
        while(checkNum > 1){
            int checkNum1 = checkNum % 10;
            revNum = revNum * 10 + checkNum1;
            checkNum = checkNum / 10;

        }
        if(revNum == num1){
            System.out.println("num is palindrom");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
