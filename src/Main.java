public class Main {
    public static void main(String[] args) {
        Goods warehouse = new Goods();
        ShoppingCart bin = new ShoppingCart();
        Foodstuffs sugar = new Foodstuffs("Сахар", 1, 50, 1000, 5);

        Foodstuffs salt = new Foodstuffs("Соль", 1, 0, 1000, 3);
        Foodstuffs oranges = new Foodstuffs("Апельсины", 1, 0, 1000, 10);
        warehouse.addItem(salt);
        warehouse.addItem(sugar);
        warehouse.addItem(oranges);
        warehouse.addItem(oranges);

        Customer johnDoe = new Customer("John Doe", 300, 0);
        johnDoe.addCustomer(johnDoe);

        warehouse.getAllGoods(warehouse);
        bin.addToCart(warehouse.getStorage());

    }
}
