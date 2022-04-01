package inheritanceperson;

public class SuperclassPersonandSubclassTest {
	public static void main(String[] args) {
		Person e1 = new Person("Yevgeny", "Yotsuya");
		System.out.println(e1);

		Student student1 = new Student(e1, "Java", 2020, 10000);
		System.out.println(student1);

		Staff staff1 = new Staff(e1, "Tokyo University", 50000);
		staff1.setPay(-100);
		System.out.println(staff1);

	}

}
