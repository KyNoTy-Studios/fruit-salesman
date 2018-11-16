package game;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class FruitSalesman extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;

    public int width;
    public int height;
    public int scale = 1;

    private JFrame frame;

    public int tickCount = 0;
    public boolean running = false;

    public BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    public int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();

    public FruitSalesman() {
        this(400, 400/16*9);
    }

    public FruitSalesman(int targetWidth, int targetHeight) {
        width = targetWidth;
        height = targetHeight;
        setMinimumSize(new Dimension(width*scale, height*scale));
        setMaximumSize(new Dimension(width*scale, height*scale));
        setPreferredSize(new Dimension(width*scale, height*scale));

        frame = new JFrame("Fruit Salesman");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(this, BorderLayout.CENTER);
        frame.pack();

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public synchronized void start() {
        running = true;
        new Thread(this).start();
    }

    public synchronized void stop() {
        running = false;
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double nsPerTick = 1000000000D/60D;

        int ticks = 0;
        int frames = 0;

        long lastTimer = System.currentTimeMillis();
        double delta = 0;

        while(running) {
            long now = System.nanoTime();
            delta += (now-lastTime)/nsPerTick;
            lastTime = now;
            boolean shouldRender = true;

            while(delta >= 1) {
                ticks++;
                tick();
                delta -= 1;
                shouldRender = true;
            }

            try {
                Thread.sleep(2);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }

            if(shouldRender) {
                frames++;
                render();
            }

            if(System.currentTimeMillis()-lastTimer >= 1000) {
                lastTimer += 1000;
                System.out.println(ticks + " ticks, " + frames + " frames");
                ticks = 0;
                frames = 0;
            }
        }
    }

    public void tick() {
        tickCount++;
    }

    public void render() {

    }

    public static void main(String[] args) {
        new FruitSalesman().start();
    }
}
