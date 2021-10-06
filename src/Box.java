import java.util.ArrayList;
import java.util.List;

class Box<T extends Fruit> {
    public List<T> getList() {
        return list;
    }

    private List<T> list;


    public Box() {
        list = new ArrayList<>();
    }

    void add(T obj) {
        list.add(obj);
    }

    void moveAt(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке находятся " + list.get(0).toString() + " в количестве: " + list.size());
        }
    }

    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return Math.abs(this.getWeight() - box.getWeight())<0.0001;
    }


}