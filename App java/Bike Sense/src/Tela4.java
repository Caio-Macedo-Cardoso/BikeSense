import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Tela4{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela4 window = new Tela4();
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
	public Tela4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 460, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 0));
		panel.setBounds(0, 0, 444, 31);
		frame.getContentPane().add(panel);
		
		JLabel lblBikeSense = new JLabel("INICIANTE");
		lblBikeSense.setForeground(Color.LIGHT_GRAY);
		lblBikeSense.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblBikeSense);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 31, 444, 31);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.setBounds(0, 0, 71, 31);
		btnNewButton.setBackground(SystemColor.text);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela3 t = new Tela3();
				t.mostraTela3();
				frame.dispose();
			}
		});
		
		JButton btnNewButton_1 = new JButton("Iniciante");
		btnNewButton_1.setBackground(SystemColor.text);
		btnNewButton_1.setBounds(69, 0, 88, 31);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela4 t = new Tela4();
				t.mostraTela4();
				frame.dispose();
			}
		});		
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Intermediário");
		btnNewButton_2.setBackground(SystemColor.text);
		btnNewButton_2.setBounds(155, 0, 111, 31);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Tela5 t = new Tela5();
			t.mostraTela5();
			frame.dispose();
			}
		});
		
		JButton btnNewButton_3 = new JButton("Avançado");
		btnNewButton_3.setBackground(SystemColor.text);
		btnNewButton_3.setBounds(258, 0, 103, 31);
		panel_1.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela6 t = new Tela6();
				t.mostraTela6();
				frame.dispose();
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(SystemColor.text);
		btnSair.setBounds(354, 0, 90, 31);
		
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Login t = new Login();
			t.mostraTela();
			frame.dispose();
			}
		});
		panel_1.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("Imagem 1");
		lblNewLabel.setBounds(10, 79, 130, 80);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblImagem_1 = new JLabel("Imagem 2");
		lblImagem_1.setBounds(304, 79, 130, 80);
		frame.getContentPane().add(lblImagem_1);
		
		JLabel lblImagem = new JLabel("Imagem 3");
		lblImagem.setBounds(10, 170, 130, 80);
		frame.getContentPane().add(lblImagem);
		
		JLabel lblImagem_2 = new JLabel("Imagem 4");
		lblImagem_2.setBounds(304, 170, 130, 80);
		frame.getContentPane().add(lblImagem_2);
	}
	
	public void mostraTela4() {
		frame.setVisible(true);
	}
}
