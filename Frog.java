import zen.core.Zen;


public class Frog {
	int x;
	int y;
	int lane = 0;
	boolean upKeyPressed = false;
	public boolean isKilling(Frog target){
		if(Math.abs(target.x - (x + 80))  < 30 && Math.abs(target.y - y)<30){
			return true;
		}
		else{
			return false;	
		}

	}
	public void setup(){
		x = 400;

		
	}
	public void draw() {
		if (lane == 0){
			y = 490;
		}
		else {
			y = 230 + 50*lane;
		}
		Zen.setColor("red");
		Zen.fillOval(x-15, y-15, 20, 20);
	}
	public void move(){
		if (Zen.isKeyPressed("up") && upKeyPressed == false){
			lane -= 1; 
			upKeyPressed = true;
		}
		if (Zen.isKeyPressed("right")){
			lane += 1; 
		}
		if (Zen.isKeyPressed("left")){
			lane += 1; 
		}
		if (Zen.isKeyPressed("down")){
			lane += 1; 
		}
		if (Zen.isKeyPressed("up") == false){
			upKeyPressed = false;
		}
	}
}
