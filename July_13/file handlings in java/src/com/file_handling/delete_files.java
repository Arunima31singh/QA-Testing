package com.file_handling;

import java.io.File;

public class delete_files {

	public static void main(String[] args) {
		try {
			File myobj = new File("/Users/arunima/folder");
			
			if (myobj.delete()) {
				System.out.println("Deleted the folder/file successfully.");
			} else {
				System.out.println("Failed to delete the file (it might not exist or isn't empty).");
			}
			
		} catch (SecurityException e) {
			System.out.println("Error: Lacking required permissions to delete this file.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
