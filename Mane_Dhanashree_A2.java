
import java.util.Arrays;

public class Mane_Dhanashree_A2 {

    private void checksum(int arr[], int Num)
    { // Using 2 for-loops for adding 2 different elements in array
        for(int i=0; i<arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            { int sum= arr[i]+arr[j];
                if(sum==Num) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")"); //printing the elements when sum of elements=0
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] Input = { 2, 9, -2, 0, -9, 8,0, -2, 10, 19 };
        int num =0;
        System.out.println("Array = " + Arrays.toString(Input)); //printing the elements of Input Array
        System.out.println("No_of_elements =" +" "+Input.length); //Printing length of the array
        System.out.println("Sum = "+ num); // Printing the value of Sum stored in num variable
        Mane_Dhanashree_A2 Sum = new Mane_Dhanashree_A2();

        Sum.checksum(Input, num);

    }

}
