import java.util.ArrayList;

import zen.core.Zen;


public class Frogger {


	public static void main(String[] args) {

		int count = 0;
		Frog f = new Frog();
		Zen.create(800,500);
		ArrayList<Truck> list = new ArrayList<Truck>();
		f.setup();
		while(count<50){
			Truck t = new Truck();
			t.setup();
			list.add(t);
			count += 1;
		}
		while(true){

			drawBackground();
			f.draw();
			f.move();
			for(Truck t : list){
				t.draw();
				t.move();
			}
			Zen.buffer(30);

		}
	}


	private static void drawBackground() {
		Zen.setBackground("gray");
		Zen.setColor("green");
		Zen.fillRect(0, 0, 800, 25);
		Zen.fillRect(0, 475, 800, 25);
		Zen.setColor("turquoise");
		Zen.fillRect(0, 25, 800, 150);
		Zen.setColor("yellow");

		int x = 10;
		int y = 225;
		while (y<450){
			while(x<790){
				Zen.fillRect(x, y, 10, 3);
				x += 20;

			}
			y += 50;
			x = 10;
		}
	}
}



