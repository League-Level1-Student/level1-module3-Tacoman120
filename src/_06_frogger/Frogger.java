package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 525;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(200, 147, 75);
    	fill(0, 250, 0);
    	ellipse(x, y, 20, 20);
    	if(y>= 600) {
    		y = 525;
    	}else if(y<= 0) {
    		y = 75;
    	}else if (x>=800) {
    		x=750;
    	}if(x<= 0) {
    		x = 50;
    	}


    }
    
    public void keyPressed(){
        if(key == CODED){
            if(keyCode == UP)
            {
                y-=75;
            }
            else if(keyCode == DOWN)
            {
            	y+=75;
            }
            else if(keyCode == RIGHT)
            {
            	x+=100;
            }
            else if(keyCode == LEFT)
            {
            	x-=100;
            }
        }
    }
    
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
