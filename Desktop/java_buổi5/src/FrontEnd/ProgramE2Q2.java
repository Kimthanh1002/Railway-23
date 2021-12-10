package FrontEnd;

import Enity.Person;
import Enity.StudentE2;

public class ProgramE2Q2 {
	public static void main(String[] arg) {
		Person p = new Person();
		p.inputInfo();
		p.showInfo();
		StudentE2 s = new StudentE2();
		s.inputInfo();
		s.showInfo();
		s.scholarship();
	}

}
