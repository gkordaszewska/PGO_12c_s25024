package g12c.cw2;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart currentShoppingCart;
    private final List<ShoppingCart> historyShoppingCarts = new ArrayList<>();

    public Person (String name, String surname, double moneyInCash, double moneyOnCard) {
        this.name=name;
        this.surname=surname;
        this.moneyInCash=moneyInCash;
        this.moneyOnCard=moneyOnCard;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new RuntimeException("Imię nie może być puste");
        }
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        if(surname == null || surname.isEmpty()){
            throw new RuntimeException("Nazwisko nie może być puste");
        }
        this.surname = surname;
    }


    public double getMoneyInCash() {
        return moneyInCash;
    }
    public void setMoneyInCash(double moneyInCash) {
        if(moneyInCash < 0){
            throw new RuntimeException("Ilość gotówki nie może być niższa od zera");
        }
        this.moneyInCash = moneyInCash;
    }


    public double getMoneyOnCard() {
        return moneyOnCard;
    }
    public void setMoneyOnCard(double moneyOnCard) {
        if(moneyOnCard < 0){
            throw new RuntimeException("Stan środków na karcie nie może być niższy od zera");
        }
        this.moneyOnCard = moneyOnCard;
    }

    public void MakeOrder(){
        this.currentShoppingCart = new ShoppingCart();
    }


    public void BuyByCard(){
        if(getMoneyOnCard() < currentShoppingCart.getTotalPrice()){
            throw new RuntimeException("Brak wystarczajacej ilości środków na karcie");
        }
        currentShoppingCart.Sell();
        setMoneyOnCard(getMoneyOnCard() - currentShoppingCart.getTotalPrice());
        this.historyShoppingCarts.add(this.currentShoppingCart);
        this.currentShoppingCart=null;

    }

    public void BuyInCash(){
        if(getMoneyInCash() < currentShoppingCart.getTotalPrice()){
            throw new RuntimeException("Brak wystarczającej ilości gotówki");
        }
        currentShoppingCart.Sell();
        setMoneyInCash(getMoneyInCash() - currentShoppingCart.getTotalPrice());
        this.historyShoppingCarts.add(this.currentShoppingCart);
        this.currentShoppingCart=null;

    }


    public void addToCart(Products products) {
        if (currentShoppingCart == null ) {
            throw new RuntimeException("Nie ma otwartego koszyka");
        }
        this.currentShoppingCart.getProducts().add(products);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", moneyInCash=" + getMoneyInCash() +
                ", moneyOnCard=" + getMoneyOnCard() +
                ", currentCart=" + currentShoppingCart +
                ", historyShoppingCarts =" + historyShoppingCarts +
                '}';
    }





}
