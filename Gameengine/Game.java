import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
import javax.swing.*;


public class Game {
	
	private ArrayList<ColoredBox> YellowBox;
	private ColoredBox RedBox;
	private ColoredBox GreenBox;
	private ColoredBox BlueBox;
	private Player player;
	
	public Game(GameBoard board) {
		YellowBox = new ArrayList<ColoredBox>();
		for(int i = 0; i <20; i++) {
			YellowBox.add(new ColoredBox(i*40 + 20,140, 20, 20, Color.yellow));	    //https://www.w3schools.com/java/java_arraylist.asp  fräscha upp teorin med arraylist och add för gula brickorna
		}
		RedBox = new ColoredBox(20, 20, 20, 20, Color.red);
		GreenBox = new ColoredBox(60, 60, 20, 20, Color.green);
		BlueBox = new ColoredBox(100, 100, 20, 20, Color.blue);
		
		player = new Player(390, 550, 20, 20, Color.white);
	}

	public void update(Keyboard keyboard) {
		RedBox.update(keyboard);
		GreenBox.update(keyboard);
		BlueBox.update(keyboard);
		for(ColoredBox yellowboxes: YellowBox) {
			yellowboxes.update(keyboard);
		}
		player.update(keyboard);
		
		

		for(ColoredBox yellowboxes: YellowBox) {
		    yellowboxes.update(keyboard);
		    if (yellowboxes.getY() + yellowboxes.getHeight() >= 630) {
		        ExitGame();
		    }
		}
		
		
	}

	public void draw(Graphics2D graphics) {
		RedBox.draw(graphics);
		BlueBox.draw(graphics);
		GreenBox.draw(graphics);
		for(ColoredBox yellowboxes: YellowBox) {
			yellowboxes.draw(graphics);
		
		}
		player.draw(graphics);
	}
	


public void ExitGame() {
    System.exit(0);
}

}
