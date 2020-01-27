package Factorial;

public class FactorialRecurrence {

    public static long factorialRecurrence(long n){
        if(n==0){
            return 1;
        }else {
            return factorialRecurrence(n-1)*n;
        }
    }

    public static void main(String[] args) {
        factorialRecurrence(4);
        System.out.println(factorialRecurrence(4));
    }
}
