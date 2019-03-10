package BubbleSort;

import BubbleSort.ArrayBub;

public class ArrayBubStarter {
    //22

    public static void main(String[] args) {


        BubbleSort.ArrayBub arr2 = new BubbleSort.ArrayBub(100);


        arr2.insert(100);
        arr2.insert(174);
        arr2.insert(15559);
        arr2.insert(19);
        arr2.insert(1888);
        arr2.insert(198);
        arr2.insert(19170);

        arr2.display();
        long startTime = System.nanoTime();

        arr2.bubbleSort();

        long stopTime = System.nanoTime();

        arr2.display();
        System.out.print("Execution time: "+(stopTime-startTime)+"\n\n");

        BubbleSort.ArrayBub arr3 = new BubbleSort.ArrayBub(5000);
        arr3.createArrayRandom(5000);
        arr3.display();

        long startTime2 = System.nanoTime();

        arr3.bubbleSort();

        long stopTime2 = System.nanoTime();

        arr3.display();
        System.out.print("Execution time: "+(stopTime2-startTime2)+"\n\n");

        BubbleSort.ArrayBub arrOpti = new ArrayBub(5000);
        arrOpti.createArrayRandom(5000);
        arrOpti.display();

        long startTimeOpti = System.nanoTime();

        arrOpti.bubbleSortOptimal();

        long stopTimeOpti = System.nanoTime();
        arrOpti.display();
        System.out.print("Execution time: "+(stopTimeOpti-startTimeOpti)+"\n\n");
        System.out.printf("bubbleSortOpti is faster: " + ((stopTimeOpti-startTimeOpti)-(stopTime2-startTime2))+"\n");

    }
}

