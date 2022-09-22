public class Foodstuffs extends Goods{
    private int weight;


    public Foodstuffs(String name, int priceInDollars, int priceInCents, int weight, int quantity) {
        this.name = name;
        this.priceInDollars = priceInDollars;
        this.priceInCents = priceInCents;
        this.weight = weight;
        this.quantity = quantity;
    }



    public String toString() {
        return "Продукты |" +
                 name + " | " +
                " Цена: " + priceInDollars + "," + priceInCents + " | " +
                " Вес: " + weight + " | " +
                " Количество на складе: = " + quantity +
                '|';
    }
}
