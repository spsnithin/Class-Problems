package Basics;

import java.util.Arrays;

public class RemoveOccurance {
    public static void main(String[] args) {
        int []arr={1,2,3,2,4,2,5};
        int k=2;
        int []res=helper(arr,k);
//        System.out.println(Arrays.toString(res));
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    static int[] helper(int []arr,int k){
        int nums[]=new int[arr.length];
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=k){
                nums[j]=arr[i];
                j++;
            }
        }
        return nums;
    }
}
