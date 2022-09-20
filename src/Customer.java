import java.util.*;

public class Customer {

    protected String name;
    protected int cashDollars;
    protected int cashCents;
    protected int purchasedGoods;
    protected static int userId = 0;

    public int getId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Покупатель: " +
                "Имя: " + name + " | "+
                "Балланс: " + cashDollars +
                "," + cashCents +
                " | Количество купленных товаров: " + purchasedGoods +
                '|';
    }

    protected HashMap<Integer, Customer> customers = new HashMap<>();


    public Customer(String name, int cashDollars, int cashCents) {
        this.name = name;
        this.cashDollars = cashDollars;
        this.cashCents = cashCents;


    }

    public void addCustomer(Customer customer) {
        if (customers.containsValue(customer)) {
            Optional<Integer> key = customers.entrySet()
                    .stream()
                    .filter(entry -> customer.equals(entry.getValue()))
                    .map(Map.Entry::getKey)
                    .findFirst();
            if (key.isPresent())
                //System.out.println(key.get());
                //System.out.println("Ключ: " + key);
                //System.out.println(storage.get(key.get()).getQuantity());
                //System.out.println(goods.getQuantity());
                System.out.println("Такой пользователь уже есть в базе");
        } else {
            customers.put(userId, customer);
            userId++;
            System.out.println(customer.toString());
            //System.out.println(storage.get(1));
        }
    }

}







