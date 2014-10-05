package BrickBreaker;

import zen.core.Zen;

public class Paddle {
	public int x;
	public int y;
	public Paddle(){
		x = 200;
		y = 690;
	}
	public void draw(){
		Zen.setColor("brown");
		Zen.fillRect(x, y, 100, 10);
	}
	public void move(){
		if (Zen.isKeyPressed("left")){
			x -= 10;
		}
		if (x<0){
			x = 0;
		}
		if (x>400){
			x = 400;
		}
		if (Zen.isKeyPressed("right")){
			x += 10;
		}
	}
}
