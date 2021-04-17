package L1_Generics.Sources.generic_02;

public class Main02 {
	public static void main(String[] args) {
		GenericBox<Lemon> box1 = new GenericBox<>();
		Lemon lemon = new Lemon();
		box1.put(lemon);

		Lemon newLemon = box1.get();
		System.out.println("Достали " + newLemon + "\n");
	}
}
