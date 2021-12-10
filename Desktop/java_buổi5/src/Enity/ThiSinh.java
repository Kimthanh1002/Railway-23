package Enity;

import java.util.ArrayList;
import java.util.Scanner;

public class ThiSinh {
	private int idNumber;
	private String fullName;
	private String address;
	private int priority;
	private String gradeName;
	private String grade;
	private ArrayList<ThiSinh> arrayThiSinh;

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getGrade() {
		switch (this.gradeName) {
		case "A":
			this.grade = "Toán,Lí,Hoá";
			break;
		case "B":
			this.grade = "Toán,Hoá,Sinh";
			break;
		case "C":
			this.grade = "Văn,Sử,Địa";
			break;
		default:
			System.out.println("không có khối này!");

		}
		return grade;
	}

	public ThiSinh(int idNumber, String fullName, String address, int priority, String gradeName) {
		this.idNumber = idNumber;
		this.fullName = fullName;
		this.address = address;
		this.priority = priority;
		this.gradeName = gradeName;
	}

	@Override
	public String toString() {
		return "ThiSinh \nidNumber: " + idNumber + "\nfullName: " + fullName + "\naddress: " + address + "\npriority: "
				+ priority + "\ngrade: " +getGrade()+ "\n";
	}
	

}
