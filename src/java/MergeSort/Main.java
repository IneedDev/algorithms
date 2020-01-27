package MergeSort;

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
        System.out.println(Arrays.toString(data));

    }

    public void mergeSort(int[] list, int lowIndex, int highIndex){
        if(lowIndex==highIndex){
            return;
        }else {
            int midIndex=(lowIndex+highIndex)/2;
            mergeSort(list,lowIndex,midIndex);
            mergeSort(list,midIndex+1,highIndex);
            //merge(list,lowIndex,midIndex+1,highIndex);
        }
    }

}
