package BubbleSort;

public class ArrayBub {

    private long[] a;       //reference to the array
    private int nElems;     // elements counter

    public ArrayBub(int max) {
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

    public void bubbleSort (){
        int out;
        int in;

        for (out=nElems-1;out >1;out--){
            for (in=0; in<out;in++){
                if (a[in]>a[in+1]){
                    long temp = a[in];
                    a[in] = a[in+1];
                    a[in+1] = temp;
                }
            }
        }
    }

    public void bubbleSortOptimal (){
        int in;
        int out=nElems;
        boolean isSwapped=false;
        for (out=nElems-1;out >1;out--){
            for (in=0; in<out;in++){
                if (a[in]>a[in+1]){
                    long temp = a[in];
                    a[in] = a[in+1];
                    a[in+1] = temp;
                    isSwapped=true;
                }
                if (isSwapped=false){
                    break;
                }
            }
        }
    }

    public void createArrayRandom(int maxSize){
        for (int j=0; j<maxSize;j++){
            long n = (long) (java.lang.Math.random()*(maxSize-1));
            insert(n);
        }

    }


}
