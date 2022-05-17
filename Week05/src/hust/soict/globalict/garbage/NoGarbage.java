package hust.soict.globalict.garbage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NoGarbage{
	public void ReadFileWithScanner() {
		try {
	    	  File x = new File("C:\\Users\\Trung Dung\\OneDrive\\Documents\\java\\Week05\\src\\hust\\soict\\globalict\\garbage\\file.txt");
	    	  Scanner sc = new Scanner(x);
	    	  String content = "";
	    	  while(sc.hasNextLine()) {
	    		  content += sc.nextLine()+"\r\n";
	    	  }
	  	      System.out.println(content);

	    	  sc.close();
	    	} catch (FileNotFoundException e) {
	    	  System.out.println("Error");
	    	}
	}
	
	public void ReadFileWhithBuffer() {
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("C:\\\\Users\\\\Trung Dung\\\\OneDrive\\\\Documents\\\\java\\\\Week05\\\\src\\\\hust\\\\soict\\\\globalict\\\\garbage\\\\file.txt");
			bufferedReader = new BufferedReader(fileReader);
			
			int val = 0;
			while ((val = bufferedReader.read()) != -1) {
				char c = (char) val;
				//prints the character
				System.out.print(c);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
