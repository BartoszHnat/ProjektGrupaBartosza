package data;
// Generated 2017-05-06 18:08:38 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Typ generated by hbm2java
 */
@Entity
@Table(name="typ"
    ,catalog="sklep"
)
public class Typ  implements java.io.Serializable {


     private int idTyp;
     private String nazwaTypu;
     private Set<Produkty> produkties = new HashSet<Produkty>(0);

    public Typ() {
    }

	
    public Typ(int idTyp, String nazwaTypu) {
        this.idTyp = idTyp;
        this.nazwaTypu = nazwaTypu;
    }
    public Typ(int idTyp, String nazwaTypu, Set<Produkty> produkties) {
       this.idTyp = idTyp;
       this.nazwaTypu = nazwaTypu;
       this.produkties = produkties;
    }
   
     @Id 

    
    @Column(name="Id_Typ", unique=true, nullable=false)
    public int getIdTyp() {
        return this.idTyp;
    }
    
    public void setIdTyp(int idTyp) {
        this.idTyp = idTyp;
    }

    
    @Column(name="Nazwa_Typu", nullable=false, length=50)
    public String getNazwaTypu() {
        return this.nazwaTypu;
    }
    
    public void setNazwaTypu(String nazwaTypu) {
        this.nazwaTypu = nazwaTypu;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="typ")
    public Set<Produkty> getProdukties() {
        return this.produkties;
    }
    
    public void setProdukties(Set<Produkty> produkties) {
        this.produkties = produkties;
    }




}

