public class Souvenirs extends Goods {
    public Souvenirs(String name,  int priceDollars, int priceCents, int quantity) {
        this.name = name;
        this.priceInDollars = priceDollars;
        this.priceInCents = priceCents;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Сувениры |" + name + '\'' +
                "| Цена " + priceInDollars +
                "," + priceInCents +
                "| Количество:" + quantity +
                '|';
    }
}
