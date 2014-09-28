import zen.core.Zen;


public class Truck {
	int x;
	int speed = Zen.getRandomNumber(3,8);
	int lane = Zen.getRandomNumber(-2,4);
	public void setup(){
		x = -100;
	}
	public void draw(){
		Zen.setColor("orange");
		int y = 230 + 50*lane;
		Zen.fillRect(x, y, 80, 40);
	}
	public void move(){
		x += speed;
		if (x> 890){
			x = -90;
			speed = Zen.getRandomNumber(3,8);
		}
	}
}
