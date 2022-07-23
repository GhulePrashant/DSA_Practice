import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 elements: ");
        int[] arr = new int[5];

        for(int i=0; i<5; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the element you want to search: ");
        int key = in.nextInt();
        int position = findItem(arr, key);
        if(position == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element is at : "+(position +1) + " position.");
    }


    static int findItem(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
