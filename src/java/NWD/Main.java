package NWD;

public class Main {

    public static void main(String[] args) {

        System.out.println(nwd(12,18));

    }

    public static Integer nwd(int a, int b){
        while (a!=b){
            if(a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        return a;
    }
}
