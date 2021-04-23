package homework_1.hw3;

public class MainClass {

    public static void main(String[] args) {
//        Apple apple = new Apple();
//        Orange orange = new Orange();

        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();

        Box<Apple> appleBox = new Box();

            orangeBox1.add(new Orange());
            orangeBox1.add(new Orange());
            orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }

        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        System.out.println();

        Float orange1Weight = orangeBox1.getWeight();
        Float orange2Weight = orangeBox2.getWeight();
        Float appleWeight = appleBox.getWeight();

        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weight);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weight);
        System.out.println("Вес коробки с яблоками: " + appleWeight);

        System.out.println();

        System.out.println("Равны ли orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Равны ли orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        System.out.println();

        orangeBox1.moveTo(orangeBox2);
        //orangeBox1.moveTo(appleBox); error

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();



    }
}
