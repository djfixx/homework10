import java.util.ArrayList;

public  class Warehouse implements GoodsWarehouse {
    public static ArrayList<String> warehouse = new ArrayList<>();
    public int getId(String name) {
        int id = warehouse.indexOf(name);
        return id;
    }

    public void addItem(String name){
        warehouse.add(name);
    }



    //public void addItem() {

    //}
}