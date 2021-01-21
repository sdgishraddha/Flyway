package com.virtualDatabaseLibraries;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;



public class ListOfFiles extends MainMenu{
	Scanner input = new Scanner(System.in);

	
	
	public void FileList() throws InputMismatchException, IOException {
		System.out.println("Please enter the directory\n");
		rootDir = input.nextLine();
		File file = new File(rootDir);
		if (file.exists()||file.isDirectory()) {
		File[] files = file.listFiles();
		System.out.println("No. of files : " + files.length) ;
		for(File eachFile : files) {
			if(eachFile.isDirectory()) {
				File[] folderFiles = eachFile.listFiles();
				for(File fl : folderFiles) {
					System.out.println(fl.getName());
				}
			} 
			else 
				System.out.println(eachFile.getName());
			}
		}
		else
			System.out.println("Directory not found: \n"+rootDir);
		
		System.out.println("\n\nPress 8 for Main Menu\nPress 9 to exit\n");
		
		option = input.nextInt();
		MainMenu.optionNavigator(option);
		
	}
}
