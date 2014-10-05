package BrickBreaker;

import zen.core.Zen;

public class Ball {
	public int x;
	public int y;
	public int dx;
	public int dy;
	public Ball(){
		x = 250;
		y = 600;
		dx = Zen.getRandomNumber(-5, 5);
		dy = Zen.getRandomNumber(-8, -5);
	}
	public void draw() {
		Zen.setColor("yellow");
		Zen.fillOval(x, y, 20, 20);
	}
	public void move() {
		y += dy;
		x += dx;
		if (x < 10 || x>490){
			dx *= -1;
		}
		if (y < 10){
			dy*= -1;
		}

	}

}
