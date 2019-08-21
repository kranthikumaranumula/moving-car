import java.awt.*;
import javax.swing.*;

public class MoveImage extends JFrame implements Runnable
{
int framewidth=700,frameheight=500;
Image  truck1      =new ImageIcon("truck1.jpg       ").getImage();
Image   truck2     =new ImageIcon(" truck2.jpg        ").getImage();
Thread thread;
 int truck1X =100;
		MoveImage()
		{
		setBounds(100,100,framewidth,frameheight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		thread=new Thread(this);
		thread.start();
		}
		public void paint(Graphics g)
		{
		g.setColor(Color.black);
		g.fillRect(0,0,framewidth,frameheight);
		g.drawImage(truck2,150,150,null);
		g.drawImage(truck1,truck1X,250,null);
		}
		public void run()
		{
		while(true)
		{
		   truck1X++;
			repaint();
			try
			{
			thread.sleep(5);
			}
			
	
		catch(InterruptedException e)
			{
			System.out.println(e);
			}
			}
		
		}
		public static void main(String args[]){
	
	new MoveImage();
		}
}