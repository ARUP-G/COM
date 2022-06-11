package DSA;

import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //syntax
        // datatype[] variable_name = new datatype[size]
        int[] num = new int[5];
        //num[0]=12;
        //System.out.println(num[0]);
        for (int i = 0; i < num.length; i++) {
            num[i]= input.nextInt();
        }
        for (int j = 0; j < num.length; j++) {
            System.out.print(num[j]+ " ");
        }
        // 2D array
        int[][] arr = new int[3][3];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 3/*row*/; i++) {
            for (int j = 0; j < 3/*column*/; j++) {
                arr[i][j]= input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }


}
