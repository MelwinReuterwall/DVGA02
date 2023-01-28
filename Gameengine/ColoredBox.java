import java.awt.Color;
import java.awt.Graphics2D;

public class ColoredBox extends Sprite {
	
	private Color color;
	
	public ColoredBox(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;     //https://www.w3schools.com/java/ref_keyword_this.asp 
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Keyboard keyboard) {
		setY(getY()+1);
		
	
	}
	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(color);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}
	
	

}
