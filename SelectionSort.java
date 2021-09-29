public class SelectionSort {

    void sortSelection(int[] arr){
        int n =arr.length;

        //we will traverse the one by one the boundary of the unsorted sub array
        for(int i=0;i<n-1;i++){
            // To find the minimum element in the unsorted array
            int min_index = i;
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[min_index])
                    min_index = j;
            // The code to swap the minimum element with the first element
                int temp = arr[min_index];
                arr[min_index]= arr[i];
                arr[i] = temp;
            }
        }
    }

    void printArray(int[] arr){
        int n = arr.length;
        for(int i= 0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    // driver code
    public static void main(String[] args) {
        SelectionSort mRef = new SelectionSort();
        int arr[] = { 2, 1, 9, 7, 23,13};
        mRef.sortSelection(arr);
        System.out.print("The sorted array: ");
        mRef.printArray(arr);

    }



}
