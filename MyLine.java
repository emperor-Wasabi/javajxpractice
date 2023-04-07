// Fig. 8.17: MyLine.java
// This class represents a line
// ~ Eston Yandell

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine {
    private double x1; // x-coordinate of first endpoint
    private double y1; // y-coord of 1st endpoint
    private double x2; // x-coord of 2nd endpoint
    private double y2; // y-coord of 2nd endpoint
    private Color strokeColor; // color of this line

    public MyLine(
            double x1, double y1, double x2, double y2, Color strokeColor
    ) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.strokeColor = strokeColor;
    }

    // Draw the line in the specified color
    public void draw(GraphicsContext gc) {
        gc.setStroke(strokeColor);
        gc.strokeLine(x1, y1, x2, y2);
    }
}


