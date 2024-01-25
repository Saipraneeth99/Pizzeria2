package main.java;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Order {
    private int OrderID;
    private int CustID;
    private String OrderType;
    private String Date;
    private double CustPrice;
    private double BusPrice;
    private int isComplete;
    private ArrayList<Pizza> PizzaList;
    private ArrayList<Discount> DiscountList;


    public Order(int orderID, int custID, String orderType, String date, double custPrice, double busPrice, int iscomplete) {
        OrderID = orderID;
        CustID = custID;
        OrderType = orderType;
        Date = date;
        CustPrice = custPrice;
        BusPrice = busPrice;
        this.isComplete = iscomplete;
        PizzaList = new ArrayList<Pizza>();
        DiscountList = new ArrayList<Discount>();
    }

    public void addPizza(Pizza p) {
        PizzaList.add(p);
    }

    public void addDiscount(Discount d) {
        DiscountList.add(d);
        if (d.isPercent()) {
            this.CustPrice = (this.CustPrice * (1 - (d.getAmount() / 100)));//turn the amount into a percent
        } else {
            this.CustPrice -= d.getAmount();
        }
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getCustID() {
        return CustID;
    }

    public void setCustID(int custID) {
        CustID = custID;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String orderType) {
        OrderType = orderType;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
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

    public int getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(int iscomplete) {
        this.isComplete = iscomplete;
    }

    public ArrayList<Pizza> getPizzaList() {
        return PizzaList;
    }

    public void setPizzaList(ArrayList<Pizza> pizzaList) {
        PizzaList = pizzaList;
    }

    public ArrayList<Discount> getDiscountList() {
        return DiscountList;
    }

    public void setDiscountList(ArrayList<Discount> discountList) {
        DiscountList = discountList;
    }


    @Override
    public String toString() {
        try {
            return "OrderID=" + OrderID + " | Date Placed= " + this.Date + " | For customer: " + DBNinja.getCustomerName(CustID) + " | OrderType= " + OrderType + ", Placed on: " + Date
                    + " | CustPrice= " + CustPrice + ", BusPrice= " + BusPrice;
        } catch (SQLException | IOException e) {
            e.printStackTrace();
            return "ERROR IN PRINT CUSTOMER";
        }
    }

    public String toSimplePrint() {
        try {
            boolean iscomplete = true;
            if (isComplete == 0)
                iscomplete = false;
            return "OrderID=" + OrderID + " | Date Placed= " + this.Date + " | Customer name= " + DBNinja.getCustomerName(CustID) + ", OrderType= " + OrderType + ", IsComplete= " + iscomplete;
        } catch (SQLException e) {
            e.printStackTrace();
            return "ERROR IN SIMPLE PRINT CUSTOMER";
        } catch (IOException e) {
            e.printStackTrace();
            return "ERROR IN SIMPLE PRINT CUSTOMER";
        }
    }


}
