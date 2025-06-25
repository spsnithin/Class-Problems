package Basics;
import java.util.*;
public class SumAndAverage {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int []arr=new int[n];

        int []arr={10,20,30,30,40};
        int sumAns=sum(arr);
        int n=arr.length;
        System.out.println("Sum= "+sumAns+" , Average=" + sumAns/n);
        System.out.println(median(arr));
        System.out.println(mode(arr));
    }
    static int sum(int []arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static int mode(int[]arr){
        int cnt=0;
        HashMap<Integer,Integer>mpp=new HashMap<>();

        for(int i=0;i< arr.length;i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
        }
        int maxfreq=0;
        int mode=0;
        for(Map.Entry<Integer,Integer>entry: mpp.entrySet()){
            if(entry.getValue()>maxfreq){
                maxfreq=entry.getValue();
                mode=entry.getKey();
            }
        }
        return mode;

    }
    static int median(int[]arr){

        int n=arr.length;
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        if(n%2==0){
            return (arr[mid]+arr[mid+1])/2;
        }
        return mid;
    }
}
