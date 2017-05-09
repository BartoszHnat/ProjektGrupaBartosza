/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduly;

import data.Produkty;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Browar
 */
@ManagedBean
@RequestScoped
public class produkty {

     SessionFactory factory = new Configuration().configure().buildSessionFactory();
       Session session = factory.openSession();
        
    public produkty() {
    }
    public List<Produkty> Produktylist(){
        Criteria cr = session.createCriteria(Produkty.class);
        List<Produkty> res = cr.list();
        return res;
    }
    
}
