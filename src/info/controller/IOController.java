package info.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import java.time.LocalDateTime;

public class IOController 
{
	public static void saveTextToFile(Controller app, String path, String text)
	{
		String filename = buildDateBasedFilename(path);
		
		try (Scanner textScanner = new Scanner(text);
			PrintWriter textWriter = new PrintWriter(filename))
		{
			while (textScanner.hasNextLine())
			{
				String line = textScanner.nextLine();
				textWriter.println(line);
			}
		}
		catch (IOException error)
		{
			app.handleError(error);
		}
	}
	
	public static String buildDateBasedFilename(String path)
	{
		String filename = path + "Data Structures Info";
		
		LocalDateTime currentTime = LocalDateTime.now();
		
		filename += currentTime.getMonth() + " " + currentTime.getDayOfMonth();
		int minuteTime = currentTime.getMinute();
		String minutes = "0";
		
		if (minuteTime < 10)
		{
			minutes += minuteTime;
		}
		else
		{
			minutes = "" + minuteTime;
		}
		
		filename += " " + currentTime.getHour() + "=" + minutes + ".txt";
		
		return filename;
	}
	
	public static String loadTextFromFile(Controller app, String pathAndFilename)
	{
		String fileContents = "";
		
		File source = new File(pathAndFilename);
		
		try (Scanner textScanner = new Scanner(source))
		{
			while (textScanner.hasNextLine())
			{
				fileContents += textScanner.nextLine() + "\n";
			}
		}
		catch (FileNotFoundException error)
		{
			app.handleError(error);
			fileContents = "No content loaded :(";
		}
		
		return fileContents;
	}
}
