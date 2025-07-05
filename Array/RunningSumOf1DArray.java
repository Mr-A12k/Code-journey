import java.util.*;


class RnningSumOf1DArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int nums[]= new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int[] result = runningSum(nums);
        System.out.println("Running sum of the array is:");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }

    }

    public static int[] runningSum(int[] nums){
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1]; 
        }
        return nums;
    }
}