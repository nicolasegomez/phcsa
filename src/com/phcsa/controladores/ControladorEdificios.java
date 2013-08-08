package com.phcsa.controladores;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phcsa.dominio.Edificio;

public class ControladorEdificios extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		req.setAttribute("listaDeEdificios", Edificio.dameTodos());
		dispatcher = req.getRequestDispatcher("MostrarEdificios.jsp");
			
		dispatcher.forward(req, resp);
	}
	
}
