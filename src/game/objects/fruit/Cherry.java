package game.objects.fruit;

import game.objects.Item;

public class Cherry implements Item {
    private static final int ID = 9;
    private static final String NAME = "Cherry";
    private long price;
    private int[] pixels;
    private int x, y;

    public Cherry(long price) {
        this(price, -1, -1);
    }

    public Cherry(long price, int x, int y) {
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

    public void setPrice(long price) {
        this.price = price;
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
