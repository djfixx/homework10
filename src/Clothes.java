public class Clothes extends Goods {
    private String size;
    private String season;

    @Override
    public String toString() {
        return "Одежда |" +
                name +
                " | Цена " + priceInDollars + "," + priceInCents +
                "| Размер '" + size + '\'' +
                "| Сезон '" + season + '\'' +  '\'' +

                "| Количество на складе " + quantity + '|';
    }

    public Clothes(String name, int priceInDollars, int priceInCents, String size, String season, int quantity) {
        this.name = name;
        this.priceInDollars = priceInDollars;
        this.priceInCents = priceInCents;
        this.size = size;
        this.season = season;
        this.quantity = quantity;
    }
}

