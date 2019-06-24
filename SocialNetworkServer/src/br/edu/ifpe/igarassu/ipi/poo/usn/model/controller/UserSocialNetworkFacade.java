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

package br.edu.ifpe.igarassu.ipi.poo.usn.model.controller;

import java.util.List;

import br.edu.ifpe.igarassu.ipi.poo.usn.data.entity.user.User;

public interface UserSocialNetworkFacade {

	/**
	 * 
	 * Add an user
	 * 
	 * @param user the user to be added
	 */
	public void addUser(User user);

	/**
	 * 
	 * Searches for an user
	 * 
	 * @param id the id of the user to be searched 
	 * 
	 * @return the user found or null if the user is not present on the collection 
	 */
	public User searchUserById(long id);

	/**
	 * 
	 * Returns the number of users
	 * 
	 * @return the number of users
	 */
	public int numberOfUsers();

	/**
	 * 
	 * Returns the users stored as a List
	 * 
	 * @return the elements stored as a List
	 */
	public List<User> listUsers();

	/**
	 * 
	 * Search for users containing the string <code>name</code> on their names
	 * 
	 * @param name the name to be searched
	 * 
	 * @return a list of <code>Users</code> the contain the string <code>name</code> on their names, if there is no results on the search, the method will return an empty list.
	 */
	public List<User> searchUserByName(String name);

	/**
	 * 
	 * Removes an user
	 * 
	 * @param id the id of the user to be removed
	 */
	public void removeUserById(int id);

}