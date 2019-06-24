/*
 *
 * IFPE - Federal Institute of Education, Science and Technology of Pernambuco
 * Informatics for the Internet
 * Object Oriented Programming
 * Professor: Allan Lima - allan.lima@igarassu.ifpe.edu.br
 * 
 * Public domain code, feel free to use, modify and redistribute it 
 *
 */

package br.edu.ifpe.igarassu.ipi.poo.usn.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.user.User;

/**
 * 
 * Small test on how to convert a Java object to a JSOM file using the Jackson library. 
 * 
 * @author Allan Diego Silva Lima - allan.lima@igarassu.ifpe.edu.br
 *
 */
public class TestJSON {
	public static void main(String[] args) {
		User usuario = new User(10, "Carla", "312");

		ObjectMapper mapper = new ObjectMapper();
		
		 try {
			String jsonString = mapper.writeValueAsString(usuario);
			System.out.println(jsonString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}


	}
}
