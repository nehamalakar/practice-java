package neh.com;

import javax.print.DocFlavor.CHAR_ARRAY;
import javax.print.attribute.Size2DSyntax;

public class FirstDemo {
public static void main(String[] args) {
	int i1=2147483647;
	long l1=4594385403958l;
	byte b1=127;
	boolean bb=true;
	char ch='A';
	float f1=45.5656f;
	double d1=3434.5848;
	
	System.out.println("integer is:"+i1);
	System.out.println("long is:"+l1);
	System.out.println("byte is:"+b1);
	System.out.println("boolean is:"+bb);
	System.out.println("char is:"+ch);
	System.out.println("float is:"+f1);
	System.out.println("double is:"+d1);
	
	System.out.println("size of integer is:"+Integer.BYTES+" bytes");
	System.out.println("size of Long is:"+Long.BYTES+" bytes");
	System.out.println("size of byte is:"+Byte.BYTES+" bytes");
	
	System.out.println("size of char is:"+Character.BYTES+" bytes");
	
	
	
	System.out.println("size of float is:"+Float.BYTES+" bytes");
	
	System.out.println("size of double is:"+Double.BYTES+" bytes");
	
	
}
}
