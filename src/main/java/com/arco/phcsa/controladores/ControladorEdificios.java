package com.arco.phcsa.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.arco.phcsa.dominio.Edificio;
import com.arco.phcsa.utils.HibernateUtils;

public class ControladorEdificios extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
    
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Edificio edificio = new Edificio(1,"Larrea 1354");
        session.save(edificio);
        edificio = new Edificio(2,"Marcelo T. De Alvear 1934");
        session.save(edificio);
        session.getTransaction().commit();
        HibernateUtils.getSessionFactory().close();
		
		RequestDispatcher dispatcher = null;
		req.setAttribute("edificios", ListarTodos());
		dispatcher = req.getRequestDispatcher("MostrarEdificios.jsp");
			
		dispatcher.forward(req, resp);
	}
	
	public List<Edificio> ListarTodos(){
		Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Edificio.class);
		return criteria.list();
	}
}
