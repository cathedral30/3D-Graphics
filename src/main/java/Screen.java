import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

public class Screen extends Frame {

    Line[] lines = new Line[]{};
    Integer[] loc = new Integer[]{0, 0, 0};
    Wini ini = new Wini(new File(getClass().getClassLoader().getResource("config.ini").getFile()));
    int width = ini.get("graphics", "width", int.class);
    int height = ini.get("graphics", "height", int.class);
    int d = ini.get("graphics", "d", int.class);

    public Screen() throws IOException {
        prepareGUI();
        setTitle("Graphics");
    }

    public Line[] getLines() {
        return lines;
    }

    public void setLines(Line[] lines) {
        this.lines = lines;
    }

    private void prepareGUI(){
        setSize(width, height);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        for (Line line : lines) {
            g.setColor(line.color);
            if (line.z1 != null) {
                line.make2D(d, loc[0], loc[1], loc[2]);
            }
            g.drawLine(line.getX1(width), line.getY1(height), line.getX2(width), line.getY2(height));
        }
    }
}
