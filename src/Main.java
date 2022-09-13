import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Warehouse mainWarehouse = new Warehouse();

        Foodstuffs sugar = new Foodstuffs(1000, "Sugar", 1, 50);
        mainWarehouse.addItem("Sugar");
        sugar.setId(mainWarehouse.getId(sugar.getName()));
        System.out.println(sugar.getId());

        Foodstuffs salt = new Foodstuffs(1000, "Salt", 1,0);
        mainWarehouse.addItem("Salt");
        salt.setId(mainWarehouse.getId(salt.getName()));
        System.out.println(salt.getId());

        Foodstuffs oranges = new Foodstuffs(1000, "Oranges", 1,0);
        mainWarehouse.addItem(oranges.getName());
        oranges.setId(mainWarehouse.getId(oranges.getName()));
        System.out.println(oranges.getId());

    }
}
