package processing.library.template;

import processing.core.*;

public class Sample {
    PApplet app;
    public Sample(PApplet app) {
        this.app = app;
    }
    public void drawCircle(float x, float y, float d) {
        app.ellipse(x, y, d, d);
    }
}
