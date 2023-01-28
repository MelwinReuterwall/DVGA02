import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class SquareCollection {
	
	private ArrayList<ColoredBox> Pinkbox;
	
	
	public SquareCollection(GameBoard board) {
		Pinkbox = new ArrayList<ColoredBox>();
		for(int i = 0; i <20; i++) {
			Pinkbox.add(new ColoredBox(i*5 + 20,140, 20, 20, Color.pink));
		}
	}
		public void update(Keyboard keyboard) {
		
			for(ColoredBox pinkboxes: Pinkbox) {
				pinkboxes.update(keyboard);
			}
		}
			public void draw(Graphics2D graphics) {
				
				for(ColoredBox pinkboxes: Pinkbox) {
					pinkboxes.draw(graphics);
				
				}
			}

}
