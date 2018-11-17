package game.gfx;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class SpriteSheet {
    public String path;
    public int width;
    public int height;

    public int[] pixels;
    public BufferedImage image = null;

    public SpriteSheet(String path) {
        try {
            image = ImageIO.read(SpriteSheet.class.getResourceAsStream(path));
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(image == null) { return; }

        this.path = path;
        this.width = image.getWidth();
        this.height = image.getHeight();

        pixels = image.getRGB(0, 0, width, height, null, 0, width);

        for(int i = 0; i < pixels.length; i++) {
            pixels[i] = (pixels[i]&0xff)/64;
        }
    }
}
