import java.awt.color.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Buttons extends JFrame {
	private static final long serialVersionUID = 1L;
	Ellipse2D.Double ellipse;
	
	public void createComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		ellipse = new Ellipse2D.Double(0,0,100,100);
		
	}
   
	
	
	
	public static void main(String[] args)
	{
		Buttons frame = new Buttons();
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(400, 400));
		frame.setVisible(true);
		
		
		JButton redButton =  new JButton("Red");
		JButton blueButton = new JButton("Blue");
		JButton greenButton = new JButton("Green");
		frame.add(redButton);
		frame.add(blueButton);
		frame.add(greenButton);
		//JLabel circle = new JLabel(g2.draw(ellipse));
		
		
		
	}
	
	
	

}