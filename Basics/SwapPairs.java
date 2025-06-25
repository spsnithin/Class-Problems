package Basics;

import java.util.Arrays;

public class SwapPairs {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []arr){
        int l=0;
        int r= arr.length-1;
        while (l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }

    }
}
