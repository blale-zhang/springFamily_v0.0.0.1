package com.catt.spring.dao;

import java.util.List;

import com.catt.spring.mode.Client;



public interface ClientDao {

	List query(Client client);
	
	Client getOne(String sql);
	
}
