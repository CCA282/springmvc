package com.objis.springmvcdemo.presentation;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.objis.springmvcdemo.domaine.Employe;
import com.objis.springmvcdemo.service.IEmployeManager;

public class HomePageController extends AbstractController {

	private IEmployeManager employeManager;
	
	public void setEmployeManager(IEmployeManager employeManager) {
		this.employeManager = employeManager;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

	List<Employe> listeEmployes = employeManager.getAllEmployes();
	
	return new ModelAndView("home", "employes", listeEmployes);
	}
	
}
