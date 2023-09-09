package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 525;
    int playerSpeed = 10;
    Car one;
    Car two;
    Car three;
    int points = 0;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
     one = new Car(100, 750, 100, 1);
     two = new Car(300, 50, 100, 1);
     three = new Car(500, 750, 100, 1);
    }

    @Override
    public void draw() {
    	background(200, 147, 75);
    	one.moveLeft();
    	two.moveRight();
    	three.moveLeft();
    	one.display(this);
    	two.display(this);
    	three.display(this);
    	fill(0, 250, 0);
    	ellipse(x, y, 20, 20);
    	if(y>= 600) {
    		y = 525;
    	}else if(y<= 0) {
    		y = 525;
    		points++;
    		one.increaseSpeed();
    		two.increaseSpeed();
    		three.increaseSpeed();
    		
    	}else if (x>=800) {
    		x=750;
    	}if(x<= 0) {
    		x = 50;
    	}
    	
    	
    	if(intersects(three) == true) {
    		x = 400;
    		y = 550;
    	}
    	if(intersects(two) == true) {
    		x = 400;
    		y = 550;
    	}
    	if(intersects(one) == true) {
    		x = 400;
    		y = 550;
    	}
    	
    }
    
    public void keyPressed(){
        if(key == CODED){
            if(keyCode == UP)
            {
                y-=playerSpeed;
            }
            else if(keyCode == DOWN)
            {
            	y+=playerSpeed;
            }
            else if(keyCode == RIGHT)
            {
            	x+=playerSpeed;
            }
            else if(keyCode == LEFT)
            {
            	x-=playerSpeed;
            }
        }
    }
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    boolean intersects(Car car) {
		 if ((y > car.getY() && y < car.getY()+50) &&
		                (x > car.getX() && x < car.getX()+car.getSize())) {
		   return true;
		  }
		 else  {
		  return false;
		 }
    }

}
