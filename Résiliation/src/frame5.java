package src;

import java.awt.EventQueue;
import static java.awt.GraphicsDevice.WindowTranslucency.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Scrollbar;
import java.awt.Checkbox;
import java.awt.Button;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.ListSelectionModel;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JSplitPane;
import javax.swing.JProgressBar;

public class frame5 {

	private JFrame frmTunisieTelecom;
	private JTextField txtDlimiteurDeDbut;
	private JTextField txtDlimiteurDeFin;
	private JTextField textField;
	private JScrollPane scrollPane;
	private static final long serialVersionUID = 1L;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame5 window = new frame5();
					window.frmTunisieTelecom.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frame5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTunisieTelecom = new JFrame();
		frmTunisieTelecom.getContentPane().setBackground(Color.WHITE);
		frmTunisieTelecom.setBackground(Color.WHITE);
		frmTunisieTelecom.setTitle("Tunisie telecom");
		frmTunisieTelecom.getRootPane().putClientProperty("Window.alpha", new Float(0.2f));
		//frmTunisieTelecom.setBackground(new Color(240, 255, 255));
		//frmTunisieTelecom.getContentPane().setBackground(new Color(0, 0, 0, 0));
		frmTunisieTelecom.setBounds(100, 100, 450, 300);
		frmTunisieTelecom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTunisieTelecom.getContentPane().setLayout(null);
		
		txtDlimiteurDeDbut = new JTextField();
		txtDlimiteurDeDbut.setBounds(140, 11, 27, 20);
		frmTunisieTelecom.getContentPane().add(txtDlimiteurDeDbut);
		txtDlimiteurDeDbut.setColumns(10);
		
		txtDlimiteurDeFin = new JTextField();
		txtDlimiteurDeFin.setBounds(140, 39, 27, 20);
		frmTunisieTelecom.getContentPane().add(txtDlimiteurDeFin);
		txtDlimiteurDeFin.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("D\u00E9limiteur de fin      :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 41, 132, 14);
		frmTunisieTelecom.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("D\u00E9limiteur de d\u00E9but :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 14, 132, 14);
		frmTunisieTelecom.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chemin de fichier     :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 66, 132, 14);
		frmTunisieTelecom.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(140, 64, 268, 20);
		frmTunisieTelecom.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Extraire des donn\u00E9es");
		btnNewButton.setBounds(194, 10, 182, 23);
		frmTunisieTelecom.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Supprimer donn\u00E9es similaires");
		btnNewButton_1.setBounds(10, 91, 206, 23);
		frmTunisieTelecom.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ajouter des donn\u00E9es");
		btnNewButton_2.setBounds(194, 38, 182, 23);
		frmTunisieTelecom.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("* Pas des remarques");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBounds(226, 95, 182, 14);
		frmTunisieTelecom.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_3 = new JButton("Importer XML");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\achre\\eclipse-workspace\\R\u00E9siliation\\src\\icons8-add-file-9606.png"));
		btnNewButton_3.setBounds(12, 228, 122, 23);
		frmTunisieTelecom.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exporter XML");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\achre\\eclipse-workspace\\R\u00E9siliation\\src\\icons8-add-file-6401.png"));
		btnNewButton_4.setBounds(137, 228, 115, 23);
		frmTunisieTelecom.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Acceuil");
		btnNewButton_5.setBounds(262, 228, 78, 23);
		frmTunisieTelecom.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Quitter");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(346, 228, 78, 23);
		frmTunisieTelecom.getContentPane().add(btnNewButton_6);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 125, 414, 91);
		frmTunisieTelecom.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
				},
				new String[] {
					"Données", "Validées", "Supprimer", "Remarques"
				}
			)){

            private static final long serialVersionUID = 1L;

            /*@Override
            public Class getColumnClass(int column) {
            return getValueAt(0, column).getClass();
            }*/
            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return String.class;
                    case 1:
                        return Boolean.class;
                    case 2:
                        return Boolean.class;
                    case 3:
                        return String.class;
                    default:
                        return Boolean.class;
                }
            }
        };
		table_1.setForeground(new Color(0, 102, 102));
		table_1.setBackground(new Color(245, 245, 245));
		table_1.setRowSelectionAllowed(false);
		table_1.getTableHeader().setBackground(new Color(25,245,245));
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setToolTipText("");
		scrollPane_1.setViewportView(table_1);
		
	}
}
