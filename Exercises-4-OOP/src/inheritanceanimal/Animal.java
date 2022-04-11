package inheritanceanimal;

public class Animal {

	 String name;

	public Animal() {

	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}

}
