public class TechicalItem extends GenericItem {

    public short warrantyTime;

    @Override
    void printAll() {
        System.out.println("ID: "+ID+" , name: "+name+" , price: "+price+" , category: "+category+" , warrantyTime: "+warrantyTime);
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

}