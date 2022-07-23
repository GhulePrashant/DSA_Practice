import java.util.Scanner;

public class ArrayCreation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements:");
        for(int i=0; i<5; i++) {
            arr[i] = in.nextInt();
        }

        for(int a : arr) {
            System.out.println(a);
        }

    }

}
