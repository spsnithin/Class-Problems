package Basics;

public class Linearsearch {
    public static void main(String[] args) {
        int[]arr={1,2,3,5,6};
        System.out.println(find(arr,5));
    }
    static int find(int[]arr,int k){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                ans=i;
            }
        }
        return ans;
    }
}
