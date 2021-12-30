package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{

	public MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int randX=rand.nextInt(PolymorphWindow.WIDTH);
		int randY=rand.nextInt(PolymorphWindow.HEIGHT);
		x=randX;
		y=randY;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.orange);
		g.fillRect(x, y, width, height);
	}

}
