package com.kmit.www;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("입력:");
        int i =scanner.nextInt();
        for(int j=1; j<10; j++) {

            System.out.print(i + "*" + j + "=" + i * j);
            System.out.print('\n');
        }
    }
}
