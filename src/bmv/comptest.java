package bmv;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class comptest {

	/**
	 * PRE:
	 * POST:
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Comptest");
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(800, 800));
		frame.add(panel);
		panel.add(new PaintingNode(new ImageIcon("Resources/Images/node1-3.png"),
				new Point(100, 100), 50, 1));
		panel.add(new JButton("OKAYDOKIE"));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
