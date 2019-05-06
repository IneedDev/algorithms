package ShufflingRandomNumbers;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Lottery lottery = new Lottery(49);
        System.out.println(lottery.toString());

        System.out.println(Arrays.toString(lottery.pick(6)));


    }
}
