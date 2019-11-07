import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;

public class Tela3 {

	private JFrame frmMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela3 window = new Tela3();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmMenu.setBounds(100, 100, 460, 300);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 0));
		panel.setBounds(0, 0, 444, 31);
		frmMenu.getContentPane().add(panel);
		
		JLabel lblBikeSense = new JLabel("BIKE SENSE");
		lblBikeSense.setForeground(Color.LIGHT_GRAY);
		lblBikeSense.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblBikeSense);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 31, 444, 31);
		frmMenu.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Menu");
		btnNewButton.setBounds(0, 0, 71, 31);
		btnNewButton.setBackground(SystemColor.text);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Iniciante");
		btnNewButton_1.setBackground(SystemColor.text);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela4 t = new Tela4();
				t.mostraTela4();
				frmMenu.dispose();
			}
		});
		btnNewButton_1.setBounds(69, 0, 88, 31);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Intermediário");
		btnNewButton_2.setBackground(SystemColor.text);
		btnNewButton_2.setBounds(155, 0, 111, 31);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela5 t = new Tela5();
				t.mostraTela5();
				frmMenu.dispose();
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
				frmMenu.dispose();
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBackground(SystemColor.text);
		btnSair.setBounds(354, 0, 90, 31);
		
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Login t = new Login();
			t.mostraTela();
			frmMenu.dispose();
			}
		});
		panel_1.add(btnSair);
		
		JLabel imagem1 = new JLabel("Imagem 1");
		imagem1.setBounds(10, 79, 130, 80);
		frmMenu.getContentPane().add(imagem1);
		imagem1.getRootPane().add(new JLabel(new ImageIcon("C:/Imagens/foto-02.jpeg")));
		
		JLabel imagem2 = new JLabel("Imagem 2");
		imagem2.setBounds(304, 79, 130, 80);
		frmMenu.getContentPane().add(imagem2);
		
		JLabel imagem3 = new JLabel("Imagem 3");
		imagem3.setBounds(10, 170, 130, 80);
		frmMenu.getContentPane().add(imagem3);
		
		JLabel imagem4 = new JLabel("Imagem 4");
		imagem4.setBounds(304, 170, 130, 80);
		frmMenu.getContentPane().add(imagem4);
	}
	
	public void mostraTela3() {
		frmMenu.setVisible(true);
		frmMenu.setLocation(600, 100);
	}
}
