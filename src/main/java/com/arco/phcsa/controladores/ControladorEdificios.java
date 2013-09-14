package com.arco.phcsa.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        session.getTransaction().commit();
        HibernateUtils.getSessionFactory().close();
		
		RequestDispatcher dispatcher = null;
		req.setAttribute("edificios", Edificio.dameTodos());
		dispatcher = req.getRequestDispatcher("MostrarEdificios.jsp");
			
		dispatcher.forward(req, resp);
	}
	
}
