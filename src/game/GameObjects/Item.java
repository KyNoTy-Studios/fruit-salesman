package game.GameObjects;

import java.awt.image.BufferedImage;

public interface Item {

    /**
     * Returns the name of the item
     *
     * @return the item's name as a String
     * @since 1.10
     */
    String getName();

    /**
     * Returns the price of the item
     *
     * @return the item's price as a long
     * @since 1.10
     */
    long getPrice();

    /**
     * Retuns the sprite of the item
     *
     * @return the item's sprite as a BufferedImage
     * @since 1.10
     */
    int[] getSprite();


}
