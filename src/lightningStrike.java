import java.awt.*;
import javax.swing.*;

public class lightningStrike extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		int m;
		int startLocation = 180;
		
		g.setColor(Color.WHITE);
		
		//iterate through each row and col in the panel
		
		//iterates through the y axis
		for (int i = 0; i < 480; i++) {
			//iterate through the x axis
			for (int j = 0; j < 640; j++) {
				//sets a random int 0 or 1 and based on that either stays in the same course of offsets by 1
				m = ((int)(Math.random()*2));
				if(j == startLocation) {
					if(m == 1) {
						startLocation += 1;
					}
					else {
						startLocation -= 1;
					}
					g.drawLine(startLocation, i, startLocation, i);
				}
			}
		}
	}
}