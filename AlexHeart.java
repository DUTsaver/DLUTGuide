import javax.swing.*;
import java.awt.*;

class MyGUI extends JFrame{
	public MyGUI(){
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((int)screen.getWidth()/4,(int)screen.getHeight()/4,(int)screen.getHeight()/2,(int)screen.getHeight()/2);
        setTitle("AlexHeart");
		Cruvas c=new Cruvas();
		add(c);
		
	}
}

class Cruvas extends JPanel{
	public void paintComponent(Graphics g){
		g.setColor(Color.RED);
		g.translate(getWidth()/2, getHeight()/2);
		for(double i=0;i<=6;i+=0.01){
			double x=-3+i;
			double y1=Math.sqrt(9-x*x)+Math.pow(x*x,1./3);
			double y2=Math.pow(x*x,1./3)-Math.sqrt(9-x*x);
			System.out.println(x+" "+y1+" "+y2);
			g.drawLine((int)(x*50),-(int)(y1*50),(int)(x*50),-(int)(y2*50));
		}
	}
}

public class AlexHeart{
	public static void main(String[] args){
		MyGUI gui=new MyGUI();
		System.out.println(gui);
	}
}