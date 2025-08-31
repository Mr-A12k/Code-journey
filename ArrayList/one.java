/* 

Write a program to sort the elements in odd positions in descending order and elements in ascending order

Eg 1: Input: 13,2 4,15,12,10,5

        Output: 13,2,12,10,5,15,4

Eg 2: Input: 1,2,3,4,5,6,7,8,9

        Output: 9,2,7,4,5,6,3,8,1
*/


import java.util.*;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the array element:");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements : ");
        for (int i = 0; i < length; i++) {
            System.out.print(" " + arr[i] + " ");
        }

        oddEvenSorting(arr);
        System.out.println("Result is:");
        for (int nums : arr) {
            System.out.print(" "+nums+ " ");
        }
        sc.close();
    }

    public static void oddEvenSorting(int[] arr) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenList.add(arr[i]);
            } else {
                oddList.add(arr[i]);
            }
        }

        Collections.sort(oddList, Collections.reverseOrder());
        Collections.sort(evenList);

        System.out.println("Odd list:" + oddList);
        System.out.println("Even list:" + evenList);

        int odd = 0, even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = oddList.get(odd++);
            } else {
                arr[i] = evenList.get(even++);
            }
        }
    }
}
