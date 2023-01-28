import java.awt.Color;
import java.awt.Graphics2D;

public class Player extends Sprite{

	private Color color;
	public Player(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;
	}

	@Override
	public void update(Keyboard keyboard) {
		if(keyboard.isKeyDown(Key.Down)){
			setY(getY()+5);
		}
		if(keyboard.isKeyDown(Key.Up) && (getY()!= 250)){
			setY(getY()-5);
		}
		if(keyboard.isKeyDown(Key.Left)){
			setX(getX()-5);
		}
		if(keyboard.isKeyDown(Key.Right)){
			setX(getX()+5);
		}
	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(color);
		graphics.fillOval(getX(), getY(), getWidth(), getHeight());		
	}

	
	
	
	
	
}
