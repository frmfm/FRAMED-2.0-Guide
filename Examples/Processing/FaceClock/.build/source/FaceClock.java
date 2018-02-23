import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import gab.opencv.*; 
import processing.video.*; 
import java.awt.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class FaceClock extends PApplet {

// Simple example that uses openCV to apply facial tracking and rotate the cube that is drawn using the clock values.
// The example uses the following libraries:
// 1. Video Library by Processing Foundation
// 2. openCV for Processing library by Greg Borenstein
// Clock inspired by Andreas Gysin \u2192 http://ertdfgcvb.com/hms/
// Install the FREE artwork on your FRAMED here \u2192 https://frm.fm/a/filip_visnjic/faceclock





Capture video;
OpenCV opencv;

 int s;  // Values from 0 - 59
 int m;  // Values from 0 - 59
 int h;    // Values from 0 - 23
 int scale = 10;

float capx;
float capy;
float posx;
float posy;
float easing = 0.1f; // easing, increase value for faster

float xmag, ymag = 0;
float newXmag, newYmag = 0;

public void setup()  {
  
  //size(450, 800, P3D);
  
  video = new Capture(this, 640/4, 480/4);
  opencv = new OpenCV(this, 640/4, 480/4);
  opencv.loadCascade(OpenCV.CASCADE_FRONTALFACE);
  video.start();

}

public void draw()  {
  background(20);

  pushMatrix();
  translate(width/2, height/2, -30);

  newXmag = map(posx, 0, 640/4, 0, width)/PApplet.parseFloat(width) * TWO_PI;
  newYmag = map(posy, 0, 640/4, 0, height)/PApplet.parseFloat(height) * TWO_PI;

  float diff = xmag-newXmag;
  if (abs(diff) >  0.01f) {
    xmag -= diff/4.0f;
  }

  diff = ymag-newYmag;
  if (abs(diff) >  0.01f) {
    ymag -= diff/4.0f;
  }

  rotateX(-ymag);
  rotateY(-xmag);

  s = second()*scale;  // Values from 0 - 59
  m = minute()*scale;  // Values from 0 - 59
  h = hour()*scale;    // Values from 0 - 23

  strokeWeight(1);
  scale (1);
  box(s,m,h);

  popMatrix();

  camera();

  hint(DISABLE_DEPTH_TEST);

  gui();

}

public void gui() {

  hint(ENABLE_DEPTH_TEST);

  opencv.loadImage(video);
  image(video, 0, 0 );

  Rectangle[] faces = opencv.detect();
  println(faces.length);

  for (int i = 0; i < faces.length; i++) {
    println(faces[i].x + "," + faces[i].y);
    //rect(faces[i].x, faces[i].y, faces[i].width, faces[i].height);

    capx = faces[i].x + faces[i].width/2;
    capy = faces[i].y + faces[i].height/2;
  }

  float targetX = capx;
  float dx = targetX - posx;
  posx += dx * easing;

  float targetY = capy;
  float dy = targetY - posy;
  posy += dy * easing;

  fill(255);
  //noStroke();
  ellipse(posx, posy, 10, 10);

}

public void captureEvent(Capture c) {
  c.read();
}
  public void settings() {  size(1080, 1920,P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#000000", "--hide-stop", "FaceClock" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
