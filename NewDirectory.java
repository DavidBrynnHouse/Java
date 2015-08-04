/**David House
  * Program 4
  * This file simulates a directory using recursion
  * Also returns the size of each directory
  */

import java.util.Scanner;
import java.io.File;
import java.util.Date;
import java.io.IOException;

public class NewDirectory
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
			setDirectories(numOfDirectories++);
		}
		else if (userFile.isDirectory())
		{
			setFiles(numOfFiles++)
		}
	}

	public static void fileWalker(File userFile, int index)
	{
		
			File[] files = userFile.listFiles();
			for (File userFile: userFile)
			{
				System.out.println( child.toString()
									+ ";\t" + child.length() + " bytes.");
				if (child.isDirectory())
					fileWalker(child, index++);
			}
	}

	public static void setDirectories(int dir)
	{
		this.numOfDirectories = dir;
	}

	public static void setFiles(int file)
	{
		this.numOfFiles = file;
	}
}