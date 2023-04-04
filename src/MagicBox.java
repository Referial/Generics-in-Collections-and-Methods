import java.util.Random;

public class MagicBox<T, N> {
    protected T[] items;
    protected T arrayNumber;
    protected int error;

    public MagicBox(int num) {
        items = (T[]) new Object[num];
        System.out.println("В коробку можно положить " + num + " объектов.");
    }

    public boolean add(T item) {
        for (int x = 0; x < items.length; x++) {
            if (items[x] == null) {
                items[x] = item;
                return true;
            }
        }
        return false;
    }


    public T pick() {
        int x = 0;
        for (x = 0; x < items.length; x++) {
            if (items[x] == null) {
                error = items.length - x;
                throw new RuntimeException("Коробка не заполнена. \n" +
                        "Осталось еще: " + error);
            } else {
                Random random = new Random();
                int randomInt = random.nextInt(5); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
                arrayNumber = items[randomInt];
                return arrayNumber;
            }
        }
        return null;
    }
}
