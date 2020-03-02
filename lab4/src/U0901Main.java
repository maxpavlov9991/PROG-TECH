public class U0901Main {
    public static void main(String[] args) throws Exception {

        Integer intArr[] = {10, 20, 15};

        Float floatArr[] = new Float[3];
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = ((float)(Math.random()));
        }

        U0901WorkArray<Integer> insWorkArrayInt = new U0901WorkArray<>(intArr);
        U0901WorkArray<Float> insWorkArrayFloat = new U0901WorkArray<>(floatArr);

        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());

        String line = "Конфеты 'Маска';45;120";

        String item_fld[] = line.split(";");

        FoodItem foodItem = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));

        foodItem.printAll();

    }
}