package processing.sketches;

import processing.core.PApplet;

public class Circle implements Comparable<Circle> {
    private static PApplet p = Main.sketch;
    private static final float AMPLITUDE = 100.0f;
    private static final float DIAMETER_AMPLITUDE = 20.0f;
    private static final float AVERAGE_DIAMETER = 30.0f;
    private int color;
    private float diameter  ;
    private float xCord;
    private float yCord;
    private float angle;

    public Circle(int color, float diameter, float xCord, float yCord, float angle) {
        this.color = color;
        this.diameter = diameter;
        this.xCord = xCord;
        this.yCord = yCord;
        this.angle = angle;
    }

    public void drawSelf(){
        p.fill(color);
        p.ellipse(xCord,yCord,diameter,diameter);
    }
    public void move(){
        yCord = p.height /2 + (float) Math.sin(angle) * AMPLITUDE;
        diameter = (float) Math.cos(angle) * DIAMETER_AMPLITUDE + AVERAGE_DIAMETER;
        angle += Math.PI /60;

    }

    @Override
    public int compareTo(Circle o) {
        return 0;
    }
}
