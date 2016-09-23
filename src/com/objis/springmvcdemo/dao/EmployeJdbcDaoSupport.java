package com.objis.springmvcdemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.objis.springmvcdemo.domaine.Employe;


public class EmployeJdbcDaoSupport extends JdbcDaoSupport implements IEmployeDaoJdbc {

	@Override
	public Employe getEmployeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe getEmployeByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmploye(Employe employe) {
		final String EMPLOYE_INSERT = "insert into employe (id,login, password, prenom, nom, email, role) "
				+ "values (?,?,?,?,?,?,?)";

		/*
		 * On récupère et on utilisera directement le jdbcTemplate
		 */
		getJdbcTemplate().update(
				EMPLOYE_INSERT,
				new Object[] { employe.getId(),employe.getLogin(),employe.getPassword(), 
						employe.getPrenom(),employe.getNom(), employe.getEmail(),employe.getRole() });
	}

	@Override
	public List<Employe> getAllEmploye() {
		String sql = "select id, nom, prenom from employe";
		List<Employe> listEmploye = new ArrayList<Employe>();
		// Mapping d'un enregistrement vers un ResultSet
		RowMapper mapper = new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employe employe = new Employe();
				employe.setId((int) rs.getLong("id"));
				employe.setNom(rs.getString("nom"));
				employe.setPrenom(rs.getString("prenom"));
				return employe;
			}
		};
		// Retourne l'objet Employe associé à l'Id
		// Notez 1) le casting explicite Employe,
		// 2) que l'enveloppe de l'argument 'id' dans un tableau d'objet,
		// 3) le boxing de 'id' comme un type reference Long
		// Ces étapes ne sont pas necessaire en utilisant (java 5)
		// SimpleJdbcTemplate
		return (List<Employe>) getJdbcTemplate().query(sql, mapper);
	}

	@Override
	public int getEmployesCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
