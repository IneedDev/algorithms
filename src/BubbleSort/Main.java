package BubbleSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       // int [] data = {5, 3, 2, 7, 23, 12, 11, 1};
        int [] data = {342342,123,123, 122,12,1,5,7,3};

        for (int i=0; i<data.length-1; i++){
            for (int j=0; j<data.length-1-i;j++){
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j]= data[j+1];
                    //swap
                    data[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(data));



    }
}
