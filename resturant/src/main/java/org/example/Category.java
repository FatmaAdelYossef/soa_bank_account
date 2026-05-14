package org.example;

public class Category {
   private int id;
   private String name;
   private String kitchenName;

   public  Category(int id, String name, String kitchenName) {
       this.id = id;
       this.name = name;
       this.kitchenName = kitchenName;
   }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKitchenName() {
        return kitchenName;
    }

    public void setKitchenName(String kitchenName) {
        this.kitchenName = kitchenName;
    }
}