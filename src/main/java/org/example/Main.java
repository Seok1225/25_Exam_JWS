package org.example;
//1. 가로길이, 세로길이를 입력받아 사각형 넓이 만큼 별을 찍어내는 프로그램을 구현합니다(30점)
//내용
//- for문 혹은 while문 둘다 사용가능
//
//Scanner 활용
//
//
//- 결과코드는 깃허브에 업로드

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int width = Integer.parseInt(str.split(" ")[0]);
        int height = Integer.parseInt(str.split(" ")[1]);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}