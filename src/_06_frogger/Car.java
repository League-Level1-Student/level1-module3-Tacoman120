package _06_frogger;

import processing.core.PApplet;

public class Car {
	int carY;
	int carX;
	int carSize;
	int carSpeed;
	int timesSpeedIncreased = 1;

	Car(int carY, int carX, int carSize, int carSpeed){
		this.carY = carY;
		this.carX = carX;
		this.carSize = carSize;
		this.carSpeed = carSpeed;
	}
	
	void display(PApplet p)
	  {
	    p.fill(0,255,0);
	    p.rect(carX , carY,  carSize, 50);
	  }
	
	void moveLeft() {
		
			carX -= carSpeed;
			if(carX <= 0) {
				carX = 750;
			
		}
	}
	void moveRight() {
		
			carX += carSpeed;
			if(carX >= 800) {
				carX = 50;
			
		}
	}
	void increaseSpeed() {
		carSpeed+=timesSpeedIncreased;
		timesSpeedIncreased++;
	}
	int getX() {
		return carX;
	}
	int getY() {
		return carY;
	}
	int getSize() {
		return carSize;
	}
	
}
