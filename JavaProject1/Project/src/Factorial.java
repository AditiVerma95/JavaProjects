public class Factorial {
    public static  void factorialOfGivenNum(int num1){
        int fac = num1;
        while(num1 > 1){
            fac = fac * (num1 - 1);
            num1--;
        }
        System.out.println(fac);
    }
}
