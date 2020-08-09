import java.awt.*;

public class Cuboid {

    int width;
    int height;
    int depth;

    int loc_x;
    int loc_y;
    int loc_z;

    Color color;

    public Cuboid(int width, int height, int depth, int loc_x, int loc_y, int loc_z) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.loc_x = loc_x;
        this.loc_y = loc_y;
        this.loc_z = loc_z;
        this.color = Color.BLACK;
    }

    public Cuboid(int width, int height, int depth, int loc_x, int loc_y, int loc_z, Color color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.loc_x = loc_x;
        this.loc_y = loc_y;
        this.loc_z = loc_z;
        this.color = color;
    }

    public Line[] generateLines() {
        return(new Line[]{
                new Line(loc_x, loc_x, loc_y, loc_y + height, loc_z, loc_z, color),
                new Line(loc_x + width, loc_x + width, loc_y, loc_y + height, loc_z, loc_z, color),
                new Line(loc_x, loc_x + width, loc_y, loc_y, loc_z, loc_z, color),
                new Line(loc_x, loc_x + width, loc_y + height, loc_y + height, loc_z, loc_z, color),
                new Line(loc_x, loc_x, loc_y, loc_y + height, loc_z + depth, loc_z + depth, color),
                new Line(loc_x + width, loc_x + width, loc_y, loc_y + height, loc_z + depth, loc_z + depth, color),
                new Line(loc_x, loc_x + width, loc_y, loc_y, loc_z + depth, loc_z + depth),
                new Line(loc_x, loc_x + width, loc_y + height, loc_y + height, loc_z + depth, loc_z + depth, color),
                new Line(loc_x, loc_x, loc_y + height, loc_y + height, loc_z, loc_z + depth, color),
                new Line(loc_x + width, loc_x + width, loc_y + height, loc_y + height, loc_z, loc_z + depth, color),
                new Line(loc_x, loc_x, loc_y, loc_y, loc_z, loc_z + depth, color),
                new Line(loc_x + width, loc_x + width, loc_y, loc_y, loc_z, loc_z + depth, color),});
    }
}
