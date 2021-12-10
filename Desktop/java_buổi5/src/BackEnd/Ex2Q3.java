package BackEnd;

import java.util.Scanner;

import Enity.Rectangle;
import Enity.Square;

public class Ex2Q3 {
	private Scanner scanner;

	public Ex2Q3() {
		scanner = new Scanner(System.in);
	}

	public void menu() {
		while (true) {
			System.out.println("1. Rectangle area 2.Rectangle primeter 3.Square area 4.Square primeter  5.exit");
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				System.out.println("nhập vào chiều dài hình chữ nhật: ");
				double a = scanner.nextDouble();
				System.out.println("nhập vào chiều rộng hình chữ nhật: ");
				double b = scanner.nextDouble();
				Rectangle r = new Rectangle(a, b);
				System.out.println("Rectangle area is: " + r.area());
				break;
			case 2:
				System.out.println("nhập vào chiều dài hình chữ nhật: ");
				double a1 = scanner.nextDouble();
				System.out.println("nhập vào chiều rộng hình chữ nhật: ");
				double b1 = scanner.nextDouble();
				Rectangle r1 = new Rectangle(a1, b1);
				System.out.println("Rectangle primeter is: " + r1.perimeter());
				break;
			case 3:
				System.out.println("nhập vào cạnh  hình vuông: ");
				double a2 = scanner.nextDouble();
				Square s = new Square(a2);
				System.out.println("Square area is: " + s.area());
				break;
			case 4:
				System.out.println("nhập vào cạnh  hình vuông: ");
				double a3 = scanner.nextDouble();
				Square s1 = new Square(a3);
				System.out.println("Square area is: " + s1.perimeter());
				break;
			case 5:
				return;
			default:
				System.out.println("input  only 1, 2,3,4 or 5");
			}
		}
	}
}
