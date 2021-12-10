package FrontEnd;

import java.util.ArrayList;

import Enity.Student;

public class Program2 {
	public static void main(String[] arg) {
		ArrayList<Student> arrayStudent = new ArrayList<Student>();
		Student[] students = new Student[3];
		arrayStudent.add(students[0] = new Student(1, "Nguyen Van A1", 2));
		arrayStudent.add(students[1] = new Student(2, "Nguyen Van A2", 2));
		arrayStudent.add(students[2] = new Student(2, "Nguyen Van A3", 3));
		Student[] students1 = new Student[3];
		arrayStudent.add(students1[0] = new Student(1, "Nguyen Van A4", 1));
		arrayStudent.add(students1[1] = new Student(2, "Nguyen Van A5", 2));
		arrayStudent.add(students1[2] = new Student(2, "Nguyen Van A6", 3));
		Student[] students2 = new Student[3];
		arrayStudent.add(students2[0] = new Student(1, "Nguyen Van A7", 1));
		arrayStudent.add(students2[1] = new Student(2, "Nguyen Van A8", 1));
		arrayStudent.add(students2[2] = new Student(2, "Nguyen Van A9", 2));

		for (Student student : arrayStudent) {
			student.rollUp();
		}
		for (Student student : students1) {
			student.study();
		}
		for (Student student : students2) {
			student.cleaning();
		}
	}

}
