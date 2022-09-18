import java.util.ArrayList;

public class Customer {
    protected int id;
    protected String name;
    protected int cashDollars;
    protected int cashCents;
    protected int purchasedGoods;

    public int getId() {
        return id;
    }

    protected ArrayList<String> customers = new ArrayList<>();
    protected ArrayList<String> reservedGoods = new ArrayList<>();

    public Customer(String name, int cashDollars, int cashCents, int purchasedGoods) {
        this.name = name;
        this.cashDollars = cashDollars;
        this.cashCents = cashCents;
        this.purchasedGoods = purchasedGoods;
        customers.add(name);
        this.id = customers.indexOf(name);
    }






}
