import java.util.ArrayList;

public  class Warehouse implements GoodsWarehouse {
    public int getId(String name) {
        int id = warehouse.indexOf(name);
        return id;
    }



    private ArrayList<String> warehouse = new ArrayList<>();



    public void addItem(String name){
        warehouse.add(name);
    }




}