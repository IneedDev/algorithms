package SelectSort;

public class SelectSortStart {

    public static void main(String[] args) {

        SelectSort.SelectionSort arr1 = new SelectionSort(5000);
        arr1.createArrayRandom(5000);

        arr1.display();

        long startTime2 = System.nanoTime();

        arr1.selectionSort();

        long stopTime2 = System.nanoTime();

        arr1.display();
        System.out.print("Execution time SelectSort: "+(stopTime2-startTime2)+"\n\n");

        SelectSort.SelectionSort arr2 = new SelectionSort(5000);
        arr2.createArrayRandom(5000);
        arr2.display();

        long startTimeOpti = System.nanoTime();

        arr2.bubbleSortOptimal();

        long stopTimeOpti = System.nanoTime();
        arr2.display();
        System.out.print("Execution time BubbleSort: "+(stopTimeOpti-startTimeOpti)+"\n\n");

        System.out.printf("SelectSort is faster: " + ((stopTimeOpti-startTimeOpti)-(stopTime2-startTime2))+"\n");

    }
    }
