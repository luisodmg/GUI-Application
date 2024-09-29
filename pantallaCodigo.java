package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JList;

public class pantallaCodigo {

	private JFrame frame;
	private Pantallas principal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantallaCodigo window = new pantallaCodigo();
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
	public pantallaCodigo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 588, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Generar Codigo");
		lblTitulo.setForeground(Color.ORANGE);
		lblTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 69));
		lblTitulo.setBounds(70, 11, 445, 80);
		frame.getContentPane().add(lblTitulo);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnRegresar.setBounds(10, 439, 257, 32);
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				principal = new Pantallas();
				principal.setMainVisibility(true);
			}
		});
		frame.getContentPane().add(btnRegresar);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnGenerar.setBounds(307, 440, 257, 32);
		frame.getContentPane().add(btnGenerar);
		
		JLabel lblCodePane = new JLabel("Aqui se vera el codigo");
		lblCodePane.setBackground(Color.WHITE);
		lblCodePane.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCodePane.setBounds(70, 314, 445, 40);
		frame.getContentPane().add(lblCodePane);
		
		JLabel lblGenerator = new JLabel("Codigo Generado:");
		lblGenerator.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblGenerator.setBounds(70, 289, 132, 21);
		frame.getContentPane().add(lblGenerator);
	}

	public void setCVisibility(boolean visibility) {
		frame.setVisible(true);
	}
}
