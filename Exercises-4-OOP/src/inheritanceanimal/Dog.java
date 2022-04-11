package inheritanceanimal;

public class Dog extends Mammal {

	public Dog() {

	}

	String greets = "woof";

	public Dog(Mammal mammal1, String greets) {
		super(mammal1.getName());
		this.greets = greets;
	}

	public String getGreets() {
		return greets;
	}

	public void setGreets(String greets) {
		this.greets = greets;
	}

	@Override
	public String toString() {
		return "Dog [greets=" + greets + ", name=" + name + "]";
	}

}
