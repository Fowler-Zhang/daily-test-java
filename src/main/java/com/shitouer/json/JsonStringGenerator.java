package com.shitouer.json;

/**
 * @author fowler
 * @since Nov 25, 2013
 *
 */
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author http://java-sample-program.blogspot.in/ Object to Json Conversion
 */
public class JsonStringGenerator {

	/**
	 * Method to get a JSON string representing the object supplied.
	 * 
	 * @param object
	 *            for which JSON string is required
	 * @return Json String
	 * @throws IOException
	 */
	public static String createJsonString(Object object) throws IOException {
		Writer writer = new StringWriter();
		JsonFactory factory = new JsonFactory();
		JsonGenerator generator = factory.createJsonGenerator(writer);
		generator.setCodec(new ObjectMapper());
		generator.writeObject(object);
		generator.close();
		System.out.println("Json string " + writer.toString());
		return writer.toString();
	}

	public static void main(String[] args) throws IOException {
		Company company = new Company("ABC", 15001.90f);
		Person p1 = new Person("Jason Stathom", 36, company);
		createJsonString(p1);
	}

}