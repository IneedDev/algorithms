package String;

public class Main {

    public static void main(String[] args) {

        String s1 = "Mike";
        String s2 = "Mike";
        // the same reference and content
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3 = s1;
        //new object new reference
        String s4 = new String("Mike");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }
}
