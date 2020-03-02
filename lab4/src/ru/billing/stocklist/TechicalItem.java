package ru.billing.stocklist;

public class TechicalItem extends GenericItem {

    private short warrantyTime;

    @Override
    void printAll() {
        System.out.println("ID: "+getID()+" , name: "+getName()+" , price: "+getPrice()+" , category: "+getCategory()+" , warrantyTime: "+warrantyTime);
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
    public TechicalItem clone() {
        return new TechicalItem();
    }

    @Override
    public String toString() {
        return "Object TechicalItem";
    }

    public short getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(short warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

}