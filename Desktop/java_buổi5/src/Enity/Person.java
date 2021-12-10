package Enity;

import java.util.ArrayList;
import java.util.Scanner;

public class Person implements IPerson{
	protected String name;
	protected Gender gender;
	private int genderNumber;
	protected String birthday;
	protected String address;
	private Scanner scanner;
	private ArrayList<Person> arrayPerson;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getGenderNumber() {
		return genderNumber;
	}

	public void setGenderNumber(int genderNumber) {
		this.genderNumber = genderNumber;
	}

	public Gender getGender() {
		switch(genderNumber) {
		case 1:
			this.gender = Gender.FEMALE;
			break;
		case 2:
			this.gender =  Gender.MALE;
			break;
		case 3:
			this.gender = Gender.UNKNOW;
			break;
		}
		return this.gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person(String name, int genderNumber, String address, String birthday) {
		this.name = name;
		this.genderNumber = genderNumber;
		this.address = address;
		this.birthday = birthday;
		scanner = new Scanner(System.in);
		arrayPerson = new ArrayList<Person>();
	}

	public Person() {
		scanner = new Scanner(System.in);
		arrayPerson = new ArrayList<Person>();
	}

	@Override
	public String toString() {
		return "Person \nname: " + name + "\ngender: " + getGender() + "\naddress: " + address + "\nBirthday: " + birthday
				+ "\n";
	}
	@Override
	public void inputInfo() {
		while (true) {
			System.out.println("input 1 or 2 (1.input Information 2.exit )");
			int input = scanner.nextInt();
			switch (input){
			case 1:
			System.out.println("input GenderNumber(1.female,2.male,3.unknow )");
			int inputGenderNumber = scanner.nextInt();
			if(inputGenderNumber>3 || inputGenderNumber<0) {
				System.out.println("input only 1 or 2 or 3");
				return;
			}
			System.out.println("input Name: ");
			String inputName1 = scanner.nextLine();
			String inputName = scanner.nextLine();
			System.out.println("input address: ");
			String inputAddress = scanner.nextLine();
			System.out.println("input Date of Birth: ");
			String inputBirthday = scanner.nextLine();
				Person per1 = new Person(inputName, inputGenderNumber, inputAddress, inputBirthday);
				//System.out.println(per1);
				arrayPerson.add(per1);
				break;
			case 2:
				return;
			default:
				System.out.println("input only 1 or 2!");

			}
		}
	}
	@Override
	public String showInfo() {
		for(Person p : arrayPerson) {
			System.out.println(p);
		}
		return "Person \nname: " + name + "\ngender: " + getGender() + "\naddress: " + address + "\nBirthday: " + birthday
					+ "\n";
	}
}

enum Gender {
	FEMALE, MALE, UNKNOW;
}
