import java.util.*;

public class Goods {
    protected String name;
    protected int priceInDollars;
    protected int priceInCents;
    protected int quantity;
    protected HashMap<Integer, Goods> storage = new HashMap<>();
    protected static int id = 0;


    public void setQuantity(int quantity) {
        this.quantity = quantity + this.quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addItem(Goods goods) {


        if (storage.containsValue(goods)) {
            Optional<Integer> key = storage.entrySet()
                    .stream()
                    .filter(entry -> goods.equals(entry.getValue()))
                    .map(Map.Entry::getKey)
                    .findFirst();
            if (key.isPresent())
                //System.out.println(key.get());
            //System.out.println("Ключ: " + key);
            //System.out.println(storage.get(key.get()).getQuantity());
            //System.out.println(goods.getQuantity());
            System.out.println("Такой отвар уже есть в базе. Идентификатор товара: " + key.get());
            System.out.println("Добавить к существующему? Введите 1, если да, 0, если нет" );
            Scanner imput = new Scanner(System.in);
            int a = imput.nextInt();
            if(a > 1 || a < 0) System.out.println("Вы ввели неправильное число");
            else if (a == 1) {
                System.out.println("Введите количество товара , которое хотите добавить");
                int b = imput.nextInt();
                if (b < 0) System.out.println("Вы ввели неправильное число");
                else {
                    goods.setQuantity(b);
                    System.out.println(storage.get(key.get()).getQuantity());
                    System.out.println(storage.toString());
                }

            }


        } else {
            storage.put(id, goods);
            id++;
            System.out.println(id + " " + storage.containsValue(goods));
            //System.out.println(storage.get(1));
        }
    }

    private String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "warehouse=" + storage +
                '}';
    }
}




