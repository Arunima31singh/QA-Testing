package com.file_handling;

import java.io.FileWriter;

public class write_file {

	public static void main(String[] args) {
		
		try {
            FileWriter myWriter = new FileWriter("/Users/raghavendrabrbn/Files/Raghu1.txt");
            myWriter.write("Welcome To Coforge Technologies! All the best for learning!");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

	}

}
