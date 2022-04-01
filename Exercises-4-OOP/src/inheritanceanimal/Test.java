package inheritanceanimal;

public class Test {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Luna");
		System.out.println(animal1);

		Mammal mammal1 = new Mammal(animal1);
		System.out.println(mammal1);

		Cat cat1 = new Cat(mammal1, "meow");
		System.out.println(cat1);

		Dog dog1 = new Dog(mammal1, "woof");
		System.out.println(dog1);

	}

}
