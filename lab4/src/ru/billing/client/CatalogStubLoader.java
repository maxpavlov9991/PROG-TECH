package ru.billing.client;

import ru.billing.stocklist.*;

public class CatalogStubLoader implements CatalogLoader {

    public void load(ItemCatalog cat){
        GenericItem item1 = new GenericItem("Sony TV", 23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread", 12, null, new java.util.Date(), (short)10);

        cat.addItem(item1);
        cat.addItem(item2);
    }
}