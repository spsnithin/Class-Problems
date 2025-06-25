package Basics;

import java.util.Arrays;

public class ARr {
    public static void main(String[] args) {
        int[]arr={10,20,30,41,52};
        int []arr2={40,50,60,74,88};
        int []res=new int[arr.length];
//        int carry=0;
        sum(arr,arr2,res);
        System.out.println(max(arr));
        System.out.println(min(arr));

        System.out.println(Arrays.toString(res));
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sum(int []arr,int[] arr2,int []res){
        int carry=0;
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i]+arr2[i]+carry;
            carry=res[i]%10;
        }

    }
    static void  reverse(int[]arr,int start,int end){
        while (start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static int max(int []arr){
        int maxi=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    static int min(int []arr){
        int mini=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        return mini;
    }

}
