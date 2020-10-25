

import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class frame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private Connection conn = null;
	private Statement stmt = null;
	private int i = 0;
	
	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/EMP";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "";
	   
	   ArrayList<String> values = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Importer fichier exel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 /* init du filechooser */
			    JFileChooser fc = new JFileChooser();
			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
			            "xlsx", "xlsx");
			    fc.setFileFilter(filter);
			    int returnVal = fc.showOpenDialog(getParent());
			    /* affichage du dialog et test si le bouton ok est pressé */
			    if (returnVal  == JFileChooser.APPROVE_OPTION)
			     try {
			        /* demande au système d'ouvrir le fichier précédemment séléctionné */
			        Desktop.getDesktop().open(fc.getSelectedFile());
			        String filename = fc.getSelectedFile().getName();
			        String path = fc.getSelectedFile().getParentFile().getPath();
			        //System.out.println(filename + " " + path);
			        try  
			        {  
			        File file = new File(path + "\\" + filename);   //creating a new file instance  
			        FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
			        //creating Workbook instance that refers to .xlsx file  
			        @SuppressWarnings("resource")
					XSSFWorkbook wb = new XSSFWorkbook(fis);   
			        XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
			        Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
			        while (itr.hasNext())                 
			        {  
			        Row row = itr.next();  
			        Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
			        while (cellIterator.hasNext())   
			        {  
			        Cell cell = cellIterator.next();  
			        switch (cell.getCellType())               
			        {  
			        case STRING:    //field that represents string cell type  
			        System.out.print(cell.getStringCellValue() + "\t\t\t");
			        values.add(cell.getStringCellValue());

				 	  
				          
			        break;  
			        case NUMERIC:    //field that represents number cell type  
			        System.out.print(cell.getNumericCellValue() + "\t\t\t");
			        values.add(Integer.toString((int) cell.getNumericCellValue()));

				 	   
				          
			        break;  
			        default:  
			        }  
			        try{
				 	      //STEP 2: Register JDBC driver
				 	      Class.forName("com.mysql.jdbc.Driver");

				 	      //STEP 3: Open a connection
				 	      System.out.println("Connecting to database...");
				 	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

				 	      //STEP 4: Execute a query
				 	      System.out.println("Creating statement...");
				 	      stmt = conn.createStatement();
				 	      String sql;
				 	      
				 	      sql = String.format("INSERT INTO DATA(A, B, C, D, E, F, G) VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s')",
				 	      		values.get(i), values.get(i+1), values.get(i+2), values.get(i+3), values.get(i+4), values.get(i+5), values.get(i+6));
				 	      @SuppressWarnings("unused")
						int rs = stmt.executeUpdate(sql);
				 	      i = i + 7;
				 	  
					      //STEP 6: Clean-up environment
					      //rs.close();
					      stmt.close();
					      conn.close();
					   }catch(SQLException se){
					      //Handle errors for JDBC
					      se.printStackTrace();
					   }catch(Exception e1){
					      //Handle errors for Class.forName
					      e1.printStackTrace();
					   }finally{
					      //finally block used to close resources
					      try{
					         if(stmt!=null)
					            stmt.close();
					      }catch(SQLException se2){
					      }// nothing we can do
					      try{
					         if(conn!=null)
					            conn.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }//end try
			        }   
			        System.out.println("");  
			        }  
			       
			       
			        }  
			        catch(Exception e1)  
			        {  
			        e1.printStackTrace();  
			        }  
			       
			     } catch (IOException e1) {
			        e1.printStackTrace();
			      }
			    lblNewLabel.setText("Votre fichier est importée");
			}
			
		});
		btnNewButton.setBounds(130, 105, 201, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Manipuler les donn\u00E9es");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(130, 133, 201, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("Importer votre fichier excel");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(130, 167, 201, 14);
		contentPane.add(lblNewLabel);
	}
}
