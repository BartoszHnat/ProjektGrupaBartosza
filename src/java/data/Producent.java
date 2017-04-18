package data;
// Generated 2017-04-18 21:19:21 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Producent generated by hbm2java
 */
@Entity
@Table(name="producent"
    ,catalog="sklep"
)
public class Producent  implements java.io.Serializable {


     private int idProducenta;
     private String nazwaProducenta;
     private Produkty produkty;

    public Producent() {
    }

	
    public Producent(int idProducenta, String nazwaProducenta) {
        this.idProducenta = idProducenta;
        this.nazwaProducenta = nazwaProducenta;
    }
    public Producent(int idProducenta, String nazwaProducenta, Produkty produkty) {
       this.idProducenta = idProducenta;
       this.nazwaProducenta = nazwaProducenta;
       this.produkty = produkty;
    }
   
     @Id 

    
    @Column(name="Id_Producenta", unique=true, nullable=false)
    public int getIdProducenta() {
        return this.idProducenta;
    }
    
    public void setIdProducenta(int idProducenta) {
        this.idProducenta = idProducenta;
    }

    
    @Column(name="Nazwa_Producenta", nullable=false, length=50)
    public String getNazwaProducenta() {
        return this.nazwaProducenta;
    }
    
    public void setNazwaProducenta(String nazwaProducenta) {
        this.nazwaProducenta = nazwaProducenta;
    }

@OneToOne(fetch=FetchType.LAZY, mappedBy="producent")
    public Produkty getProdukty() {
        return this.produkty;
    }
    
    public void setProdukty(Produkty produkty) {
        this.produkty = produkty;
    }




}


