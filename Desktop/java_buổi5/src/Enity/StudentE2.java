package Enity;

import java.util.Scanner;

public class StudentE2 extends Person {
	private int id;
	private double point;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void inputInfo() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("input 1 or 2 (1.exit 2. create account): ");
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				return;
			case 2:
				System.out.println("input Id: ");
				this.id = scanner.nextInt();
				System.out.println("input point: ");
				this.point = scanner.nextDouble();
				System.out.println("input email: ");
				this.email = scanner.next();
				super.inputInfo();
			

				}
			}
		}
		

	@Override
	public String showInfo() {
		System.out.println(  "Id: " + id + "\npoint: " + point + "\nEmail: " + email);
		return super.showInfo() + "Id: " + id + "\npoint: " + point + "\nEmail: " + email;
	}

	public StudentE2() {
	}
	public void scholarship() {
		if(point >= 8) {
			System.out.println("This student is accepted scholarship!");
		}else {
			System.out.println("This student is not accepted scholarship");
		}
	}

}
