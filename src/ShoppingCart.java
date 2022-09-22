import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {
    protected String name;
    protected int priceInDollars;
    protected int priceInCents;
    protected int quantity;
    protected static int id = 0;

    public int getQuantity() {
        return quantity;
    }

    protected HashMap<Integer, Goods> reservedGoods = new HashMap<>();

    public HashMap<Integer, Goods> getReservedGoods() {
        return reservedGoods;
    }

    @Override
    public String toString() {
        return "Корзина |" +
                "добавленные товары =" + reservedGoods +
                '|';
    }

    public static int getId() {
        return id;
    }

    public void addToCart(HashMap<Integer, Goods> goods) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите артикул товара: ");
        int id = input.nextInt();
        if (!goods.containsKey(id)) System.out.println("Товара с таким артикулом нет в на складе");  // добавить throws
        else {
            //создаём поток для клониования объекта
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream ous = new ObjectOutputStream(baos);
            //сохраняем объект в поток и закрываем поток
            ous.writeObject(goods.get(id));
            ous.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            //создаём объект из потока и инициализируем его
            Goods goodsClone = (Goods) ois.readObject();
            reservedGoods.put(id, goodsClone);
            for (Map.Entry<Integer, Goods> entry : reservedGoods.entrySet()) {  //выводим все товары добавленные в корзину
                Integer idx = entry.getKey();
                Goods product = entry.getValue();
                System.out.println(idx + " " + product);
                System.out.println("Введите желаемое количество товара: ");
                goods.get(id).getQuantity();


                int qty = input.nextInt();
                if (qty < 1 || qty > goods.get(id).getQuantity())
                    System.out.println("Количество товара не может быть отрицательным или большим чем есть товар в наличии");
                else {
                    goodsClone.setQuantity(qty);
                    goods.get(id).setQuantity(goods.get(id).getQuantity() - qty);
                    System.out.println(reservedGoods.toString());

                }
            }
        }
    }

    public void getAllGoods() {
        System.out.println("Товары в корзине");
        for(Map.Entry<Integer, Goods> entry : reservedGoods.entrySet()){
            Integer id = entry.getKey();
            Goods product = entry.getValue();
            System.out.println(id + " " + product);
        }
    }
    public void buy(){

    }
}
