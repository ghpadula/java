package src;
import java.awt.*;
import javax.swing.*;

public class MainWindow 
{
	private JFrame login;
	
	public MainWindow() {
		initialize();
		
	}
	
	
	
	
	public void initialize() {
		login = new JFrame();
		login.setTitle("Login");
		login.setLayout(new BorderLayout(10, 5));
		login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		login.setSize(800, 500);
		login.setLocationRelativeTo(null);
		login.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10 , 5));
		panel.setBackground(Color.white);
		
		Button button = new Button("Login");
		panel.add(button);
		Button button2 = new Button("Register");
		panel.add(button2);
		
		//panel.setPreferredSize(new Dimension(0, 30));
		
		login.add(panel, BorderLayout.SOUTH);
		
		
		
		
		
		
		
		login.setVisible(true);
	}
}


