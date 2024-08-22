package com.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.imageio.stream.MemoryCacheImageInputStream;

/*
 * file:
 * 1. File is a class
 * 2.to store the data permanent
 * 3. we use stream to store the data
 * 
 * 1.Byte stream(1 byte/char)
 *        FileOutputstream 
 *        to write into the file
 *        FileInputstream
 *        to read from the file
 *        
 *        
 * 
 * 2.character stream
 *         FileWriter
 *    to write into the file
 *        FileReader
 *        to read from the file
 *
 * steps:
 * 1.to open /create a file into java class
 * 2.to write /read into/from the class
 * 3.close the file
 * 
 * must have error
 * FileNotfound
 * Exception
 * 
 * 
 */
public class ByteStreamDemo {
public static void main(String[] args) throws Exception{
	
	//to open/create a file into java class
	FileOutputStream fos=new FileOutputStream("file1.txt");
	String msg="\nThis is Tops Technologies...surat";
	//to convert into byte
	byte[]bb=msg.getBytes();
	//to write into file
	fos.write(bb);
	fos.flush();
	fos.close();
	System.out.println("data writen");
	
	FileInputStream fis=new FileInputStream("file1.txt");
	int x;
	while ( (x=fis.read())!=-1){
		System.out.print((char)x);
		
		
	}
	fis.close();
	
	
}
}
