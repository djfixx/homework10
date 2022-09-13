public class Foodstuffs extends  Goods{
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

    public int getWeight() {
        return weight;
    }



    public int getPriceDollars() {
        return priceDollars;
    }

    public int getPriceCents() {
        return priceCents;
    }

    public Foodstuffs(int weight, String name, int priceDollars, int priceCents) {
        this.weight = weight;
        this.name = name;
        this.priceDollars = priceDollars;
        this.priceCents = priceCents;
        this.id = id;
    }
}
