package lt.lhu.unit03c.main;

import java.util.Scanner;

public class Task006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vvedite celoe pologitelnoe chislo:\n>");
		int input = -5;
		while(!sc.hasNextInt()) {//убираем возможный ввод не целого числа
			String err = sc.nextLine();
			System.out.print("Vse-taki vvedite celoe pologitelnoe chislo:\n>");}
		while (input<0) {//убираем возможный ввод отрицательного целого числа
			input = sc.nextInt();
			if (input<0) {
			System.out.print("Vse-taki vvedite celoe pologitelnoe chislo:\n>");}
		}
		System.out.println("Vi vveli chislo: "+input);
		int a = 0;
		int sum = 0;
		while (a<input) {
			a++;
			sum = sum + a;
		}
		System.out.print("Summa vsex chisel: "+sum);
	}

}
