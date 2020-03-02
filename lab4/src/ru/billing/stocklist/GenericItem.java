package ru.billing.stocklist;

public class GenericItem {
  
    private int ID;
    private String name;
    private float price;
    private GenericItem analog;
    private Category category = Category.GENERAL;

    static int currentID = 0;

    public GenericItem(String name, float price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem(String name, float price, GenericItem analog) {
        this.name = name;
        this.price = price;
        this.analog = analog;
        this.ID = GenericItem.currentID++;
    }

    public GenericItem() {
        this.ID = GenericItem.currentID++;
    }

    void printAll() {
        System.out.println("ID: "+ID+" , name: "+name+" , price: "+price+" , category: "+category);
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
    public Object clone() {
        if (analog instanceof GenericItem) {
            return new GenericItem();
        } else {
            return analog.clone();
        }
    }

    @Override
    public String toString() {
        return "Object GenericItem";
    }

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public GenericItem getAnalog() {
		return analog;
	}

	public void setAnalog(GenericItem analog) {
		this.analog = analog;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public static int getCurrentID() {
		return currentID;
	}

	public static void setCurrentID(int currentID) {
		GenericItem.currentID = currentID;
	}

}