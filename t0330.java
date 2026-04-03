package t0330;

import java.util.Scanner;

public class t0330 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("請輸入5~7個字串: ");
            input = sc.nextLine();

            if (input.equals("17008")) {
                System.out.println("程式結束");
                break;
            }

            int len = input.length();

            if (len >= 5 && len <= 7) {
                String a = "";

                for (int i = input.length() - 1; i >= 0; i--) {
                    a += input.charAt(i);
                }

                System.out.println(a);

            } else {
                System.out.println("字元數不符合規定");
            }
        }
    }
}