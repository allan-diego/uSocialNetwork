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

package br.edu.ifpe.igarassu.ipi.poo.usn.data.entity;

/**
 * 
 * Represents an entity that can be saved on a data access memory 
 * 
 * @author Allan Diego Silva Lima - allan.lima@igarassu.ifpe.edu.br
 * 
 */
public class Entity {
	
	// the id of the entity
	private long id;
	
	/**
	 * 
	 * Standard constructor using its parameters
	 * 
	 * @param id the id of the entity
	 */
	public Entity(long id) {
		super();
		this.setId(id);
	}

	/**
	 * 
	 * Returns the id of the entity
	 * 
	 * @return the id of the entity
	 */
	public long getId() {
		return id;
	}
	

	/**
	 * Set a new value for entity's id
	 * 
	 * @param id the new entity's id value
	 */
	public void setId(long id) {
		this.id = id;
	}
	
}
