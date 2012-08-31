package bmv;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.AffineTransform;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

public class PaintingNode extends JComponent {
	ImageIcon image;
	double rad;
	double scale;
	Point pos;

	public PaintingNode(ImageIcon image, Point pos, double rad, double scale) {
		this.image = image;
		this.pos = pos;
		setBounds(pos.x, pos.y, (int) (rad * scale * 2),
				(int) (rad * scale * 2));
		this.rad = rad;
		this.scale = scale;
		setBorder(BorderFactory.createLineBorder(BMVPanel.BORDER_COLOR));
	}

	public void paint(Graphics g) {
		System.out.println("PAINTING");

		int scaledRad = (int) (scale * rad);
		setBounds(pos.x - scaledRad, pos.y - scaledRad,
				(int) (rad * scale * 2), (int) (rad * scale * 2));
		AffineTransform trans = new AffineTransform((double) scaledRad / 400,
				0, 0, (double) scaledRad / 400, 0, 0);
		((Graphics2D) g).drawImage(image.getImage(), trans, null);

	};
}
