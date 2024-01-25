package main.java;

public class Topping {
    private int TopID;
    private String TopName;
    private double BusPrice;
    private double CustPrice;
    private double PerAMT;
    private double MedAMT;
    private double LgAMT;
    private double XLAMT;
    private int MinINVT;
    private int CurINVT;

    public Topping(int topID, String topName, double perAMT, double medAMT, double lgAMT, double xLAMT,
                   double custPrice, double busPrice, int minINVT, int curINVT) {
        TopID = topID;
        TopName = topName;
        PerAMT = perAMT;
        MedAMT = medAMT;
        LgAMT = lgAMT;
        XLAMT = xLAMT;
        CustPrice = custPrice;
        BusPrice = busPrice;
        MinINVT = minINVT;
        CurINVT = curINVT;
    }

    public int getTopID() {
        return TopID;
    }

    public void setTopID(int topID) {
        TopID = topID;
    }

    public String getTopName() {
        return TopName;
    }

    public void setTopName(String topName) {
        TopName = topName;
    }

    public double getPerAMT() {
        return PerAMT;
    }

    public void setPerAMT(double perAMT) {
        PerAMT = perAMT;
    }

    public double getMedAMT() {
        return MedAMT;
    }

    public void setMedAMT(double medAMT) {
        MedAMT = medAMT;
    }

    public double getLgAMT() {
        return LgAMT;
    }

    public void setLgAMT(double lgAMT) {
        LgAMT = lgAMT;
    }

    public double getXLAMT() {
        return XLAMT;
    }

    public void setXLAMT(double xLAMT) {
        XLAMT = xLAMT;
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

    public int getMinINVT() {
        return MinINVT;
    }

    public void setMinINVT(int minINVT) {
        MinINVT = minINVT;
    }

    public int getCurINVT() {
        return CurINVT;
    }

    public void setCurINVT(int curINVT) {
        CurINVT = curINVT;
    }

    @Override
    public String toString() {
        return "Topping [TopID=" + TopID + ", TopName=" + TopName + ", PerAMT=" + PerAMT + ", MedAMT=" + MedAMT
                + ", LgAMT=" + LgAMT + ", XLAMT=" + XLAMT + ", CustPrice=" + CustPrice + ", BusPrice=" + BusPrice
                + ", MinINVT=" + MinINVT + ", CurINVT=" + CurINVT + "]";
    }


}
