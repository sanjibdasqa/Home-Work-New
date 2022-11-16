package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo(); // Here Animal is parent Class of Mammal Bird and reptile Class.
		System.out.println("\n-----------------------------\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // Mammal, Reptile and Birds are child class of animal Class.
		System.out.println("\n-----------------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		/*
		 * Here reptile Inherits the properties form a single parent (animal class) this
		 * is an example of single inheritance
		 */
		System.out.println("\n-----------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		/*
		 * Mammal Reptile and Birds all extends to animal class this is an example of
		 * Hierarchical inheritance
		 */
		System.out.println("\n-----------------------------\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		System.out.println("\n-----------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("\n-----------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		System.out.println("\n-----------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		/* Here this is an example of multilevel inheritance */
		System.out.println("\n-----------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

	}

}
