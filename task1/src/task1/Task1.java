package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String line = read.readLine().toString();
		
		
		String[] arrayLine = line.split("\\\\n");
		String numberLine = arrayLine[0];
		String stringLine =(String) arrayLine[1]; 
		int toUnsigned = 0;		
		try {
		toUnsigned = Integer.parseUnsignedInt(numberLine);
		} catch (Exception e) {
			System.out.println("usage");
			return;
		}
		
		
		System.out.print(itoBase(toUnsigned, stringLine));
		


	}
	
public static String itoBase(int nb, String base) {
	String nameConvert = base;
	long number = 0;
	int i = 0, d = 1;
	
	switch(nameConvert.toLowerCase()) {
		case ("двоичная"):
			i = 2;
			break;
		case ("троичная"):
			i = 3;
			break;
		case ("восьмеричная"):
			i = 8;
			break;
		case ("шестнадцатеричная"):
			i = 16;
			break;
		default:
			return nameConvert;		
	}
	
	while (nb > 0) {
			number += nb%i * d;	
			nb /=i;
			d *=10;
	}
	
	
		return "\""+number +"\""+ " - " + nameConvert;
	}

}


