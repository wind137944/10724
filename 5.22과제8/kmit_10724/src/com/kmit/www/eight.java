package com.kmit.www;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("입력:");
        int a= scanner.nextInt();
        int i;
        int j;
        int k;

        for (i=0;i<a;i++) {

            for (j=1;j<a-i;j++) {
                System.out.print(" ");

            }
            for(k=0;k<i*2+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
