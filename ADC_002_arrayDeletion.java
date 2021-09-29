import java.util.Scanner;

public class ADC_002_arrayDeletion {

    public void arrayDeletion(){
            System.out.println("Please enter the size of your array: ");
            Scanner usrInput = new Scanner(System.in);

            //take length of the array from user
            int size  = usrInput.nextInt();
            int[] arr = new int[size];

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
        System.out.println("\n");

            //Array Deletion code
        System.out.print("Please enter the index number that you to delete array from: ");
            int index = usrInput.nextInt();
            for(int i=index;i<size-1;i++)
            {
                arr[i] =arr[i+1];
            }
        System.out.print("The elements of the array post deletion are: ");
            size -=1;
            for(int i=0;i<size;i++){
                System.out.print(arr[i] + " ");
            }

    }

    public static void main(String[] args) {
        ADC_002_arrayDeletion object = new ADC_002_arrayDeletion();
        object.arrayDeletion();
    }
}
