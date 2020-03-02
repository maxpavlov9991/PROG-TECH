public class FoodItem extends GenericItem {

    public java.util.Date dateofIncome;
    public short expires;

    @Override
    void printAll() {
        System.out.println("ID: "+ID+" , name: "+name+" , price: "+price+" , category: "+category+" , dateofIncome: "+dateofIncome+" , expires: "+expires);
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

}
