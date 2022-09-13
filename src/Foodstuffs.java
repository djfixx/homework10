public class Foodstuffs extends  Goods {
    protected int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Foodstuffs(int weight, String name, int priceDollars, int priceCents, int quantity) {
        this.weight = weight;
        super.name = name;
        this.priceDollars = priceDollars;
        this.priceCents = priceCents;
        this.quantity = quantity;
        Warehouse.warehouse.add(name);
        this.id = Warehouse.warehouse.indexOf(name);
    }

}
