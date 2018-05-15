package nyc.c4q.yummyzzzaaaapp;

public class Pizza {
    private String name;
    private int imageResourceID;

    public static final Pizza [] pizzas = {
            new Pizza("Margharita", R.drawable.margharitapizza),
            new Pizza ("Pepperoni", R.drawable.pepperonipizza)
    };

    private Pizza (String name, int imageResourceID) {
        this.name = name;
        this.imageResourceID = imageResourceID;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceID(){
        return imageResourceID;
        }
}

