public class Main {
    public static void main(String[] args) {
        Goods warehouse = new Goods();
        Foodstuffs sugar = new Foodstuffs("Sugar", 1, 50, 1000, 5);

        Foodstuffs salt = new Foodstuffs("Salt", 1, 0, 1000, 3);
        Foodstuffs oranges = new Foodstuffs("Oranges", 1, 0, 1000, 10);
//        warehouse.addItem(salt);
        warehouse.addItem(sugar);


        warehouse.addItem(oranges);
        warehouse.addItem(oranges);



    }
}
