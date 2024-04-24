import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String charac = "";
        System.out.println("Enter your word to be reversed");
        Scanner word = new Scanner(System.in);
        String firstWord = word.nextLine();
        int a = firstWord.length() - 1;
        while(a >= 0){
            charac = charac + firstWord.charAt(a);
            a--;
        }
        System.out.println(charac);
    }

}
