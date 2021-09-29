public class DSA_01_BubbleSort {
    public void letsSort(){
        int[] arr = {7, 3, 17, 20, 13, 2};
        int temp;

        System.out.println("the array before sorting: ");
        for(int i=0; i<arr.length-1;i++){
            System.out.print(arr[i] +" ");
        }
        //sorting the array
        for(int i =0;i<arr.length-1;i++){
            for( int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        System.out.println("the array after sorting: ");
        for(int i=0; i<arr.length-1;i++){
            System.out.print(arr[i] +" ");
        }

    }

    public static void main(String[] args) {
        DSA_01_BubbleSort arraySort = new DSA_01_BubbleSort();
        arraySort.letsSort();
    }
}
