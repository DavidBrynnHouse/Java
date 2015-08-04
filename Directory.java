/**David House
  * Program 4
  * This file simulates a directory using recursion
  * Also returns the size of each directory
  */

import java.util.Scanner;
import java.io.File;
import java.util.Date;
import java.io.IOException;

public class DirectoryProcessor
{
	private static int numOfFiles = 0;
	private static int numOfDirectories = 0;

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What directory would you like to access? ");
		String userDirectoryAccess = scan.nextLine();

		fileWalker(new File(userDirectoryAccess), 0);
	}

	public static void forEach(File userFile, int index)
	{
		if(userFile.isDirectory())
		{
			numOfDirectories++;
			numOfFiles = userFile.listFiles().length;
		}
		
		
		System.out.println( "Directory path: " + userFile.toString() + ";\n"
				+ DirectoryProcessor.numOfDirectories + " folders with "
				+ DirectoryProcessor.numOfFiles + " files containing "
				+ userFile.length() + " bytes.");
		
		if (userFile.isDirectory())
			fileWalker(userFile, index++);
	}

	public static void fileWalker(File userFile, int index)
	{
		
			File[] files = userFile.listFiles();
			
			forEach(files[index], index);
	}

	public static void setDirectories(int dir)
	{
		numOfDirectories = dir;
	}

	public static void setFiles(int file)
	{
		numOfFiles = file;
	}
}