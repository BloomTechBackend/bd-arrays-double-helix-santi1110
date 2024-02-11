package processing.sketches;

import org.checkerframework.checker.units.qual.C;
import processing.core.PApplet;

import java.util.Arrays;
import java.util.Collections;

public class Main extends PApplet {
    public static PApplet sketch;
    private Circle[] circles;

    int num = 5;

    final int TAN   = color(255, 230, 200);
    final int RED = color(255, 100, 80);

    public void settings() {
        sketch = this;
        size(600, 600);
    }

    public void setup() {
        circles = new Circle[num * 2];
        //Index based
        for(int i = 0; i < num; i++){
            int x = width /2 + 60 * (i - num /2);
            float angle = PI/6 * i;
            circles[i] = new Circle(RED,40,x,height/2, angle);
            circles[i + num] = new Circle(TAN,40,x, height/2,angle + PI);

        }


    }

    public void draw() {
        background(20);

        Arrays.sort(circles);
        for (Circle currentCircle: circles){
            currentCircle.drawSelf();
            currentCircle.move();
        }

    }

    public static void main(String... args) {
        PApplet.main("processing.sketches.Main");
    }
}
