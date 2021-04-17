package L1_Generics.Sources.arrays_04;

import L1_Generics.Sources.generic_02.GenericBox;
import L1_Generics.Sources.wilcard_03.Apple;
import L1_Generics.Sources.wilcard_03.Lemon;

public class Main04 {
	public static void main(String[] args) {
//		GenericBox<Apple>[] boxes1 = new GenericBox[10];
//		GenericBox<Apple>[] boxes2 = new GenericBox<Apple>[10];
//		GenericBox[] boxes3 = new GenericBox[10];

		GenericBox<?>[] boxes4 = new GenericBox<?>[10];
		boxes4[0] = new GenericBox<Apple>();
		boxes4[1] = new GenericBox<Lemon>();

		GenericBox<Apple> appleBox = new GenericBox<>();
		appleBox.put(new Apple());
		boxes4[0] = appleBox;
	}
}
