import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {

    //protected static int id = 0;


    protected HashMap<Integer, Goods> reservedGoods = new HashMap<>();

    @Override
    public String toString() {
        return "Корзина |" +
                "добавленные товары =" + reservedGoods +
                '|';
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
        for (Map.Entry<Integer, Goods> entry : reservedGoods.entrySet()) {
            Integer id = entry.getKey();
            Goods product = entry.getValue();
            System.out.println(id + " " + product);
        }
    }

    public void buy() {
        int totalPriceInDollars = 0;
        int totalPriceInCents = 0;
        for (Map.Entry<Integer, Goods> entry : reservedGoods.entrySet()) {
            int priceD = entry.getValue().priceInDollars;
            int priceC = entry.getValue().priceInCents;
            totalPriceInDollars = (priceD + totalPriceInDollars) * entry.getValue().getQuantity();
            totalPriceInCents = (priceC + totalPriceInCents) * entry.getValue().getQuantity();
        }
        System.out.println("Стоимость товаров в корзине: " + totalPriceInDollars + "," + totalPriceInCents);
    }
}
