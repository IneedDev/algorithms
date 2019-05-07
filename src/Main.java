import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) {

        Random rd = new Random(); // creating Random object
        int[] data = new int[100000];
        for (int i = 0; i < data.length; i++) {
            data[i] = rd.nextInt(); // storing random integers in an array
            //System.out.println(data[i]); // printing each array element
        }
        // int [] data = {5, 3, 2, 7, 23, 12, 11, 1};
        //int [] data = {342342,123,123, 122,12,1,5,7,3};

        // BubbleSort
        System.out.println("BubbleSort");
        long startTimeBubbleSort = System.nanoTime();
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
        long stopTimeBubbleSort = System.nanoTime();
        System.out.println(Arrays.toString(data));
        System.out.print("Execution time: "+ TimeUnit.NANOSECONDS.toSeconds((stopTimeBubbleSort-startTimeBubbleSort)) +"\n\n");

        //SelectionSort
        System.out.println("SelectionSort");
        long startTimeSelectSort = System.nanoTime();

        int i,j,minV,minI,temp=0;
        for(i=0; i<data.length;i++){
            minV = data[i];
            minI = i;
            for (j=i;j<data.length;j++){
                if(data[j]<minV){
                    minV=data[j];
                    minI=j;
                }
            }
            if(minV<data[i]){
                temp=data[i];
                data[i]=data[minI];
                data[minI]=temp;
            }
        }
        long stopTimeSelectSort = System.nanoTime();
        System.out.println(Arrays.toString(data));
        System.out.print("Execution time: "+ TimeUnit.NANOSECONDS.toSeconds((stopTimeSelectSort-startTimeSelectSort)) +"\n\n");

        //Insertion sort
        System.out.println("InsertionSort");
        long startTimeInsertSort = System.nanoTime();

        for (int k=1;k<data.length;k++){
            int key = data[k];
            int m = k-1;
            while (m>0&& key<data[m]){
                int temp2 = data[m];
                data[m]=data[m+1];
                data[m+1]=temp;
                m--;
            }
        }

        long stopTimeInsertSort = System.nanoTime();
        System.out.println(Arrays.toString(data));
        System.out.print("Execution time: "+ TimeUnit.NANOSECONDS.toSeconds((stopTimeInsertSort-startTimeInsertSort)) +"\n\n");

    }
}
