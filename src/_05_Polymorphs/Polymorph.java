package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
   protected int x;
    protected int y;
    protected int width;
    protected int height;
    public Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 width=50;
   	 height=50;
    }
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
