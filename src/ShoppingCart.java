import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {
    protected String name;
    protected int priceInDollars;
    protected int priceInCents;
    protected int quantity;

    public int getQuantity() {
        return quantity;
    }

    protected HashMap<Integer, Goods> reservedGoods = new HashMap<>();






    public void addToCart(HashMap<Integer, Goods> goods) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите артикул товара: ");
        int id = input.nextInt();
        if (!goods.containsKey(id)) System.out.println("Товара с таким артикулом нет в на складе");  // добавить throws
        else {
            reservedGoods.put(id, goods.get(id));
            for (Map.Entry<Integer, Goods> entry : reservedGoods.entrySet()) {  //выводим все товары добавленные в корзину
                Integer idx = entry.getKey();
                Goods product = entry.getValue();
                System.out.println(idx + " " + product);
                System.out.println("Введите желаемое количество товара: ");
                goods.get(id).getQuantity();

                int qty = input.nextInt();
                if(qty < 1 || qty > goods.get(id).getQuantity()) System.out.println("Количество товара не может быть отрицательным или большим чем есть товар в наличии");
                else {
                    int result = reservedGoods.get(id).getQuantity() - qty;
                    reservedGoods.get(id).setQuantityr();
                    System.out.println(result);
                    System.out.println(re);

                }


            }
        }
    }
//    public static HashMap cloning(Goods goods2){
//        Goods reserved = null;
//        try {
//            reserved = (Goods) goods2.clone();
//        }catch (CloneNotSupportedException e){
//            e.printStackTrace();
//        }
//
//        return reserved();
//    }
    public  void setQuantityr(int quantity) {
        this.quantity = quantity;}
}
