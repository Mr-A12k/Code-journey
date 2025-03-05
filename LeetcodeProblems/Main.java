import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
    }

class Solution {
    public long coloredCells(int n) {
            if(n==1)
            return 1;
            if(n==2)
                return 5;
           long  arr[]=new long[n+1];
               arr[1]=1;
               arr[2]=5;
            for(int i=3;i<n+1;i++)
            {
            arr[i]=arr[i-1]+(i-1)*4;
            }
           return arr[n]; }
        }
        // return n;
}

// https://leetcode.com/problems/count-total-number-of-colored-cells/description/?envType=daily-question&envId=2025-03-05