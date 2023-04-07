// Fig. 8.18: DrawRandomLinesController.java
// Drawing random lines using MyLine objects

package src.main;

import java.security.SecureRandom;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
public class WithObjectsPartTwo {
    private static final SecureRandom randomNumbers = new SecureRandom();
    @FXML private Canvas canvas;

    // Draws random lines
    @FXML
    void drawLinesButtonPressed(ActionEvent event) {
        // Get the GraphicsContext, which is used to draw on the Canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        MyLine[] lines = new MyLine[100]; // Stores the MyLine objects

        final int width = (int) canvas.getWidth();
        final int height = (int) canvas.getHeight();

        for ( int count = 0; count < lines.length; count++) {
            // Generate random coordinates
            double x1 = randomNumbers.nextInt(width);
            double y1 = randomNumbers.nextInt(height);
            double x2 = randomNumbers.nextInt(width);
            double y2 = randomNumbers.nextInt(height);

            // Generate a random color
            Color color = Color.rgb(
                randomNumbers.nextInt(256),
                randomNumbers.nextInt(256),
                randomNumbers.nextInt(256)
            );

            // Add a new MyLine to the array
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }

        // clear the Cnavas then draw the lines
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for ( MyLine line : lines) {
            line.draw(gc);
        }
    }
}
