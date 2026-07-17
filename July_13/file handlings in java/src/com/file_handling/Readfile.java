package com.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {

	public static void main(String[] args) {
		
		try {
			File myobj = new File("/Users/arunima/folder");
			Scanner myread = new Scanner(myobj);
			
			while(myread.hasNextLine()) {
				String data = myread.nextLine();
				System.out.println(data);
			}
			myread.close();
			
		} catch(FileNotFoundException e){
			System.out.println("An error occurred - File not Found");
			e.printStackTrace();
			
		}

	}

}
