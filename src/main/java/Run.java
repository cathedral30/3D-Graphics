import java.awt.*;
import java.io.IOException;

public class Run {
    public static void main(String[] args) throws InterruptedException, IOException {
        Screen screen = new Screen();

        screen.setVisible(true);
        screen.setLines(mergeLines(
                new Cuboid(100, 100, 200, -50, -540, 2000, Color.GREEN).generateLines(),
                new Cuboid(100, 100, 200, -50, -50, 10000).generateLines()));
        screen.repaint();
    }

    public static Line[] mergeLines(Line[] a, Line[] b) {
        int aLen = a.length;
        int bLen = b.length;

        Line[] result = new Line[aLen + bLen];
        System.arraycopy(a, 0, result, 0, aLen);
        System.arraycopy(b, 0, result, aLen, bLen);
        return result;
    }
}
