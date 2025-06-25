package Basics;

public class CheckArrayisSorted {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(check(arr));
    }
    static boolean check(int []arr){
        int first=arr[0];
        for(int i=1;i<arr.length;i++){
            if(first<=arr[i]){
                first=arr[i];
            }else{
                return false;
            }
        }
        return true;
    }
}
