package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import Controlador.Logica;

import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JList;

public class ViewFrame extends JFrame {
	

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	public JButton btn_Save;
	public JTextField txt_ER;
	public JList tbl_Words;
	public JLabel lbl_intpalabras;
	public JTextArea txt_Area;
	public JButton btn_Charge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFrame frame = new ViewFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewFrame() {
		setTitle("Expresiones Regulares");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 490);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setToolTipText("cszcsz");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Archivos de texto", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel.setBackground(new Color(211, 214, 222));
		panel.setToolTipText("cdcsczcs");
		panel.setBounds(10, 10, 469, 205);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txt_Area = new JTextArea();
		txt_Area.setBounds(10, 23, 449, 130);
		panel.add(txt_Area);
		
		btn_Save = new JButton("Guardar");
		btn_Save.setHorizontalAlignment(SwingConstants.LEFT);
		btn_Save.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		btn_Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btn_Save.setBounds(370, 173, 77, 21);
		panel.add(btn_Save);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setToolTipText("cdcsczcs");
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Analizar Datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(211, 214, 222));
		panel_1.setBounds(10, 225, 469, 215);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Expresión Regular : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 27, 155, 13);
		panel_1.add(lblNewLabel);
		
		txt_ER = new JTextField();
		txt_ER.setBounds(175, 24, 165, 19);
		panel_1.add(txt_ER);
		txt_ER.setColumns(10);
		
		btn_Charge = new JButton("Cargar");
		btn_Charge.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_Charge.setBounds(350, 23, 86, 21);
		panel_1.add(btn_Charge);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de palabras encontradas:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 64, 197, 13);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Listado de palabras:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 92, 144, 21);
		panel_1.add(lblNewLabel_1_1);
		
		tbl_Words = new JList();
		tbl_Words.setBounds(166, 91, 270, 103);
		panel_1.add(tbl_Words);
		
		lbl_intpalabras = new JLabel("");
		lbl_intpalabras.setBounds(217, 64, 155, 13);
		panel_1.add(lbl_intpalabras);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(164, 92, 272, 105);
		panel_1.add(scrollPane);
		
		Logica log=new Logica(this);
		
	}
}
