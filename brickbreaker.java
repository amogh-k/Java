package BrickBreaker;

import java.util.ArrayList;

import zen.core.Zen;

public class BrickBreaker {

	public static void main(String[] args) {
		Zen.create(500, 800);
		Ball b = new Ball();
		int brickCount = 0;
		Paddle p = new Paddle();
		ArrayList<Brick> bricks = new ArrayList<Brick>();
		while(brickCount<100){
			Brick br = new Brick(200,200);
			bricks.add(br);
			brickCount+=1;
		}
		while(true){
			Zen.setBackground("white");
			p.draw();
			p.move();
			b.draw();
			b.move();
			for (Brick br : bricks){
				br.draw();
			}
			if(b.x>p.x && b.x<p.x+100 && b.y > 680){
				b.dy *= -1;
				b.y = 679;
						}
			Zen.buffer(30);			
		}

	}

}
