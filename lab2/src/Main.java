public class Main {
    public static void main(String[] args) throws Exception {

        GenericItem item1 = new GenericItem();
        GenericItem item2 = new GenericItem();
        GenericItem item3 = new GenericItem();
        FoodItem foodItem = new FoodItem();
        TechicalItem techicalItem = new TechicalItem();

        item1.ID = 1;
        item1.name = "First";
        item1.price = 500.5f;
        item1.analog = item2;


        item2.ID = 2;
        item2.name = "Second";
        item2.price = 1000.5f;
        item2.analog = item3;


        item3.ID = 3;
        item3.name = "Third";
        item3.price = 1500.5f;
        item3.analog = item1;


        foodItem.ID = 5;
        foodItem.name = "foodItem";
        foodItem.price = 2000.5f;
        foodItem.dateofIncome = new java.util.Date();
        foodItem.expires = 10;
        
        techicalItem.ID = 4;
        techicalItem.name = "techItem";
        techicalItem.price = 2500.5f;
        techicalItem.warrantyTime = 15;

        item1.printAll();
        item2.printAll();
        item3.printAll();
        techicalItem.printAll();
        foodItem.printAll();


        FoodItem foodItem2 = new FoodItem();
        FoodItem foodItem3 = new FoodItem();
        System.out.println(foodItem2.equals(foodItem3));

        FoodItem foodItemClone = foodItem3.clone();
        System.out.println(foodItem3.equals(foodItemClone));

        System.out.println(item1.toString());

        
    }
}