import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controllers.UsuarioController;
import models.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frmBikeSense;
	private JTextField txtEmail;
	private final JPasswordField txtpasswordField = new JPasswordField();
	
	private UsuarioController controller = new UsuarioController();
	
	private ArrayList<Usuario> us = new ArrayList<>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmBikeSense.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBikeSense = new JFrame();
		frmBikeSense.setTitle("Bike Sense");
		frmBikeSense.setBounds(100, 100, 450, 300);
		frmBikeSense.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 51, 0));
		frmBikeSense.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblBikeSense = new JLabel("BIKE SENSE");
		lblBikeSense.setForeground(Color.LIGHT_GRAY);
		lblBikeSense.setBackground(Color.WHITE);
		lblBikeSense.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblBikeSense);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.control);
		frmBikeSense.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(120, 30, 72, 27);
		panel_1.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(202, 34, 193, 27);
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(120, 80, 72, 27);
		panel_1.add(lblSenha);
		
		txtpasswordField.setBounds(202, 81, 193, 27);
		panel_1.add(txtpasswordField);
		
		JButton btnEntar = new JButton("Entrar");
		btnEntar.setForeground(Color.LIGHT_GRAY);
		btnEntar.setBackground(new Color(51, 51, 0));
		btnEntar.setBounds(323, 123, 72, 43);
		btnEntar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					us = controller.getUsuario();
					
					if( !txtEmail.getText().equals(controller.getUsuario()) ) {
						throw new Exception("Email não cadastrado.");
					}
					if( !txtpasswordField.getText().equals(controller.getUsuario()) ) {
						throw new Exception("Senha Incorreta.");
					}
					
				Tela3 t = new Tela3();  
				t.mostraTela3();
				frmBikeSense.dispose();
					
				}catch(Exception exception){
					JOptionPane.showMessageDialog(null, exception.getMessage());
					
				}
				
				
			}
				
		});
			
				
				
		
			

		panel_1.add(btnEntar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(Color.LIGHT_GRAY);
		btnCadastrar.setBackground(new Color(51, 51, 0));
		btnCadastrar.setBounds(161, 167, 103, 43);
		panel_1.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Cadastro t = new Cadastro(controller);
				t.mostraTela2();
				frmBikeSense.dispose();
			}
		});
		
		
	}
	
	public void recebeCadastro(UsuarioController controller) {
		this.controller = controller;
	}
	
	public void mostraTela() {
		frmBikeSense.setVisible(true);
	}
}
