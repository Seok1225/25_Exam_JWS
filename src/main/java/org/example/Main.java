package org.example;
//3. 프로그램은 정수 10개의 피보나치 수열 숫자를 출력합니다. 수열을 생성하기 위해 루프를 사용합니다. (40점)
// for문 혹은 while문 둘다 사용가능

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        for (int i = 0; i < 9; i++) {
            System.out.printf(b + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}