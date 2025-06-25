package Basics;

public class EvencntOddcnt {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int cnteven=0;
        int oddcnt=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                cnteven++;
            }else {
                oddcnt++;
            }
        }
        System.out.println("even= "+cnteven+"odd="+oddcnt);
    }
}
