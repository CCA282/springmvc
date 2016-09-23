package com.objis.springmvcdemo.dao;



import java.util.List;

import com.objis.springmvcdemo.domaine.Employe;


public interface IEmployeDaoJdbc {

	
	public Employe getEmployeById(int id);
	
	public Employe getEmployeByLogin(String login);
	
	public void saveEmploye(Employe employe);
	
	public List<Employe> getAllEmploye();
	
	public int getEmployesCount();
}
