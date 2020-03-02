package ru.billing.stocklist;

public class FoodItem extends GenericItem {

    private java.util.Date dateofIncome;
    private short expires;

    public FoodItem(String name, float price, FoodItem analog, java.util.Date date, short expires) {
        setName(name);
        setPrice(price);
        setAnalog(analog);
        this.dateofIncome = date;
        this.expires = expires;
    }

    // Default value of category
    public FoodItem(String name, float price, short expires) {
        super(name, price, Category.GENERAL);
    }

    // Default values of price and category
    public FoodItem(String name) {
        super(name, 250.5f, Category.GENERAL);
    }

    public FoodItem() {
    }

    @Override
    void printAll() {
        System.out.println("ID: "+getID()+" , name: "+getName()+" , price: "+getPrice()+" , category: "+getCategory()+" , dateofIncome: "+dateofIncome+" , expires: "+expires);
    } 

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public FoodItem clone() {
        return new FoodItem();
    }

    @Override
    public String toString() {
        return "Object FoodItem";
    }

    public java.util.Date getDateofIncome() {
        return dateofIncome;
    }

    public void setDateofIncome(java.util.Date dateofIncome) {
        this.dateofIncome = dateofIncome;
    }

    public short getExpires() {
        return expires;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }

}
