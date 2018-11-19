import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Convensor {

	private JFrame frame;
	private JTextField txtKilmetros;
	private JTextField txtmetros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Convensor window = new Convensor();
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
	public Convensor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblConvierteDePesetas = new JLabel("Conversor:");
		lblConvierteDePesetas.setBounds(12, 12, 83, 15);
		frame.getContentPane().add(lblConvierteDePesetas);
		
		txtKilmetros = new JTextField();
		txtKilmetros.setBounds(78, 39, 114, 19);
		frame.getContentPane().add(txtKilmetros);
		txtKilmetros.setColumns(10);
		
		JLabel lblKms = new JLabel("Kms:");
		lblKms.setBounds(22, 41, 70, 15);
		frame.getContentPane().add(lblKms);
		JLabel lblMetros = new JLabel("Metros:");
		lblMetros.setBounds(12, 96, 70, 15);
		frame.getContentPane().add(lblMetros);
		
		txtmetros = new JTextField();
		txtmetros.setBounds(78, 94, 114, 19);
		frame.getContentPane().add(txtmetros);
		txtmetros.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtKilmetros.getText().isEmpty()) {
					txtmetros.setText("" + Integer.parseInt(txtKilmetros.getText())*1000);
				}
				else  {
					txtKilmetros.setText(""+ Float.parseFloat(txtmetros.getText())/1000);
				}
			}
		});
		btnConvertir.setBounds(287, 36, 117, 25);
		frame.getContentPane().add(btnConvertir);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtmetros.setText("");
			txtKilmetros.setText("");
			}
		});
		btnLimpiar.setBounds(287, 91, 117, 25);
		frame.getContentPane().add(btnLimpiar);
	}
	
	
}
