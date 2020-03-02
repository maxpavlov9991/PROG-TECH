public class FoodItem extends GenericItem {

    public java.util.Date dateofIncome;
    public short expires;

    public FoodItem(String name, float price, FoodItem analog, java.util.Date date, short expires) {
        this.name = name;
        this.price = price;
        this.analog = analog;
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
