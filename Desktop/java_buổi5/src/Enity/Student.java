package Enity;

import java.util.ArrayList;
import java.util.Scanner;

public class Student implements IStudent {
	private int id;
	private String name;
	private int group;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Student \nid: " + id + "\nname: " + name + "\ngroup: " + group + "\n";
	}
	public Student(int id, String name, int group) {
		this.id = id;
		this.name = name;
		this.group = group;
	}
	@Override
	public void rollUp() {
		System.out.println(" Student "+getName()+" is rolling up ...");
		
	}
	@Override
	public void study() {
		System.out.println(" Student " +getName()+ " is studying ...");
		
	}
	@Override
	public void cleaning() {
		System.out.println(" Student "+getName()+ " is clearning ...");
		
	}
	
	
}
