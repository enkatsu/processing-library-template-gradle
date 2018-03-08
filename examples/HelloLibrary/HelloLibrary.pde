import processing.library.template.*;

Sample sample;

void setup() {
  size(600, 600);
  sample = new Sample(this);
}
void draw() {
  sample.drawCircle(100, 100, 50);
}
