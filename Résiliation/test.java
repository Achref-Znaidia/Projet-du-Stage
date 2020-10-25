


import java.io.File;  
import java.io.PrintWriter;

import javax.swing.JFileChooser; 

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str1 = "qwerty15q we1'2r5ty2";      
		String str = str1.replaceAll("[^0-9]+", " ");
		String st = str1.replaceAll("\\s","");
	    String tt = str1.replaceAll("'","°");
		System.out.println(st);
		System.out.println(tt);
		System.out.println(str.trim().split(" ")[0]);
		JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        f.showSaveDialog(null);
        System.out.println(f.getCurrentDirectory());
        //System.out.println(f.getSelectedFile());
		File mon_fichier = new File("C:\\Users\\achre\\OneDrive\\Bureau\\mon_fichier.txt");
		PrintWriter writer = new PrintWriter(mon_fichier, "UTF-8");
		writer.println(str.trim().split(" ")[0] + " " + str.trim().split(" ")[1]);
		writer.println(str.trim().split(" ")[2] + " " + str.trim().split(" ")[3]);
		writer.close();

	}

}
