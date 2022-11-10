package com.main.test;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.pojo.Person;

public class DriverTestLiteJsonFile {

	public static void main(String[] args) {
		
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON  file and map/convert to Java POJO: 	
			Person person = mapper.readValue(new File("JSON/sample-lite.json"), Person.class);
			
			System.out.println("First name = " + person.getFirstName());
			System.out.println("Last name = " + person.getLastName());

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
