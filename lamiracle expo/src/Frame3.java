

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.embed.swing.JFXPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import java.awt.ScrollPane;
import java.awt.Label;
import java.awt.List;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class Frame3 {
	private JScrollPane jsp;
	private JTextArea textArea;
	private JScrollBar jsb;
	private JFXPanel jfxp;
	private TextArea ta;
	private VBox vbox;
	private JFrame frame;
	private JLabel lblNewLabel;
	private LyricsDataElement metadata = new LyricsDataElement();
	private WebsiteParseUtility wp = new WebsiteParseUtility();
	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 window = new Frame3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(150, 0, 1600, 1000);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		vbox = new VBox();
//		jfxp = new JFXPanel();		
//		frame.add(jfxp);
//		ta = new TextArea();
//		ta.setPrefSize(1000, 1000);
//		ta.setEditable(false);
//		ta.setText(wp.findLyrics());
		
		
		JButton btnFinished = new JButton("Finished");
		btnFinished.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(650, 5, 1000, 600);
		textArea.setEditable(false);
		textArea.setText(wp.findLyrics());
		textArea.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		jsp = new JScrollPane(textArea);
		jsp.setBounds(650, 5, 800, 900);
		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		frame.getContentPane().add(jsp);
		btnFinished.setBounds(6, 950, 100, 75);
		frame.getContentPane().add(btnFinished);
		
/*		JPanel container = new JPanel();
	container.add(textArea);
		container.add(jsb);
		jsp = new JScrollPane(container);
		container.add(jsb);
		frame.getContentPane().add(jsb);
	*/	
		JButton btnTryAnotherSong = new JButton("Try Another Song");
		btnTryAnotherSong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame2 nw = new Frame2();
				nw.NewScreen();
			}
		});
		btnTryAnotherSong.setBounds(200, 900, 150, 30);
		
		frame.getContentPane().add(btnTryAnotherSong);
		JLabel songTitle = new JLabel("Track: " + metadata.getTrack());
		songTitle.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		songTitle.setBounds(50, 50, 500, 75);
		JLabel songArtist = new JLabel("Artist: " + metadata.getArtist());
		songArtist.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		songArtist.setBounds(50, 125, 500, 75);
		JLabel songAlbum = new JLabel("Album: " + metadata.getAlbum());
		songAlbum.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		songAlbum.setBounds(50, 200, 500, 75);
		frame.getContentPane().add(songTitle);
		frame.getContentPane().add(songArtist);
		frame.getContentPane().add(songAlbum);
		
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		//lblNewLabel.setIcon(new ImageIcon("/Users/amanu/Desktop/Without Logo.jpg"));
		lblNewLabel.setBounds(0, 0, 450, 450);
		frame.getContentPane().add(lblNewLabel);
		
	}
}