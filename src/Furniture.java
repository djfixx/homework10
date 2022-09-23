public class Furniture extends Goods{
    private String type;

    @Override
    public String toString() {
        return "Мебель: |" + name + '\'' +
                " | Тип: " + type +
                " | Цена " + priceInDollars +
                "," + priceInCents +
                " | Количество:" + quantity +
                '|';
    }

    public Furniture(String name, String type, int priceDollars, int priceCents, int quantity) {
        this.name = name;
        this.type = type;
        this.priceInDollars = priceDollars;
        this.priceInCents = priceCents;
        this.quantity = quantity;
    }
}
