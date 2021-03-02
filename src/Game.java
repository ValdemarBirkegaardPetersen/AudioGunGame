public class Game {
    public static final int SCALE = 3; // How much to upscale pixel graphics.

    public static void update(){
        // Update game objects!
    }

    public static void display(){
        // Example of drawing using Processing:
        Sketch.processing.background(0);
        Sketch.processing.stroke(255);
        Sketch.processing.line(0, 0, 256, 256);
    }
}
