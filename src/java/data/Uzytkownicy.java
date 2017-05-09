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
 * Uzytkownicy generated by hbm2java
 */
@Entity
@Table(name="uzytkownicy"
    ,catalog="sklep"
)
public class Uzytkownicy  implements java.io.Serializable {


     private int idUzytkownika;
     private String login;
     private String haslo;
     private String email;
     private String imie;
     private String nazwisko;
     private String ulica;
     private int numerDomu;
     private String miejscowosc;
     private String telefon;
     private int typKonta;
     private Set<Zamowienia> zamowienias = new HashSet<Zamowienia>(0);

    public Uzytkownicy() {
    }

	
    public Uzytkownicy(int idUzytkownika, String login, String haslo, String email, String imie, String nazwisko, String ulica, int numerDomu, String miejscowosc, String telefon, int typKonta) {
        this.idUzytkownika = idUzytkownika;
        this.login = login;
        this.haslo = haslo;
        this.email = email;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miejscowosc = miejscowosc;
        this.telefon = telefon;
        this.typKonta = typKonta;
    }
    public Uzytkownicy(int idUzytkownika, String login, String haslo, String email, String imie, String nazwisko, String ulica, int numerDomu, String miejscowosc, String telefon, int typKonta, Set<Zamowienia> zamowienias) {
       this.idUzytkownika = idUzytkownika;
       this.login = login;
       this.haslo = haslo;
       this.email = email;
       this.imie = imie;
       this.nazwisko = nazwisko;
       this.ulica = ulica;
       this.numerDomu = numerDomu;
       this.miejscowosc = miejscowosc;
       this.telefon = telefon;
       this.typKonta = typKonta;
       this.zamowienias = zamowienias;
    }
   
     @Id 

    
    @Column(name="Id_Uzytkownika", unique=true, nullable=false)
    public int getIdUzytkownika() {
        return this.idUzytkownika;
    }
    
    public void setIdUzytkownika(int idUzytkownika) {
        this.idUzytkownika = idUzytkownika;
    }

    
    @Column(name="Login", nullable=false, length=50)
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    
    @Column(name="Haslo", nullable=false, length=50)
    public String getHaslo() {
        return this.haslo;
    }
    
    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    
    @Column(name="Email", nullable=false, length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="Imie", nullable=false, length=50)
    public String getImie() {
        return this.imie;
    }
    
    public void setImie(String imie) {
        this.imie = imie;
    }

    
    @Column(name="Nazwisko", nullable=false, length=50)
    public String getNazwisko() {
        return this.nazwisko;
    }
    
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    
    @Column(name="Ulica", nullable=false, length=50)
    public String getUlica() {
        return this.ulica;
    }
    
    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    
    @Column(name="Numer_Domu", nullable=false)
    public int getNumerDomu() {
        return this.numerDomu;
    }
    
    public void setNumerDomu(int numerDomu) {
        this.numerDomu = numerDomu;
    }

    
    @Column(name="Miejscowosc", nullable=false, length=50)
    public String getMiejscowosc() {
        return this.miejscowosc;
    }
    
    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    
    @Column(name="Telefon", nullable=false, length=9)
    public String getTelefon() {
        return this.telefon;
    }
    
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    
    @Column(name="Typ_Konta", nullable=false)
    public int getTypKonta() {
        return this.typKonta;
    }
    
    public void setTypKonta(int typKonta) {
        this.typKonta = typKonta;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="uzytkownicy")
    public Set<Zamowienia> getZamowienias() {
        return this.zamowienias;
    }
    
    public void setZamowienias(Set<Zamowienia> zamowienias) {
        this.zamowienias = zamowienias;
    }




}

