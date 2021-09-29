import java.util.Scanner;

//ArrayInsertion after taking array from user
public class ADC_001_arrayInsertion {
    public void InsertArray(){
        System.out.println("Please enter the size of your array: ");
        Scanner usrInput = new Scanner(System.in);

        //take length of the array from user
        int size  = usrInput.nextInt();
        int[] arr = new int[size +1];

        System.out.println("Please enter the elements of your array: ");
        for(int i =0;i<size;i++)
        {
            arr[i] = usrInput.nextInt();
        }

        System.out.println("The entered elements are of the arrays are: ");
        for (int i =0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }

        // Insertion of additional array at certain index
     // size = size +1;
        int index = 4;

        // loop to insert the element
        for(int i =size-1;i>=index;i--){
            arr[i+1]=arr[i];

        }
        arr[index] = 45;
        System.out.print("The arrays after the insertion: ");
        for (int i=0;i<size +1;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }



    public static void main(String[] args) {
        ADC_001_arrayInsertion object = new ADC_001_arrayInsertion();
        object.InsertArray();
    }
}
