package com.demo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class unmarshaljava {

	  public static void main(String[] args) 
	    {
	        String fileName = "D:\\practice\\practice\\src\\main\\java\\com\\demo\\l.xml";
	 
	        jaxbXmlFileToObject(fileName);
	    }
	 
	    private static void jaxbXmlFileToObject(String fileName) {
	         
	        File xmlFile = new File(fileName);
	         
	        JAXBContext jaxbContext;
	        try
	        {
	        	
	            //creating the JAXB context
	            JAXBContext jContext = JAXBContext.newInstance(Employee.class);
	            //creating the unmarshall object
	            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
	            //calling the unmarshall method
	            Employee student=(Employee) unmarshallerObj.unmarshal(xmlFile);
	            System.out.println(student.getDepartment().getName());
	        }
	        catch (JAXBException e) 
	        {
	            e.printStackTrace();
	        }
	    }

}
