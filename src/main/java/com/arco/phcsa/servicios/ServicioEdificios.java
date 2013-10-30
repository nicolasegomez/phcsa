package com.arco.phcsa.servicios;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.arco.phcsa.dominio.Edificio;
import com.arco.phcsa.utils.HibernateUtils;

public class ServicioEdificios {
	
	public List<Edificio> ListarTodos(){
		Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Edificio.class);
		return criteria.list();
	}
	
	public void crearEdificio(){
		Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Edificio edificio = new Edificio(1,"Larrea 1354");
        session.save(edificio);
        edificio = new Edificio(2,"Marcelo T. De Alvear 1934");
        session.save(edificio);
        session.getTransaction().commit();
        HibernateUtils.getSessionFactory().close();
	}

}
