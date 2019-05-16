package ShufflingRandomNumbers;

import java.util.Arrays;

public class Main {

    private static final int MAX_NUMBER = 49;
    private static final int NUMBER_TO_PICK = 5;
    private static final int NUMBER_OF_TICKETS = 5;

    public static void main(String[] args) {

        Lottery lottery = new Lottery(49);
        System.out.println(lottery.toString());
        System.out.println(Arrays.toString(lottery.pick(6)));

        Lottery lottery1 = new Lottery(MAX_NUMBER);
        for (int i=0;i<NUMBER_OF_TICKETS;i++){
            int[] selection=lottery1.pick(NUMBER_TO_PICK);
            String selectString = Arrays.toString(selection);
            System.out.printf("Ticket # %d: %s\n",i,selectString);
        }
    }
}