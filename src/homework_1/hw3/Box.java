package homework_1.hw3;

import java.util.ArrayList;
import java.util.List;


        // b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
        // фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
public class Box<T extends Fruit> {

    private List<T> list;
    private boolean isTrue;

    public List<T> getList() {
        return list;
    }


    // c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    public Box() {
        list = new ArrayList<T>();
    }

    // g. Не забываем про метод добавления фрукта в коробку
    void add(T obj) {
        list.add(obj);
    }

    /*  f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
           Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
           Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
           объекты, которые были в первой;
    */
    void moveTo(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке находятся " + list.get(0).toString() + " в количестве: " +
                    list.size());
        }
    }

    //d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта
    //и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

//          e.Внутри класса Box сделать метод compare(), который позволяет сравнить текущую
//            коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
//            равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
//            апельсинами;

    String compare(Box<? extends Fruit> box) {
        isTrue = this.getWeight() == box.getWeight();
        return isTrue ? "да" : "нет";
    }

}
