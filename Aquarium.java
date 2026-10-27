import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {

    public static void main(String[] args) {

        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");

        PainterAPI p = canvas.getPainter();
        p.setSpeed(100);
        p.forward(100);
        p.turnRight(90);

    }
    /**
     * Draws a triangle on the canvas.
     * @param size  size of the triangle
     * @param color color of the triangle
     * @param xPos x position of the triangle
     * @param yPos y position of the triangle
     */ 

    public static void drawTriangle(int size, Color color, int xPos, int yPos) {
        // Implementation for drawing a triangle
    }

    /**
     * Draws a square on the canvas.
     * @param size  size of the square
     * @param color color of the square
     * @param xPos x position of the square
     * @param yPos y position of the square
     */
    public static void drawSquare(int size, Color color, int xPos, int yPos) {
        // Implementation for drawing a square
    }

    /**
     * Draws a circle on the canvas.
     * @param radius radius of the circle
     * @param color  color of the circle
     * @param xPos   x position of the circle
     * @param yPos   y position of the circle
     */ 
    public static void drawCircle(int radius, Color color, int xPos, int yPos) {
        // Implementation for drawing a circle
    }
    /**
     * Draws rocks on the canvas.
     */
    public static void drawRocks() {
        // Implementation for drawing rocks
    }
    /**
     * Draws a square fish on the canvas.
     * @param size      size of the fish
     * @param color     color of the fish
     * @param xPos      x position of the fish
     * @param yPos      y position of the fish
     * @param faceRight boolean indicating if the fish is facing right
     */
    public static void drawSquareFish(int size, Color color, int xPos, int yPos, boolean faceRight) {
        // Calls drawSquare()
        // Calls drawTriangle()
    }
    /**
     * Draws a circle fish on the canvas.
     * @param radius    radius of the fish
     * @param color     color of the fish
     * @param xPos      x position of the fish
     * @param yPos      y position of the fish
     * @param faceRight boolean indicating if the fish is facing right
     */
    public static void drawCircleFish(int radius, Color color, int xPos, int yPos, boolean faceRight) {
        // Calls drawCircle()
        // Calls drawTriangle()
    }
    /**
     * Draws bubbles on the canvas.
     * @param radius radius of the bubbles
     * @param color  color of the bubbles
     * @param xPos   x position of the bubbles
     * @param yPos   y position of the bubbles
     */
    public static void drawBubbles(int radius, Color color, int xPos, int yPos) {
        // Calls drawCircle()
    }

}

