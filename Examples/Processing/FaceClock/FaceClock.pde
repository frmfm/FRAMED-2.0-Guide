// Simple example that uses openCV to apply facial tracking and rotate the cube that is drawn using the clock values.
// The example uses the following libraries:
// 1. Video Library by Processing Foundation
// 2. openCV for Processing library by Greg Borenstein
// Clock inspired by Andreas Gysin → http://ertdfgcvb.com/hms/
// Install the FREE artwork on your FRAMED here → https://frm.fm/a/filip_visnjic/faceclock

import gab.opencv.*;
import processing.video.*;
import java.awt.*;

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
float easing = 0.1; // easing, increase value for faster
 
float xmag, ymag = 0;
float newXmag, newYmag = 0; 
 
void setup()  { 
  size(1080, 1920,P3D);
  //size(450, 800, P3D);
  
  video = new Capture(this, 640/4, 480/4);
  opencv = new OpenCV(this, 640/4, 480/4);
  opencv.loadCascade(OpenCV.CASCADE_FRONTALFACE);  
  video.start();
  
} 
 
void draw()  { 
  background(20);
  
  pushMatrix(); 
  translate(width/2, height/2, -30); 
  
  newXmag = map(posx, 0, 640/4, 0, width)/float(width) * TWO_PI;
  newYmag = map(posy, 0, 640/4, 0, height)/float(height) * TWO_PI;
  
  float diff = xmag-newXmag;
  if (abs(diff) >  0.01) { 
    xmag -= diff/4.0; 
  }
  
  diff = ymag-newYmag;
  if (abs(diff) >  0.01) { 
    ymag -= diff/4.0; 
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

void gui() {
  
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

void captureEvent(Capture c) {
  c.read();
}