import javax.swing.*;
import java.awt.*;

public class programGui{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Thunderstruck");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lightningStrike apple = new lightningStrike();
		apple.setBackground(Color.BLACK);
		frame.add(apple);
		frame.setSize(640, 480);
		frame.setVisible(true);
	}
}