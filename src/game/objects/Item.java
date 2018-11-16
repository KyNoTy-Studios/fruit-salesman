package game.objects;

public interface Item {

    /**
     * Returns the id of the item.
     * @return the item's id as an int
     */
    int getId();

    /**
     * Returns the name of the item.
     * @return the item's name as a String
     */
    String getName();

    /**
     * Returns the price of the item.
     * @return the item's price as a long
     */
    long getPrice();

    /**
     * Updates the price of the item.
     * @param price the new price of the item as a long
     */
    void setPrice(long price);

    /**
     * Retuns the sprite of the item.
     * @return the item's sprite as a BufferedImage
     */
    int[] getSprite();

    /**
     * Returns item's current row position on the game map.
     * @return the item's current map row position (-1 means the item has not been placed)
     */
    int getX();

    /**
     * Returns item's current column position on the game map.
     * @return the item's current map column position (-1 means the item has not been placed)
     */
    int getY();

    /**
     * Sets the item's current map position.
     * @param x target row position
     * @param y target column position
     */
    void setPos(int x, int y);

    /**
     * Clears the item's current map position.
     * Sets item's x and y values to -1 (invalid position);
     */
    void clearPos();
}
