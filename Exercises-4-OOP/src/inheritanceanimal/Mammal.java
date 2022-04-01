package inheritanceanimal;

public class Mammal extends Animal {

	public Mammal() {

	}

	public Mammal(Animal animal1) {
		super(animal1.getName());
	}

	public Mammal(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mammal [name=" + name + "]";
	}

}
