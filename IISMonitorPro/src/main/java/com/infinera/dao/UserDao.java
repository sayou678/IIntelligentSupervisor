package com.infinera.dao;

import java.util.List;

import com.infinera.model.User;

public class UserDao extends AbstractDao {
	public UserDao() {
		super();
	}
	
	/**
	 * Insert a user into database
	 * @param user
	 */
	public void create(User user) {
		super.saveOrUpdate(user);
	}
	
	/**
	 * Update a user into database
	 * @param user
	 */
	public void update(User user) {
		super.saveOrUpdate(user);
	}
	
	public void delete(User user) {
		super.delete(user);
	}
	
	public User getById(int id) {
		return (User) super.getById(User.class, id);
	}
	
	public int getIdByName(String name) {
		List<User> list = findAll();
		
		for (User user : list) {
			if (user.getName().equals(name)) {
				return user.getId();
			}
		}
		return -1;
	}
	
	public List<User> findAll() {
		return (List<User>) super.findAll(User.class);
	}
}
