package scanner.ex;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("구구단의 단 수를 입력하세요: ");
//        int n = input.nextInt();
//
//        System.out.println(n + "단의 구구단: ");
//        for (int i = 1; i <= 9; i++) {
//            System.out.println(n + " x " + i + " = " + n * i);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int gu = scanner.nextInt();

        for(int i = 1; i <= 9; i++){
            int result = gu*i;

            System.out.println(gu + " x "+i + " = " + result);
        }
    }
}
