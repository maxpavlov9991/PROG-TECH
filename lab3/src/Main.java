public class Main {
    public static void main(String[] args) throws Exception {

        String line = "Конфеты 'Маска';45;120";

        String item_fld[] = line.split(";");

        FoodItem foodItem = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));

        foodItem.printAll();
    }
}