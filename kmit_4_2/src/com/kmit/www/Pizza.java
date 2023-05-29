package com.kmit.www;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        SixteenCircle pizza;
        pizza=new SixteenCircle();
        System.out.print("피자의 반지름 : ");
        pizza.radius=scanner.nextInt();
        System.out.print("피자의 이름 : ");
        pizza.name=scanner.next();
        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은 : "+area);

        SixteenCircle donut;
        donut=new SixteenCircle();
        System.out.print("\n도넛의 반지름 : ");
        donut.radius=scanner.nextInt();
        System.out.print("도넛의 이름 : ");
        donut.name=scanner.next();
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 : "+area);









    }
}
