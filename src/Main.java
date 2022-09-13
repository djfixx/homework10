
public class Main {
    public static void main(String[] args) {
        Warehouse mainWarehouse = new Warehouse();

        Foodstuffs sugar = new Foodstuffs(1000, "Sugar", 1, 50);
        System.out.println(sugar.getId());

        Foodstuffs salt = new Foodstuffs(1000, "Salt", 1,0);
        System.out.println(salt.getId());


        Foodstuffs oranges = new Foodstuffs(1000, "Oranges", 1,0);
        System.out.println(oranges.getId());





    }
}
