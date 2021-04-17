package L1_Generics.Sources.generic_02;

public class Main021 {
	public static void main(String[] args) {
		GenericBox<Lemon> box1 = new GenericBox<>();
		Lemon lemon = new Lemon();
		box1.put(lemon);

		openBoxAndGet(box1);

		GenericBox<Apple> box2 = new GenericBox<>();
		box2.put(new Apple());

		//openBoxAndGet(box2);
	}

	public static void openBoxAndGet(GenericBox<Lemon> box) {
		box.get();
	}
}
