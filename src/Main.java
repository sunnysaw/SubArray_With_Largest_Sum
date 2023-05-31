/*
Question : Given an integer array, find the sub-array with the largest sum, and return its sum.
__________________________________________________________________________________________________
I/P = -2,1,-3,4,-1,2,1,-5,4
O/P = 1
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,SizeOfArray,sum = 0;
        System.out.println("Enter the size of array :");
        SizeOfArray = input.nextInt();
        int[] array = new int[SizeOfArray];
        System.out.println("Enter the digit inside the array :");
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the value :");

        System.out.println(sum);
        for (start = 0; start < array.length; start++){
            sum += array[start];
        }
        System.out.println(sum);
    }
}