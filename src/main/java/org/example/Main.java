package org.example;
//2. 양의 정수 n을 요청받아 숫자 패턴의 피라미드를 출력하는 프로그램을 구현합니다. 피라미드는 n 레벨을 가져야 하며, 최상위 레벨에서 n부터 시작하여 맨 아래층에서 1까지 숫자가 감소해야 합니다. (30점)
//내용
// - for문 혹은 while문 둘다 사용가능
//
//Scanner 활용
//
//
//
//
//n 이 5일 때의 예시는 다음과 같다.
// 5 4 3 2 1
//  4 3 2 1
//   3 2 1
//    2 1
//     1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);
        int space = 0;
        while (n > 0) {
            for (int i = 0; i < space; i++) System.out.print(" ");
            for (int i = n; i > 0; i--) System.out.print(i + " ");
            System.out.println();
            n--;
            space++;
        }
    }
}