package main.java;

import java.util.ArrayList;

public class Pizza {
    private int PizzaID;
    private String CrustType;
    private String Size;
    private int OrderID;
    private String PizzaState;
    private String PizzaDate;
    private double CustPrice;
    private double BusPrice;
    private ArrayList<Topping> Toppings;
    private boolean[] isToppingDoubled;//each index in this array will represent whether the topping at Toppings.get(index) is doubled.
    private ArrayList<Discount> Discounts;

    public Pizza(int pizzaID, String size, String crustType, int orderID, String pizzaState, String pizzaDate,
                 double custPrice, double busPrice) {
        PizzaID = pizzaID;
        CrustType = crustType;
        Size = size;
        OrderID = orderID;
        PizzaState = pizzaState;
        PizzaDate = pizzaDate;
        CustPrice = custPrice;
        BusPrice = busPrice;
        Toppings = new ArrayList<Topping>();
        isToppingDoubled = new boolean[17];//We have 17 toppings, the array needs to be size 17. A good programmer wouldn't hard code this.
        Discounts = new ArrayList<Discount>();
    }

    public int getPizzaID() {
        return PizzaID;
    }

    public void setPizzaID(int pizzaID) {
        PizzaID = pizzaID;
    }

    public String getCrustType() {
        return CrustType;
    }

    public void setCrustType(String crustType) {
        CrustType = crustType;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public String getPizzaState() {
        return PizzaState;
    }

    public void setPizzaState(String pizzaState) {
        PizzaState = pizzaState;
    }

    public String getPizzaDate() {
        return PizzaDate;
    }

    public void setPizzaDate(String pizzaDate) {
        PizzaDate = pizzaDate;
    }

    public double getCustPrice() {
        return CustPrice;
    }

    public void setCustPrice(double custPrice) {
        CustPrice = custPrice;
    }

    public double getBusPrice() {
        return BusPrice;
    }

    public void setBusPrice(double busPrice) {
        BusPrice = busPrice;
    }

    public ArrayList<Topping> getToppings() {
        return Toppings;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        Toppings = toppings;
    }

    public ArrayList<Discount> getDiscounts() {
        return Discounts;
    }

    public void setDiscounts(ArrayList<Discount> discounts) {
        Discounts = discounts;
    }

    public void addToppings(Topping t, boolean isExtra) {
        Toppings.add(t);
        //also add to the prices of the pizza
        if (isExtra) {
            this.BusPrice += t.getBusPrice() * 2;
            this.CustPrice += t.getCustPrice() * 2;
        } else {
            this.BusPrice += t.getBusPrice();
            this.CustPrice += t.getCustPrice();
        }

    }

    public void addDiscounts(Discount d) {
        Discounts.add(d);
        if (d.isPercent()) {
            this.CustPrice = (this.CustPrice * (1 - d.getAmount()));
        } else {
            this.CustPrice -= d.getAmount();
        }
    }

    public void modifyDoubledArray(int index, boolean b) {
        isToppingDoubled[index] = b;
    }

    public boolean[] getIsDoubleArray() {
        return isToppingDoubled;
    }

    @Override
    public String toString() {
        return "PizzaID=" + PizzaID + " | CrustType= " + CrustType + ", Size= " + Size + " | For order " + OrderID
                + " | Pizza Status: " + PizzaState + ", as of " + PizzaDate + " | Customer Price= " + CustPrice + " | Business Price= "
                + BusPrice;
    }


}
