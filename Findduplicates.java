package Basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Findduplicates {
    public static void main(String[] args) {
        int[]arr={1,2,2,3,4,5,4};
        find(arr);

    }
    static void  find(int []arr){

        Set<Integer>st=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    st.add(arr[i]);
                }
            }
        }

        for(int num:st){
            System.out.println(num+" ");
        }
    }
}
