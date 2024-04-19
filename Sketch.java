import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

  // Initiate the images 
  PImage imgBackground;
  PImage fltbball;

  // Set up the variables for the background image
  float fltBackgroundX = 0;
  float fltBackgroundY = 0;

  // Set up the variable for circle
  float circlex = 150;
  float circley = 100;
  float xSpeed = 5;
  float ySpeed = 4;

  // Set up the variables for the spinning basketball
  float angle = 0;
  float radius = 100;
	
  public void settings() {
	
    // Set up the size of the background
    size(400, 400);
  }

  public void setup() {

    // Set up the background image and it's size
    imgBackground = loadImage("4ccc.jpg");
    imgBackground.resize(imgBackground.width/8, imgBackground.height/6);

    // Set up the basketball image and it's size
    fltbball = loadImage("basketball.png");
    fltbball.resize(fltbball.width/8, fltbball.height/8);
  
  }

  public void draw() {

    // Print the background
    image(imgBackground,fltBackgroundX,fltBackgroundY);  

    // Set up the speed and collision of the circle
    circlex += xSpeed;
    circley += ySpeed;
  
    if (circlex < 0 || circlex > width) {
    xSpeed *= -1;

    }

    if (circley < 0  || circley > height) {
    ySpeed *= -1;

    }

    // Draw the bouncing circle
    fill(0,255,255);
    ellipse(circlex, circley, 25, 25);

    // Set up the rotating ball
    float x = width/2 + cos(angle) * radius;
    float y = height/2 + sin(angle) * radius;

    // Print the basketball
    image(fltbball,x,y);

    // Set the speed of the rotation
    angle += 0.05;

  }
  }
  
  