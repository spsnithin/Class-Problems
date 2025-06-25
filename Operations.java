package Basics;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=sc.nextInt();
        System.out.println("enter m: ");

        int m= sc.nextInt();
        System.out.println(div(n,m));
    }
    static int add(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;

    }
    static int mul(int a ,int b){
        return a*b;

    }
    static int div(int a,int b){
        return a/b;
    }
}
