package src;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.FlowLayout;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class Acceuil {

	JFrame frame;
	private JFrame frame2;
	JFrame frame3;
	static Acceuil window;
	private JTextField txtDlimiteurDeDbut;
	private JTextField txtDlimiteurDeFin;
	private JTextField textField;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private static final long serialVersionUID = 1L;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Acceuil();
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
	public Acceuil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame2 = new JFrame();
		frame3 = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame2.setBounds(100, 100, 450, 300);
		frame3.setBounds(100, 100, 450, 300);
		frame.getContentPane().setBackground(new Color(65, 105, 225));
		frame2.getContentPane().setBackground(new Color(220, 220, 220));
		frame3.getContentPane().setBackground(new Color(144, 238, 144));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Application de Résiliation");
		frame2.setTitle("Application de Résiliation");
		frame3.setTitle("Application de Résiliation");
		frame.getContentPane().setLayout(null);
		frame2.getContentPane().setLayout(null);
		frame3.getContentPane().setLayout(null);
		/*JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 105, 225));
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(169, 169, 169));
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(144, 238, 144));

		frame2.getContentPane().add(panel2, BorderLayout.CENTER);
		frame3.getContentPane().add(panel3, BorderLayout.CENTER);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);*/
		
		JLabel lblNewLabel = new JLabel("Application de R\u00E9siliation");
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 20));
		lblNewLabel.setBounds(69, 131, 289, 39);
		frame.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Fichier text");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.frame.setVisible(false);
				window.frame2.setVisible(true);
				framed2();
			}
		});
		btnNewButton.setBackground(new Color(244, 164, 96));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(96, 197, 105, 23);
		frame.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Fichier exel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.frame.setVisible(false);
				window.frame3.setVisible(true);
				framed3();
			}
		});
		btnNewButton_1.setBackground(new Color(244, 164, 96));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(235, 197, 105, 23);
		frame.add(btnNewButton_1);
		
		
		BufferedImage myPicture;
		File f = new File("Tunisie-Telecom1.jpg");
		JLabel picLabel = new JLabel(new ImageIcon(f.getName()));
		picLabel.setBounds(160, 10, 120, 110);
		frame.add(picLabel);
		
		

	}
	public void framed2() {
		//Frame 2
		
		
		txtDlimiteurDeDbut = new JTextField();
		txtDlimiteurDeDbut.setBounds(140, 111, 27, 20);
		frame2.getContentPane().add(txtDlimiteurDeDbut);
		txtDlimiteurDeDbut.setColumns(10);
		
		txtDlimiteurDeFin = new JTextField();
		txtDlimiteurDeFin.setBounds(140, 139, 27, 20);
		frame2.getContentPane().add(txtDlimiteurDeFin);
		txtDlimiteurDeFin.setColumns(10);
		
		JLabel lblNewLabel1 = new JLabel("D\u00E9limiteur de fin      :");
		lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel1.setBackground(new Color(255, 255, 255));
		lblNewLabel1.setBounds(10, 141, 132, 14);
		frame2.getContentPane().add(lblNewLabel1);
		
		JLabel lblNewLabel_1 = new JLabel("D\u00E9limiteur de d\u00E9but :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 114, 132, 14);
		frame2.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chemin de fichier     :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 166, 132, 14);
		frame2.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(140, 164, 268, 20);
		frame2.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton1 = new JButton("Extraire des donn\u00E9es");
		btnNewButton1.setBounds(194, 110, 182, 23);
		frame2.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton_2 = new JButton("Supprimer donn\u00E9es similaires");
		btnNewButton_2.setBounds(10, 191, 206, 23);
		frame2.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ajouter des donn\u00E9es");
		btnNewButton_3.setBounds(194, 138, 182, 23);
		frame2.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("* Pas des remarques");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBounds(226, 195, 182, 14);
		frame2.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton4 = new JButton("Importer XML");
		btnNewButton4.setBounds(12, 228, 122, 23);
		frame2.getContentPane().add(btnNewButton4);
		
		JButton btnNewButton_4 = new JButton("Exporter XML");
		btnNewButton_4.setBounds(137, 228, 115, 23);
		frame2.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Acceuil");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.frame2.setVisible(false);
				window.frame.setVisible(true);
				
			}
		});
		btnNewButton_5.setBounds(262, 228, 78, 23);
		frame2.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Quitter");
		btnNewButton_6.setBounds(346, 228, 78, 23);
		frame2.getContentPane().add(btnNewButton_6);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 0, 414, 91);
		frame2.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
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
		scrollPane_1.setViewportView(table_1);
	}
	public void framed3() {
		//Frame 3
		
		txtDlimiteurDeDbut = new JTextField();
		txtDlimiteurDeDbut.setBounds(140, 95, 27, 20);
		frame3.getContentPane().add(txtDlimiteurDeDbut);
		txtDlimiteurDeDbut.setColumns(10);
		
		txtDlimiteurDeDbut = new JTextField();
		txtDlimiteurDeDbut.setBounds(140, 117, 27, 20);
		frame3.getContentPane().add(txtDlimiteurDeDbut);
		txtDlimiteurDeDbut.setColumns(10);
		
		txtDlimiteurDeFin = new JTextField();
		txtDlimiteurDeFin.setBounds(140, 139, 27, 20);
		frame3.getContentPane().add(txtDlimiteurDeFin);
		txtDlimiteurDeFin.setColumns(10);
		
		JLabel lblNewLabel3 = new JLabel("Ligne de d\u00E9part     :");
		lblNewLabel3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel3.setBackground(new Color(255, 255, 255));
		lblNewLabel3.setBounds(10, 118, 122, 14);
		frame3.getContentPane().add(lblNewLabel3);
		
		JLabel lblNewLabel1 = new JLabel("Ligne de fin           :");
		lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel1.setBackground(new Color(255, 255, 255));
		lblNewLabel1.setBounds(10, 141, 132, 14);
		frame3.getContentPane().add(lblNewLabel1);
		
		JLabel lblNewLabel_1 = new JLabel("Colonne                :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 98, 132, 14);
		frame3.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chemin de fichier     :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 166, 132, 14);
		frame3.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(140, 164, 268, 20);
		frame3.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton1 = new JButton("Extraire des donn\u00E9es");
		btnNewButton1.setBounds(194, 110, 182, 23);
		frame3.getContentPane().add(btnNewButton1);
		
		JButton btnNewButton_2 = new JButton("Supprimer donn\u00E9es similaires");
		btnNewButton_2.setBounds(10, 191, 206, 23);
		frame3.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Ajouter des donn\u00E9es");
		btnNewButton_3.setBounds(194, 138, 182, 23);
		frame3.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("* Pas des remarques");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setBounds(226, 195, 182, 14);
		frame3.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton4 = new JButton("Importer XML");
		btnNewButton4.setBounds(12, 228, 122, 23);
		frame3.getContentPane().add(btnNewButton4);
		
		JButton btnNewButton_4 = new JButton("Exporter XML");
		btnNewButton_4.setBounds(137, 228, 115, 23);
		frame3.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Acceuil");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window.frame3.setVisible(false);
				window.frame.setVisible(true);
				
			}
		});
		btnNewButton_5.setBounds(262, 228, 78, 23);
		frame3.getContentPane().add(btnNewButton_5);
		
		
		JButton btnNewButton_6 = new JButton("Quitter");
		btnNewButton_6.setBounds(346, 228, 78, 23);
		frame3.getContentPane().add(btnNewButton_6);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 0, 414, 91);
		frame3.getContentPane().add(scrollPane_2);
		
		table_1 = new JTable(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
					{null, null, null, null},
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
		scrollPane_2.setViewportView(table_1);
	}
	
}
