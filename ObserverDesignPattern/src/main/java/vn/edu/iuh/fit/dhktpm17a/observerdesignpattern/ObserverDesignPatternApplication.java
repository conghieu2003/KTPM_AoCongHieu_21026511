package vn.edu.iuh.fit.dhktpm17a.observerdesignpattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverDesignPatternApplication {

	public static void main(String[] args) {
		Class class1 = new Class("DHKTPM17A");

		Student student1 = new Student("21026511", "Ao Cong Hieu", "Quang Ngai");
		Student student2 = new Student("21006512", "Nguyen Van A", "Quang Nam");
		Student student3 = new Student("21006513", "Nguyen Van B", "TP.HCM");

		class1.addObserver(student1);
		class1.addObserver(student2);
		class1.addObserver(student3);

		//info
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();

		//send announcement
		class1.sendAnnouncement("Thong bao hoc phi");
		//remove student2
		class1.removeObserver(student2);
		//send announcement after remove
		class1.sendAnnouncement("Thong bao thi cuoi ki");


	}
}
