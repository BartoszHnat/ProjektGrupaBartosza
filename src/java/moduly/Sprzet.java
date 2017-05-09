/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduly;

import data.Produkty;
import data.Producent;
import data.Typ;
import data_json.GBox;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Browar
 */
@ManagedBean
@SessionScoped
public class Sprzet {

    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession();
    Transaction tx = null;

        
    public Sprzet() {
    }
    
    public List<Producent> getProducent(){
            Criteria cr = session.createCriteria(Producent.class);
            List<Producent> res = cr.list();
            return res;        
    }
    
    public void DodajSprzet(int idTyp, int idProducent, String nazwa,String parametry, String opis, int cena){  
        try{
            tx = session.beginTransaction();
            Produkty pr = new Produkty();

            
            Criteria cr1 = session.createCriteria(Producent.class);
            cr1.add(Restrictions.eq("idProducenta",idProducent));
            Producent prod = (Producent) cr1.list().get(0);
            
            Criteria cr2 = session.createCriteria(Typ.class);
            cr2.add(Restrictions.eq("idTyp",idTyp));
            Typ typ = (Typ) cr2.list().get(0);
            
            pr.setCena(cena);
            pr.setNazwa(nazwa);
            pr.setOpis(opis);
            pr.setParametry(parametry);
            pr.setProducent(prod);
            pr.setTyp(typ);
            
            session.save(pr);
            tx.commit();
            
        }catch (HibernateException e) {
             if (tx!=null) tx.rollback();
             e.printStackTrace(); 
        }finally {
        }            
    }
        
}
