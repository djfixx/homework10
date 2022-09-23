import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Goods warehouse = new Goods();
        ShoppingCart bin = new ShoppingCart();

        Foodstuffs sugar = new Foodstuffs("Сахар", 1, 50, 1000, 5);
        Foodstuffs salt = new Foodstuffs("Соль", 1, 0, 1000, 3);
        Foodstuffs oranges = new Foodstuffs("Апельсины", 1, 0, 1000, 10);
        Clothes tshirt = new Clothes("Футболка", 5, 0, "L", "Лето", 5);
        Furniture table = new Furniture("Стол", "Корпусная мебель", 120, 0, 5);
        Souvenirs magnet = new Souvenirs("Магнит на холодильник", 0 , 50, 10);

        warehouse.addItem(salt);
        warehouse.addItem(sugar);
        warehouse.addItem(oranges);
        warehouse.addItem(oranges);
        warehouse.addItem(tshirt);
        warehouse.addItem(table);
        warehouse.addItem(magnet);

        Customer johnDoe = new Customer("John Doe", 300, 0);
        johnDoe.addCustomer(johnDoe);

        warehouse.getAllGoods(warehouse);
        bin.addToCart(warehouse.getStorage());
        bin.getAllGoods();
        bin.buy();
    }
}
