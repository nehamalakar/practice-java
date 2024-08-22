package com.FileIO;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * character stream:
 * FileWriter
 *    to write into the file
 *        FileReader
 *        to read from the file
 *
 * steps:
 * 1.to open /create a file into java class
 * 2.to write /read into/from the class
 * 3.close the file
 *
 *must have error
 * FileNotfound
 * Exception
 * 
 */
public class CharcterStream {
public static void main(String[] args)throws Exception {
	//to open /create a file into java class
	FileWriter fw=new FileWriter("file2.txt",true);
	String msg="\nThis is Tops Technologies.... surat";
	
	fw.write(msg);
	fw.flush();
	fw.close();
	System.out.println("data writen");
	
	// read the file
	FileReader fr=new FileReader("file2.txt");
	int x;
	while ( (x=fr.read())!=-1){
		System.out.print((char)x);
		
		
	}
	fr.close();
	
}
}
