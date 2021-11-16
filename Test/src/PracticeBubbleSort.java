public class PracticeBubbleSort {

    // looking up sort algorithms
        // bubble sort

    void bubbleSort (int arr[]){

        int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for ( int j = 0; j < n-i-1; j++){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

    }


//    print array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        PracticeBubbleSort BSDemo = new PracticeBubbleSort();
        int arr[] = {12, 32 , 48, 20, 14, 67};
        BSDemo.bubbleSort(arr);
        System.out.println("this would be the sorted array ");
        BSDemo.printArray(arr);

    }


}
