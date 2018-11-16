package game.objects.fruit;

import game.objects.Item;

public class Banana implements Item {
    private static final int ID = 4;
    private static final String NAME = "Banana";
    private long price;
    private int[] pixels;
    private int x, y;

    public Banana(long price) {
        this(price, -1, -1);
    }

    public Banana(long price, int x, int y) {
        this.price = price;
        this.x = x;
        this.y = y;
    }

    public int getId() {
        return ID;
    }

    public String getName() {
        return NAME;
    }

    public long getPrice() {
        return price;
    }

    public int[] getSprite() {
        return pixels;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void clearPos() {
        x = -1;
        y = -1;
    }
}
