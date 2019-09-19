import javax.swing.JFrame;

public class MainGame {
	
	public static void main(String[] args) {
		PlayGame game = new PlayGame();
		JFrame obj = new JFrame();
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker");
		obj.setVisible(true);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(game);
    }

}
