package com.main.test;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.pojo.Address;
import com.main.pojo.Person;

public class DriverTestfullJsonFile {

	public static void main(String[] args) {
		
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON  file and map/convert to Java POJO: 
			
			Person person = mapper.readValue(new File("JSON/sample-full.json"), Person.class);
			
			System.out.println("First name = " + person.getFirstName());
			System.out.println("Last name = " + person.getLastName());

			Address tempAddress = person.getAddress();
			
			System.out.println("Street = " + tempAddress.getStreet());
			System.out.println("City = " + tempAddress.getCity());
			
			for (String tempLang : person.getLanguages()) {
				System.out.println(tempLang);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
