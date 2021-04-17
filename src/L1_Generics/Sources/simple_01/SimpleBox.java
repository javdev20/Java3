package L1_Generics.Sources.simple_01;

public class SimpleBox {
	private Object object;

	public void put(Object o) {
		System.out.println("Открываем ящик");
		System.out.println("Предмет " + o + " помещен в ящик");
		this.object = o;
		System.out.println("Закрываем ящик\n=====================");
	}

	public Object get() {
		System.out.println("Открываем ящик");
		if (object != null) {
			System.out.println("Предмет " + object + " доступен");
			System.out.println("Забираем предмет и закрываем ящик\n=====================");
		} else {
			System.out.println("Ящик пуст");
		}
		return object;
	}
}
