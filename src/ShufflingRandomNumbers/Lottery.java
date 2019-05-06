package ShufflingRandomNumbers;

import java.util.Arrays;
import java.util.Random;

public class Lottery {

    private int[] numbers;
    private Random rng = new Random();

    public Lottery(int max) {
        numbers = new int[max];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=i+1;
        }
    }

    private void mix (int interations){
        for (int i=0;i<interations;i++){
            int shuffleIndex = i+rng.nextInt(numbers.length-i);
            int temp = numbers[shuffleIndex];
            numbers[shuffleIndex]=numbers[i];
            numbers[i]=temp;
        }
    }
    public int[] pick(int numbersToPick){
        int[] selection;
        mix(numbersToPick);
        selection=Arrays.copyOf(numbers,numbersToPick);
        Arrays.sort(selection);
        return selection;
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }
}
