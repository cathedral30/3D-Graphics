import java.awt.*;

public class Line {
    int x1;
    int x2;
    int y1;
    int y2;
    Integer z1;
    Integer z2;
    Color color;

    public Line(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Line(int x1, int x2, int y1, int y2, int z1, int z2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
        this.color = Color.BLACK;
    }

    public Line(int x1, int x2, int y1, int y2, int z1, int z2, Color color) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.z1 = z1;
        this.z2 = z2;
        this.color = color;
    }

    public int getX1(int width) {
        return (width / 2) + x1;
    }

    public int getX2(int width) {
        return (width / 2) + x2;
    }

    public int getY1(int height) {
        return (height / 2) - y1;
    }

    public int getY2(int height) {
        return (height / 2) - y2;
    }

    public void make2D(int d, int loc_x, int loc_y, int loc_z) {
        if (z1 == null && z2 == null) {
            throw new ArithmeticException();
        } else {
            /*x1 = x1 * d / (d + z1);
            x2 = x2 * d / (d + z2);
            y1 = y1 * d / (d + z1);
            y2 = y2 * d / (d + z2);*/
            System.out.println(String.format("x1 = %d and z1 = %d", x1, z1));
            x1 = Math.round(d * (((float)x1 - loc_x) / (z1 - loc_z + d)) + loc_x);
            System.out.println(String.format("goes to x1 = %d", x1));
            x2 = Math.round((d * (((float)x2 - loc_x) / (z2 - loc_z + d))) + loc_x);

            y1 = Math.round((d * (((float)y1 - loc_y) / (z1 - loc_z + d))) + loc_y);
            y2 = Math.round((d * (((float)y2 - loc_y) / (z2 - loc_z + d))) + loc_y);

            z1 = null;
            z2 = null;
        }
    }
}