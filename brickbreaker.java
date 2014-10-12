	package BrickBreaker;
	
	import java.util.ArrayList;
	
	import zen.core.Zen;
	
	public class BrickBreaker {
	
		public static void main(String[] args) {
			Zen.create(500, 800);
			Ball b = new Ball();
			int brickCount = 0;
			int pausex = 0;
			int pausey = 0;
			boolean ppressed = false;
			boolean unpaused = true;
			Paddle p = new Paddle();
			int brx = 20;
			int bry = 200;
			ArrayList<Brick> bricks = new ArrayList<Brick>();
			while(brickCount<95){
				Brick br = new Brick(brx,bry);
				brx += 25;
				if(brx>470){
					brx = 20;
					bry += 50;
				}
				bricks.add(br);
				brickCount+=1;
			}
	
		while(true){
			if(Zen.isKeyPressed("p") && unpaused && !ppressed ){
				pausex = b.dx;
				pausey = b.dy;
				ppressed = true;
				b.dx = 0;
				b.dy = 0;
				unpaused = false;
			}
			if(Zen.isKeyPressed("p") && !unpaused && !ppressed ){
				unpaused = true;
				ppressed = true;
				b.dx = pausex;
				b.dy = pausey;
			}
			if(!(Zen.isKeyPressed("p"))){
				ppressed = false;
			}
			if(unpaused){

				Zen.setBackground("white");
				p.draw();
				
				p.move();
				b.move();
				
				b.draw();
				for (Brick br : bricks){
					br.draw();
				}
				if(b.x>p.x && b.x<p.x+100 && b.y > 670 && b.y<680){
					b.dy *= -1;
					b.y = 669;
				}
				if(b.y>=780){
					while(true){
						Zen.setBackground("white");
						Zen.setColor("red");
						Zen.setFont("Comic Sans MS",50);
						Zen.drawText("Game Over", 120,300);
						Zen.buffer(30);
					}
	
	
				}
				for (int i = 0; i<bricks.size(); i++){
					if(Math.abs(bricks.get(i).x-b.x)<20 && Math.abs(bricks.get(i).y-b.y)<10){
						bricks.remove(i);
						b.dy*=Zen.getRandomNumber(110, 120)/-100;
					}
				}
				Zen.buffer(30);	}		
				}
		
		}
	
	}
