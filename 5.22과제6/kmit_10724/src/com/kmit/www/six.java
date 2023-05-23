package com.kmit.www;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int sum=0;
        System.out.print("정수 입력\n>");
        int i = scanner.nextInt();
        System.out.print("입력한 정수와 다른 정수 입력\n>");
        int j = scanner.nextInt();

        for (i = i; i <= j; i++) {
            sum += i;
        }
        System.out.println("합계:"+sum);
    }
}