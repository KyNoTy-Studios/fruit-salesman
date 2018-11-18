package game.gfx;

public class Color {

    public static int get(int color1, int color2, int color3, int color4) {
        return get(color4) << 24 + get(color3) << 16 + get(color2) << 8 + get(color1);
    }

    public static int get(int color) {
        if(color < 0) return 255;
        int red = color/100%10;
        int green = color/10%10;
        int blue = color%10;

        return red*36 + green*6 + blue;
    }
}
