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

		returnString(new File(userDirectoryAccess), 0);
	}

	//Similar to the for each loop
	public static void directorySize(File[] userFile, int index)
	{
		System.out.println( "Directory path: " 
							+ userFile[index].toString()
							+ ";\n"
							+ DirectoryProcessor.numOfDirectories + " folders with "
							+ DirectoryProcessor.numOfFiles + " files containing "
							+ userFile[index].length() + " bytes.");
		
		if(userFile[index].isDirectory())
		{
			DirectoryProcessor.numOfDirectories++;
			returnString(userFile[index], index + 1);
		}
		else if(userFile[index].isDirectory())
		{
			DirectoryProcessor.numOfFiles++;
			returnString(userFile[index], index + 1);
		}
	}

	//Similar to the process methiod in the DumpDirectoryTree project
	public static void returnString(File userFile, int index)
	{
		if(userFile.isDirectory())
		{
		File[] files = userFile.listFiles();
		directorySize(files, index);
		}
	}
}