package com.objis.springmvcdemo.service;

import java.util.List;

import com.objis.springmvcdemo.dao.IEmployeDaoJdbc;
import com.objis.springmvcdemo.domaine.Employe;

public class EmployeManager implements IEmployeManager {

	private IEmployeDaoJdbc employeDAO;

	public void setEmployeDAO(IEmployeDaoJdbc employeDAO) {
		this.employeDAO = employeDAO;
	}
	
	public Employe getEmploye(String login) {
		return employeDAO.getEmployeByLogin(login);
	}
	
	public void saveEmploye(Employe employe) {
		employeDAO.saveEmploye(employe);
	}
	
	public List<Employe> getAllEmployes() {
		return employeDAO.getAllEmploye();
	}

}
