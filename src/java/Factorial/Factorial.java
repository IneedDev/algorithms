package Factorial;

public class Factorial {

    public static int factorialIteration(int n){
        int m = 1;
        for (int i=1; i<=n; i++){
            m*=i;
        }
        return m;
    }

    public static void main(String[] args) {

        factorialIteration(4);
        System.out.println(factorialIteration(4));


    }
}
