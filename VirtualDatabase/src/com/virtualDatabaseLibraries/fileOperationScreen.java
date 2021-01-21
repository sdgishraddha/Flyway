package com.virtualDatabaseLibraries;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class fileOperationScreen extends MainMenu {
	boolean success = false;
	public void fileOperation() throws IOException {
		System.out.println("Please choose from below operations you want to perform");
		System.out.println("Press 1 to Add new file");
		System.out.println("Press 2 to delete existing file");
		System.out.println("Press 3 to search a existing file");
		System.out.println("\n\nPress 8 for Main Menu\nPress 9 to exit\n");
		Scanner input = new Scanner(System.in);
		rootDir = "/home/sdgishraddha522/eclipse-workspace/VirtualDatabase";
		
		option = input.nextInt();
		
		while(option !=9 ) {	
			if (option == 1) {
				addFile();
				System.out.println("Please choose from below operations you want to perform");
				System.out.println("Press 1 to Add new file");
				System.out.println("Press 2 to delete existing file");
				System.out.println("Press 3 to search a existing file");
				System.out.println("\n\nPress 8 for Main Menu\nPress 9 to exit\n");
				option = input.nextInt();
				
			}
			else if (option == 2) {
				deletefile();
				System.out.println("Please choose from below operations you want to perform");
				System.out.println("Press 1 to Add new file");
				System.out.println("Press 2 to delete existing file");
				System.out.println("Press 3 to search a existing file");
				System.out.println("\n\nPress 8 for Main Menu\nPress 9 to exit\n");
				option = input.nextInt();
				
				
			}
			else if (option == 3) {
				searchFile();
				System.out.println("Please choose from below operations you want to perform");
				System.out.println("Press 1 to Add new file");
				System.out.println("Press 2 to delete existing file");
				System.out.println("Press 3 to search a existing file");
				System.out.println("\n\nPress 8 for Main Menu\nPress 9 to exit\n");
				option = input.nextInt();
				
			}
			else if (option == 8) {
				MainMenu.main(null);
			}
			else {
				System.out.println("Enter correct value");
				System.out.println("Please choose from below operations you want to perform");
				System.out.println("Press 1 to Add new file");
				System.out.println("Press 2 to delete existing file");
				System.out.println("Press 3 to search a existing file");
				System.out.println("\n\nPress 8 for Main Menu\nPress 9 to exit\n");
				option = input.nextInt();
			}
			
			
		}
		System.exit(0);
		
		
		
	}


	public void deletefile() throws NoSuchFileException {
		Scanner input = new Scanner(System.in);
		rootDir = "/home/sdgishraddha522/eclipse-workspace/VirtualDatabase/";
		System.out.println("Enter the file name you want to delete");
		fName = input.nextLine();
		File path = new File(rootDir);
		File file = new File(path,fName);
		if (file.exists()) {
			file.delete();
			System.out.println("Deleted the file: " + file.getName()+"\n");
		}
		else {
			System.out.println("File not found\n");
		}
		
		
		
		
		
		
	}
	
	public void addFile() throws IOException {
		System.out.println("Enter the file name to add to root directory");
		Scanner input = new Scanner(System.in);
		fName = input.nextLine();
		File path = new File(rootDir);
		File file = new File(path,fName);
		
		
			if (file.exists()) {
				System.out.println("File already Exist!!\n");
				}
			else {
				file.createNewFile();
				System.out.println("Created file: " + file.getName()+"\n");
				}
			
		}
		
		
	public void searchFile() {
		   String rootDir = "/home/sdgishraddha522/eclipse-workspace/VirtualDatabase/";
		      File dir = new File(rootDir);
		      String[] flist = dir.list();
		      
		      if (flist == null) {
		         System.out.println("Directory is Empty");
		      } else {
		      
		      int flag = 0;
		      Scanner input = new Scanner(System.in);
		      System.out.println("Enter the filename to search:");
		      String fName = input.nextLine();
		      for (int i = 0; i < flist.length; i++) { 
		          String filename = flist[i]; 
		          if (filename.equals(fName)) { 
		              System.out.println(filename + " found"); 
		              flag = 1; 
		          } 
		      }
		   
		      if (flag == 0) { 
		          System.out.println("File Not Found"); 
		      }
		   }
	}
	
}
