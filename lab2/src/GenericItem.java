class GenericItem {
  
    public int ID;
    public String name;
    public float price;
    public GenericItem analog;
    public Category category = Category.GENERAL;

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

}