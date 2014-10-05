package BrickBreaker;

import zen.core.Zen;

public class Brick {
	int x;
	int y;
	public Brick(int newX, int newY){
		x = newX;
		y = newY;
	}
	public void draw(){
		Zen.setColor("green");
		Zen.fillRect(x-10, y-5, 20, 10);
	}
}
