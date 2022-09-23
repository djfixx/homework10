import java.io.Serializable;
import java.util.*;

public class Goods implements Serializable {


    protected String name;
    protected int priceInDollars;
    protected int priceInCents;




    protected int quantity;
    protected HashMap<Integer, Goods> storage = new HashMap<>();

    public HashMap<Integer, Goods> getStorage() {
        return storage;
    }

    protected static int id = 0;


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    //добавление товаров на склад
    public void addItem(Goods goods) {
        if (storage.containsValue(goods)) {
            Optional<Integer> key = storage.entrySet()
                    .stream()
                    .filter(entry -> goods.equals(entry.getValue()))
                    .map(Map.Entry::getKey)
                    .findFirst();
            if (key.isPresent()){
            System.out.println("Такой товар уже есть в базе. Идентификатор товара: " + key.get());
            System.out.println("Добавить к существующему? Введите 1, если да, 0, если нет" );
            }
            Scanner imput = new Scanner(System.in);
            int a = imput.nextInt();
            if(a > 1 || a < 0) System.out.println("Вы ввели неправильное число");
            else if (a == 1) {
                System.out.println("Введите количество товара , которое хотите добавить");
                int b = imput.nextInt();
                if (b < 1) System.out.println("Вы ввели неправильное число");
                else {
                    goods.setQuantity(storage.get(key.get()).getQuantity() + b);
                    System.out.println(storage.get(key.get()).getQuantity());
                }

            }


        } else {
            storage.put(id, goods);
            id++;

        }
    }

    @Override
    public String toString() {
        return "Warehouse " +
                "warehouse=" + storage +
                ' ';
    }

    // выдача в консоль всех товаров на складе
    public void getAllGoods(Goods goods) {
        System.out.println("Товары в наличичии");
        for(Map.Entry<Integer, Goods> entry : storage.entrySet()){
            Integer id = entry.getKey();
            Goods product = entry.getValue();
            System.out.println(id + " " + product);
        }

    }

}




