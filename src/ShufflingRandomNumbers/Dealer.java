package ShufflingRandomNumbers;

import java.util.Random;

public class Dealer {

    private Random rng;
    private Card[] deck;

    public void shuffle(){
        for(int i=0; i<deck.length;i++){
            int selection = i+rng.nextInt(deck.length-i);
            
        }
    }

}
