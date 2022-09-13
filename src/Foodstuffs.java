public class Foodstuffs extends  Goods {
    private int weight;
    private  String name;

    public String getName() {
        return name;
    }
    private  int priceDollars;
    private int priceCents;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Foodstuffs(int weight, String name, int priceDollars, int priceCents) {
        this.weight = weight;
        this.name = name;
        this.priceDollars = priceDollars;
        this.priceCents = priceCents;
        Warehouse.warehouse.add(name);
        this.id = Warehouse.warehouse.indexOf(name);
    }



}
