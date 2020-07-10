import java.awt.EventQueue;
//import javafx.geometry.Orientation;
//import javafx.scene.control.ScrollBar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;

public class Frame2 {
	
	private LyricsDataElement metadata;
	//private Test urlGenerator;
	private JFrame frame;
//	private ScrollBar s1;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 window = new Frame2();
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
	public Frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Artist");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(89, 190, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
//		s1 = new ScrollBar();
//		s1.setOrientation(Orientation.VERTICAL);
		
		textField = new JTextField();
		textField.setBounds(180, 190, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblTr = new JLabel("Track");
		lblTr.setBounds(89, 270, 46, 14);
		frame.getContentPane().add(lblTr);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 230, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(180, 270, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Album");
		lblNewLabel_2.setBounds(89, 230, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblPleaseBeginPlaying = new JLabel("Type in song details!");
		lblPleaseBeginPlaying.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblPleaseBeginPlaying.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseBeginPlaying.setBounds(0, 0, 450, 192);
		frame.getContentPane().add(lblPleaseBeginPlaying);
		
		JButton btnGoBack = new JButton("Back");
		btnGoBack.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Frame1 nw = new Frame1();
				nw.mainRepeat();
				
			}
		});
		btnGoBack.setBounds(20, 340, 110, 55);
		frame.getContentPane().add(btnGoBack);
		
		
		
		JButton btnMusicIsBeing = new JButton("Ready!");
		btnMusicIsBeing.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnMusicIsBeing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String artist, album, track;
				metadata = new LyricsDataElement();
				metadata.setArtist(artist = textField.getText());
				metadata.setAlbum(album = textField_1.getText());
				metadata.setTrack(artist = textField_2.getText());
				WebsiteParseUtility util = new WebsiteParseUtility();
				
				util.setUrl(textField.getText(), textField_2.getText());
				//urlGenerator = new Test();
			//	urlGenerator.httpPostRequest(metadata.getArtist(), metadata.getTrack());
				Frame3 nw = new Frame3();
				nw.NewScreen();
				frame.dispose();
			}
		});
		
		
		
		btnMusicIsBeing.setBounds(300, 340, 110, 55);
		frame.getContentPane().add(btnMusicIsBeing);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("/Users/Ishrat/Desktop/Without Logo.jpg"));
		lblNewLabel.setBounds(0, 0, 450, 450);
		frame.getContentPane().add(lblNewLabel);
		
		
		//Test test = new Test();
		
		
	//	test.httpPostRequest("dfdf", "dfgdfg");
		
		
	}
}