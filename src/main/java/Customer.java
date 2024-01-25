package main.java;

public class Customer {
    private int CustID;
    private String FName;
    private String LName;
    private String Phone;
    private String Address;


    public Customer(int custID, String fName, String lName, String phone) {
        CustID = custID;
        FName = fName;
        LName = lName;
        Phone = phone;
    }

    public int getCustID() {
        return CustID;
    }

    public void setCustID(int custID) {
        CustID = custID;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String fName) {
        FName = fName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String lName) {
        LName = lName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }


    @Override
    public String toString() {
        return "CustID=" + CustID + " | Name= " + FName + " " + LName + ", Phone= " + Phone;
    }


}
