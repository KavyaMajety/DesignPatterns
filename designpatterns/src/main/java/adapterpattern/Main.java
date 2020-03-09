package adapterpattern;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		ToyDog dogAdapter = new DogAdapter(dog); 
		ToyDog toydog = new StuffedDogToy(); 
		System.out.println("Dog!");
		dog.walk();
		dog.makeNoise();
		System.out.println("Cat!");
		cat.walk();
		cat.makeNoise();
		System.out.println("Toy Dog!");
		toydog.furry();
		System.out.println("Dog Adapter!");
		dogAdapter.furry();

	}

}
