package SelectSort;

public class SelectionSort {


    private long[] a;       //reference to the array
    private int nElems;     // elements counter

    public SelectionSort(int max) {
        a= new long[max];  //array creation
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for (int i=0; i<nElems; i++){
            System.out.print(a[i]+" ");


        } System.out.print("\n");
    }

    public void swap(int one, int two){
        long temp=a[one];
        a[one]=a[two];
        a[two]=temp;
    }

    public void selectSort(){

    }

    public void createArrayRandom(int maxSize){
        for (int j=0; j<maxSize;j++){
            long n = (long) (Math.random()*(maxSize-1));
            insert(n);
        }

    }
}
