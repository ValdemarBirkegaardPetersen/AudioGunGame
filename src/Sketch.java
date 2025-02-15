import processing.core.PApplet;

public class Sketch extends PApplet {
    // Sketch Variables:
    public static PApplet processing; // The link to the Processing library for other objects to use through the Sketch.

    // Global Constants:
    public static final int WINDOW_WIDTH = 768;
    public static final int WINDOW_HEIGHT = 720;

    // Entry-point:
    public static void main(String[] args) {
        PApplet.main("Sketch", args);
    }

    // Processing State Functions:

    public void settings() {
        // Initial app settings:
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    public void setup() {
        // Game setup:
        processing = this;
        background(0);
    }

    public void draw() {
        // Game loop:
        Game.update(); // Update game code.
        Game.display(); // Draw game graphics.
    }

    // Custom Global Functions:

    public static boolean collision() {
        // TODO code AABB collision between two objects!
        return false;
    }
}
