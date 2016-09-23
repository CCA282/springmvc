package com.objis.springmvcdemo.service;

import java.util.List;

import com.objis.springmvcdemo.dao.IEmployeDaoJdbc;
import com.objis.springmvcdemo.domaine.Employe;

public interface IEmployeManager {

	public void setEmployeDAO(IEmployeDaoJdbc employeDAO);
	
	public Employe getEmploye(String login);
	
	public void saveEmploye(Employe employe);
	
	public List<Employe> getAllEmployes();
}