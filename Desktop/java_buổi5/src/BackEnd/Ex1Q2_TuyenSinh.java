package BackEnd;

import java.util.ArrayList;
import java.util.Scanner;

import Enity.ITuyenSinh;
import Enity.News;
import Enity.ThiSinh;

public class Ex1Q2_TuyenSinh implements ITuyenSinh {
	private Scanner scanner;
	private ArrayList<ThiSinh> arrayThiSinh;
	
	
	
	public Ex1Q2_TuyenSinh() {
		scanner = new Scanner(System.in);
		arrayThiSinh = new ArrayList<ThiSinh>();
	}
	public void menu() {
		while (true) {
			System.out.println("input 1,2,3 or 4(1.addThiSinh 2. showInforThiSinh 3.searchByIdNumber 4.Exit): ");
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				addThiSinh();
				break;
			case 2:
				 showInforThiSinh();
				break;
			case 3:
				searchByIdNumber();
				break;
			case 4:
				return;
			default:
				System.out.println("input only 1 or 2 or 3 or 4");
				break;
			}
		}
	}

	@Override
	public void addThiSinh() {
		System.out.println("input id of student: ");
		int inputId = scanner.nextInt();
		System.out.println("input full name of student: ");
		String inputName1 = scanner.nextLine();
		String inputName = scanner.nextLine();
		System.out.println("input address of student");
		String inputAddress = scanner.nextLine();
		System.out.println("input priority  of student");
		int inputPriority = scanner.nextInt();
		while(true) {
		System.out.println("input grade's name of student(A(toán,lí,hoá) B(toán,hoá,sinh) C(văn,sử,địa)");
		String inputGrade = scanner.next();
		switch(inputGrade) {
		case "A":
			ThiSinh a = new ThiSinh(inputId, inputName, inputAddress, inputPriority, inputGrade);
			System.out.println(a);
			arrayThiSinh.add(a);
			return;
		case "B":	
			ThiSinh b = new ThiSinh(inputId, inputName, inputAddress, inputPriority, inputGrade);
			System.out.println(b);
			arrayThiSinh.add(b);
			return;
		case "C":
			ThiSinh c = new ThiSinh(inputId, inputName, inputAddress, inputPriority, inputGrade);
			System.out.println(c);
			arrayThiSinh.add(c);
			return;
		default:
			System.out.println("không có khối này");
		}
		}
	}
	@Override
	public void showInforThiSinh() {
		for(ThiSinh a :  arrayThiSinh) {
			System.out.println(a);
		}
	}
	@Override
	public void searchByIdNumber() {
		System.out.println("input id of student: ");
		int inputId = scanner.nextInt();
		for(ThiSinh a :  arrayThiSinh) {
			if(a.getIdNumber()== inputId) {
				System.out.println(a);
			}
		}
	}

}
