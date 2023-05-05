package info.controller;

import info.view.InfoFrame;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JOptionPane;

import info.controller.IOController;

public class Controller
{
	private InfoFrame window;
	
	public Controller()
	{
		this.window = new InfoFrame(this);
	}
	
	public void start()
	{
//		setItUp();
	}
	
	
	private void setItUp()
	{
		HashSet<String> textSetExample = new HashSet<String>();
		
		textSetExample.add("I Love HotPot!");
		textSetExample.add("");
		textSetExample.add("Text");
		String demo = "";
		textSetExample.add(demo);
		
		for (String data : textSetExample)
		{
			JOptionPane.showMessageDialog(window, data);
		}
		
		boolean isSuccessful = textSetExample.add(demo);
		boolean testAdd = textSetExample.add("");
		
		JOptionPane.showMessageDialog(window,  "The result of adding demo was: " + isSuccessful);
		JOptionPane.showMessageDialog(window, "The result of adding an empty string was: " + testAdd);
		
		JOptionPane.showMessageDialog(window, "Working with an Iterator");
		
		Iterator <String> setIterator = textSetExample.iterator();
		String result = "";
		
		while(setIterator.hasNext())
		{
			result = setIterator.next();
			JOptionPane.showMessageDialog(window, result);
		}
		
		HashMap<String, Integer>mapDemo = new HashMap<String, Integer>();
		mapDemo.put("",  1);
		mapDemo.put(result, new Integer(123));
		mapDemo.put("The Key", Integer.valueOf(0));
		int yourFavoriteNumber = 1314520;
		mapDemo.put("Erin Zhang", yourFavoriteNumber);
		
		for (Map.Entry<String, Integer> mapEntry : mapDemo.entrySet())
		{
			String key = mapEntry.getKey();
			int value = mapEntry.getValue();
			
			JOptionPane.showMessageDialog(window,  "The Key: " + key + " is linked to the value: " + value);
		}
	}
	
	
	public String displayDemoCode()
	{
		String code = "Set Demp Code\n";
		
		code += "HashSet<String> textSetExample = new HashSet<String>();\n";
		code += "textSetExample.add(\"Adding text\");\n";
		code += "textSetExample.add(\"Other text\");\n";
		code += "textSetExample.add(\"Text\");\n";
		code += "String demo = SQL Squirrel;\n";
		code += "textSetExample.add(demo);\n";
		
		code += "for (String data : textSetExample)\n JOptionPane.showMessageDialog(window, data);\n";
		
		code += "\n\nIterator Demo Code\n\n";
		code += "Iterator <String> = textSetExample.iterator();\n";
		code += "String result = ( );\n";
		
		code += "while (setIterator.hasNext())\n result = setIterator.next();\n JOptionPane.showMessageDialog(window, result);\n";
		
		return code;
	}

	
	public void handleError(Exception error)
	{
		JOptionPane.showMessageDialog(window, error.getMessage(), "Oops!", JOptionPane.ERROR_MESSAGE);
	}
	
	
	public void save(String path, String contents)
	{
		IOController.saveTextToFile(this,  path, contents);
	}
	
	
	public String load(String path)
	{
		String results = IOController.loadTextFromFile(this, path);
		
		return results;
	}
}
