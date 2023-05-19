import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Dashboard {
	
	private JFrame frame;
	private JPanel panel;
	private static final int FRAME_WIDTH = 650;
	private static final int FRAME_HEIGHT = 300;
	
	private JButton appleButton;
	private JButton spotifyButton;
	
	public Dashboard() {
		  frame = new JFrame();
	      createSpotifyButton();
	      createAppleButton();
	      createPanel();
	      createFrame();
	}
	
	private void createAppleButton()
	{
	    spotifyButton = new JButton("Convert to Apple");
	    spotifyButton.setBounds(115, 120, 200, 25);
	    spotifyButton.setFont(new Font("Arial", Font.PLAIN, 20));
	    spotifyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                SpotifyStart SS = new SpotifyStart();
            }
        });
	}
	
	private void createSpotifyButton()
	{
		appleButton = new JButton("Convert to Spotify");
		appleButton.setBounds(325, 120, 200, 25);
	    appleButton.setFont(new Font("Arial", Font.PLAIN, 20));
	    appleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AppleStart AS = new AppleStart();
            }
        });
	}

	private void createPanel()
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.add(spotifyButton);
		panel.add(appleButton);
		panel.setBackground(new Color (32, 42, 68)); 
		frame.add(panel);
	}
	
	private void createFrame() {
		  frame.setTitle("Dashboard");
		  
		  frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setVisible(true);
	}
}
