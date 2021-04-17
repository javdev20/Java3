package L1_Generics.Sources.simple_01;

public class Main01 {
	public static void main(String[] args) {
		SimpleBox box = new SimpleBox();
		Melon melon = new Melon();
		box.put(melon);

		// ....

		Melon newMelon = (Melon) box.get();
		System.out.println("Достали " + newMelon + "\n");

		box.put("MELON");

		Object o = box.get();
		if (o instanceof Melon) {
			newMelon = (Melon) o;
			System.out.println("Достали " + newMelon + "\n");
		} else {
			System.out.println("Ничего не смогли достать");
		}
	}
}
