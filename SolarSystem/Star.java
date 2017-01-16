package SolarSystem;

import java.awt.Graphics;
import java.awt.Image;

import SolarSystemUtil.GameUtil;

public class Star {
	Image img;
	double x,y;
	protected int width;
	protected int height;
	public void draw(Graphics g){
		g.drawImage(img,(int)x,(int)y,null);
	}
	public Star(){
		
	}
	public Star(Image img){
		this.img=img;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	public Star(Image img, double x, double y){
		this(img);
		this.x=x;
		this.y=y;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	
	public Star(String imgPath, double x, double y){
		this(GameUtil.getImage(imgPath),x,y);
		this.x=x;
		this.y=y;
	}
}
