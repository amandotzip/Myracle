
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Color;

public class Frame1 {

	private JFrame frmTitle;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		mainRepeat();
	}

	public static void mainRepeat() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmTitle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frmTitle = new JFrame();
			frmTitle.setTitle("Title");
			frmTitle.setBounds(100, 100, 450, 450);
			frmTitle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmTitle.getContentPane().setLayout(null);
			
			JButton btnNewButton = new JButton("Begin");
			btnNewButton.setForeground(new Color(253, 112, 73));
			btnNewButton.setBackground(UIManager.getColor("Button.light"));
			btnNewButton.setBounds(146, 316, 176, 45);
			btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 40));
			btnNewButton.setBorderPainted(false);
			btnNewButton.setContentAreaFilled(false);
			btnNewButton.setOpaque(false);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Frame2 nw = new Frame2();
					nw.NewScreen();
frmTitle.dispose();
}
			});
			frmTitle.getContentPane().add(btnNewButton);
			
			lblNewLabel = new JLabel("");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setIcon(new ImageIcon("/Users/Ishrat/Desktop/With Logo.jpg"));
			lblNewLabel.setBounds(0, 0, 450, 450);
			frmTitle.getContentPane().add(lblNewLabel);
		}
}