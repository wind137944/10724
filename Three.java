package com.kmit.www;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 입력하세요.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요\n>");
        String name = scanner.next();
        System.out.print("이름은"+ name + ",");

        System.out.print("도시를 입력하세요\n>");
        String city = scanner.next();
        System.out.print("도시는" + city + ",");

        System.out.print("나이를 입력하세요\n>");
        int age = scanner.nextInt();
        System.out.print("나이는" + age + "살,");

        System.out.print("체중을 입력하세요\n>");
        double weight = scanner.nextDouble();
        System.out.print("체중은" + weight + "kg,");

        System.out.print("독신여부를 입력하세요(true or false)\n>");
        boolean single = scanner.nextBoolean();
        System.out.println("독신 여부는" + single + "입니다");
        scanner.close();


    }
}