package SolarSystem;

import java.awt.Color;
import java.awt.Graphics;

import SolarSystemUtil.GameUtil;

public class Plantet extends Star{
	double longAxis;
	double shortAxis;
	double speed;
	Star center;
	double degree;
	boolean satellite;
	public void draw(Graphics g){
		super.draw(g);
		move();
		if(!satellite){
			drawTrace(g);
		}
	}
	public void move(){
		x=(center.x+center.width/2)+longAxis*Math.cos(degree);
		y=(center.y+center.height/2)+shortAxis*Math.sin(degree);
		degree+=speed;
	}
	public void drawTrace(Graphics g){
		double _x,_y,_width,_height;
		_width=longAxis*2;
		_height=shortAxis*2;
		_x=(center.x+center.width/2)-longAxis;
		_y=(center.y+center.height/2)-shortAxis;
		Color c=g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int)_x, (int)_y, (int)_width, (int)_height);
		g.setColor(c);
	}
		
	
	public Plantet(double degree,Star center,String imgPath, double longAxis,double shortAxis,double speed){
		super(GameUtil.getImage(imgPath));
		this.center=center;
		this.x=(center.x+center.width/2)+longAxis;
		this.y=(center.y+center.height/2)+shortAxis;
		this.longAxis=longAxis;
		this.shortAxis=shortAxis;
		this.speed=speed;
		this.degree=degree;
		
	}
	public Plantet(double degree,Star center,String imgPath, double longAxis,double shortAxis,double speed,boolean satellite){
		this(degree,center,imgPath,longAxis,shortAxis,speed);
		this.satellite=satellite;
		
	}

	public Plantet(String imgPath, double x, double y) {
		super(imgPath, x, y);
	}

}
