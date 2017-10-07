import java.awt.*;
import javax.swing.*;

public class lightningStrike extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		g.setColor(Color.WHITE);
		
		//iterate through each row and col in the panel
		
		//iterates through the y axis
		for (int i = 0; i < 480; i++) {
			//iterate through the x axis
			for (int j = 0; j < 640; j++) {
				if(j == 180) {
					g.drawLine(j, i, j, i);
				}
			}
		}
	}
	
}