package com.kmit.www;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("입력:");
        int a= scanner.nextInt();
        int d=0;

        for (int b=0;b<a;b++) {
            System.out.println("*");


            for (int c=a;c>b;c--) {
                System.out.print(" ");

            }
        }
    }
}
