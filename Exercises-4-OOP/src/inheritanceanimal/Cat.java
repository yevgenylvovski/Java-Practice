package inheritanceanimal;

public class Cat extends Mammal {

	 String greets = "meow";

	public Cat() {

	}

	public Cat(Mammal mammal1, String greets) {
		super(mammal1.getName());
		this.greets = greets;
	}

	public String greets() {
		return greets;
	}

	public void setGreets(String greets) {
		this.greets = greets;
	}

	@Override
	public String toString() {
		return "Cat [greets=" + greets + ", name=" + name + "]";
	}

}
