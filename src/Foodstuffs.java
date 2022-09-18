public class Foodstuffs extends Goods{
    private int weight;

    public Foodstuffs(String name, int priceInDollars, int priceInCents, int weight, int quantity) {
        this.name = name;
        this.priceInDollars = priceInDollars;
        this.priceInCents = priceInCents;
        this.weight = weight;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }


    public String toString() {
        return "Foodstuffs{" +
                "name = " + name + " | " +
                " price = " + priceInDollars + "," + priceInCents + " | " +
                " weight = " + weight + " | " +
                " quantity = " + quantity +
                '}';
    }
}
