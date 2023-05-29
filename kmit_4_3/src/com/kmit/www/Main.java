package com.kmit.www;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Rectangle c=new Rectangle();

        Scanner scanner=new Scanner(System.in);
        System.out.print("사각형의 높이 : ");
        c.height=scanner.nextInt();

        System.out.print("사각형의 폭 : ");
        c.width=scanner.nextInt();

        System.out.println("사각형의 넓이 : "+c.getArea());
    }
}
