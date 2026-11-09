
import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {

    public static void main(String[] args) {

        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");

        PainterAPI p = canvas.getPainter();
        p.setSpeed(3);
        canvas.setBackgroundColor(Color.BLUE);
        drawSquareFish(p, 100, Color.ORANGE, 300, 200, true);
        drawCircleFish(p, 50, Color.YELLOW, -300, -180, true);
        drawSquareFish(p, 50, Color.RED, -300, 200, false);
        drawCircleFish(p, 70, Color.GREEN, 300, -200, false);
        drawRocks(p);
    }

    public static void drawTriangle(PainterAPI p, int size, Color color, int xPos, int yPos, boolean faceRight) {

        p.liftPen();
        p.moveTo(xPos, yPos);
        p.lowerPen();
        p.startFill(color);

        if(faceRight) {
            p.turnRight(30);
        } else {
            p.turnLeft(30);
        }

        for (int i = 0; i < 3; i++) {
            p.forward(size);
            p.turnRight(120);
        }

        p.finishFill();
    }

    public static void drawSquare(PainterAPI p, int size, Color color, int xPos, int yPos, boolean faceUp) {

        p.liftPen();
        p.moveTo(xPos, yPos);
        p.lowerPen();
        p.startFill(color);

        if(faceUp) {
            p.turnRight(45);
        } else {
            p.turnLeft(45);
        }

        for (int i = 0; i < 4; i++) {
            p.forward(size);
            p.turnRight(90);
        }

        p.finishFill();
    }

    public static void drawCircle(PainterAPI p, int radius, Color color, int xPos, int yPos) {

        p.liftPen();
        p.moveTo(xPos, yPos);
        p.lowerPen();
        p.startFill(color);
        p.circle(radius);
        p.finishFill();
    }

    public static void drawRocks(PainterAPI p) {
        // Implementation for drawing rocks
        drawCircle(p, 20, Color.GRAY, -350, -260);
        drawCircle(p, 30, Color.GRAY, 340, -260);
         drawCircle(p, 50, Color.GRAY, -50, -250);

    }

    public static void drawSquareFish(PainterAPI p, int size, Color color, int xPos, int yPos, boolean faceRight) {

        if(faceRight) {
            drawSquare(p, size, color, xPos-70, yPos, true);
        } else {
            drawSquare(p, size, color, xPos+70, yPos, true);
        }

        if(faceRight) {
            drawTriangle(p, size, color, xPos+70, yPos, true);
        } else {
            drawTriangle(p, size, color, xPos-5, yPos+10, false);
        }

        if(faceRight) {
            drawCircle(p, 10, Color.BLACK, xPos-100, yPos-60);
        } else {
            drawCircle(p, 5, Color.BLACK, xPos+45, yPos-20);
        }

        if(faceRight) {
            drawBubbles(p, 8, Color.CYAN, xPos-135, yPos-5, false);
        } else {
            drawBubbles(p, 5, Color.CYAN, xPos+45, yPos+60, true);
        }
    }

    public static void drawCircleFish(PainterAPI p, int radius, Color color, int xPos, int yPos, boolean faceRight) {

      if(faceRight) {
            drawCircle(p, radius, color, xPos+15, yPos-30);
        } else {
            drawCircle(p, radius, color, xPos-150, yPos+40);
        }
        //drawCircle(p, radius, color, xPos+15, yPos-30);

        if(faceRight) {
            drawTriangle(p, radius, color, xPos-20, yPos, false);
        } else {
            drawTriangle(p, radius, color, xPos+40, yPos+100, true);
        }

        if(faceRight) {
            drawCircle(p, 10, Color.BLACK, xPos+80, yPos-25);
        } else {
            drawCircle(p, 10, Color.BLACK, xPos-135, yPos+80);
        }

        if(faceRight) {
            drawBubbles(p, 8, Color.CYAN, xPos+radius+100, yPos+35, false);
        } else {
            drawBubbles(p, 10, Color.CYAN, xPos-135, yPos+200, false);
        }
    }

    public static void drawBubbles(PainterAPI p, int radius, Color color, int xPos, int yPos, boolean faceRight) {

        for(int i = 0; i < 3; i++) {
            if(faceRight) {
                drawCircle(p, radius, color, xPos+(i*15), yPos-(i*25));
            } else {
                drawCircle(p, radius, color, xPos-(i*15), yPos-(i*25));
            }
        }
    }
}
