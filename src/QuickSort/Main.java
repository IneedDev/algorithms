package QuickSort;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rd = new Random(); // creating Random object
        int[] data = new int[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = rd.nextInt(); // storing random integers in an array
            //System.out.println(data[i]); // printing each array element
        }

        Main main = new Main();

        main.quickSort(data,0,data.length-1);
        System.out.println(Arrays.toString(data));


    }

    public void quickSort(int data[], int begin, int end){
        if (begin<end){
            int partitionIndex = partition(data,begin,end);
            quickSort(data, begin, partitionIndex-1);
            quickSort(data, partitionIndex+1, end);

        }
    }

    public int partition(int data[], int begin, int end){
        int pivot = data[end];
        int i = (begin-1);

        for (int j=begin; j<end;j++){
            if (data[j]<=pivot){
                i++;

                int swapTemp = data[i];
                data[i] = data[j];
                data[j] = swapTemp;

            }
        }

        int swapTemp = data[i+1];
        data[i+1] = data[end];
        data[end] = swapTemp;

        return i+1;
    }



}
