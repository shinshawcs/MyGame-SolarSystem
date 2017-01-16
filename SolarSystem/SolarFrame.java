package SolarSystem;

import java.awt.Graphics;
import java.awt.Image;

import SolarSystemUtil.Constant;
import SolarSystemUtil.GameUtil;
import SolarSystemUtil.MyFrame;

public class SolarFrame extends MyFrame{
	Image bg=GameUtil.getImage("Images/sky.jpg");
	Star sun=new Star("Images/sun.png",Constant.GAME_HEIGHT/2,Constant.GAME_WIDTH/2);
	Plantet mercury=new Plantet(3.14,sun,"Images/mercury.png",50,30,0.05);
	Plantet venus=new Plantet(3.14,sun,"Images/venus.png",100,50,0.07);
	Plantet earth=new Plantet(3.14,sun,"Images/earth.png",150,100,0.05);
	Plantet mars=new Plantet(3.14,sun,"Images/Mars.png",200,150,0.08);
	Plantet moon=new Plantet(3.14,earth,"Images/moon.png",20,10,0.01,true);
	Plantet jupiter=new Plantet(3.14,sun,"Images/jupiter.png",250,200,0.05);
	Plantet saturn=new Plantet(3.14,sun,"Images/saturn.png",300,250,0.05);
	Plantet uranus=new Plantet(3.14,sun,"Images/uranus.png",350,300,0.03);
	Plantet neptune=new Plantet(3.14,sun,"Images/earth.png",400,350,0.05);
	Plantet pluto=new Plantet(3.14,sun,"Images/pluto.png",450,400,0.08);
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, 1000, 1000, null);
		sun.draw(g);
		mercury.draw(g);
		venus.draw(g);
		earth.draw(g);
		mars.draw(g);
		moon.draw(g);
		jupiter.draw(g);
		saturn.draw(g);
		uranus.draw(g);
		neptune.draw(g);
		pluto.draw(g);
	}
	public static void main(String[] args){
		new SolarFrame().launchFrame();
	}
}
