package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

import model.Person;

public class IO {
	
	static String path = "./persons.json";
	static Gson gson = new Gson();
	
	public static List<Person> readPersons()
	{
		File personsFile = new File(path);
		ArrayList<Person> persons = null;
		String personsJson = "";
		try {
			Scanner sc = new Scanner(personsFile);
			persons =  new ArrayList<>();
			while(sc.hasNextLine())
			{
				personsJson += sc.nextLine();
			}
			persons = gson.fromJson(personsJson, persons.getClass());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return persons;
	}
	
	public static void writePersons(List<Person> persons)
	{
		String personsJson = gson.toJson(persons);
		
		try {
			PrintWriter pw = new PrintWriter(path);
			pw.print(personsJson);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
