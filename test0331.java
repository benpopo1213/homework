package test0331;
import java.util.Scanner;
import java.util.Arrays;

public class test0331 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];

		while (true) {
			System.out.println("請輸入5個0~999的整數:");
			String input = sc.nextLine();
			String[] parts = input.trim().split("\\s+");

			if (parts.length != 5) {
				System.out.println("輸入數量錯誤，請重新輸入5個數字");
				continue;
			}

			boolean check = true;
			for (int i = 0; i < 5; i++) {
				int b = Integer.parseInt(parts[i]);
				if (b < 0 || b > 999) {
					check = false;
					break;
				}
				data[i] = b;
			}

			if (check) {
				break;
			} else {
				System.out.println("數字超出範圍，請重新輸入0~999的整數");
			}
		}

		java.util.Arrays.sort(data);

		System.out.print("由大到小:");
		for (int i = 4; i >= 0; i--) {
			System.out.print(data[i] + (i == 0 ? "" : ","));
		}
		System.out.println();

		System.out.print("由小到大:");
		for (int j = 0; j <= 4; j++) {
			System.out.print(data[j] + (j == 4 ? "" : ","));
		}
		System.out.println();

		System.out.print("排在中間的數字:");
		System.out.print(data[2]);
	}
}