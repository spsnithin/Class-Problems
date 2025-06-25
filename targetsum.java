package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class targetsum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 4, 11, 15};
//        int i = 0;
        int target = 9;
        int[]ans=find(arr,target);
        System.out.println(Arrays.toString(ans));
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
          for (int j = i+1; j < arr.length; j++) {
            if (arr[i] + arr[j] == target) {
                list.add(arr[i]);
                list.add(arr[j]);
            }
          }
        }
        l.add(list);
        System.out.println(l);

    }
   static int[]find(int[]arr,int target){
       for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
               if (arr[i] + arr[j] == target) {
                   return new int[]{arr[i],arr[j]};
               }
           }
       }
       return new int[]{-1,-1};
   }
}
