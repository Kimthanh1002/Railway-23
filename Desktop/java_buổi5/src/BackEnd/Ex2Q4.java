package BackEnd;

import java.util.Scanner;

import Enity.MyMath;

public class Ex2Q4 {
	private Scanner scanner;

	public Ex2Q4() {
		scanner = new Scanner(System.in);
	}
	public void menu() {
		while (true) {
			System.out.println("1. sum by byte  2. sum  by float  3.sum by int 4.exit");
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				System.out.println("input number 1: ");
				byte a = scanner.nextByte();
				System.out.println("input number 2: ");
				byte b = scanner.nextByte();
				MyMath myMath =  new MyMath();
				System.out.println( "sum by byte is: "+myMath.sum(a, b));
				break;
			case 2:
				System.out.println("input number 1: ");
				float a1 = scanner.nextFloat();
				System.out.println("input number 2: ");
				float b1 = scanner.nextFloat();
				MyMath myMath1 =  new MyMath();
				System.out.println( "sum by float is: "+myMath1.sum(a1, b1));
				break;
			case 3:
				System.out.println("input number 1: ");
				int a2 = scanner.nextInt();
				System.out.println("input number 2: ");
				int b2 = scanner.nextInt();
				MyMath myMath2 =  new MyMath();
				System.out.println( "sum by int is: "+myMath2.sum(a2, b2));
				break;
			case 4:
				return;
			default:
				System.out.println("input  only 1, 2,3 or 4");
				
			}
		}
	}
}
