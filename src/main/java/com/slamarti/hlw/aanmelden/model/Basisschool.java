package com.slamarti.hlw.aanmelden.model;

import javax.persistence.*;

@Entity
@Table(name = "Gegevens_Basisschool")
public class Basisschool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer basisschool_id;

    @OneToOne
    @JoinColumn(name="leerlingen_id", nullable=false)
    private LeerlingGegevens leerlingGegevens;

    private String naamSchool;

    private String Plaats;

    private String Schooladvies;

    private String Contactpersoon;

    private String Telefoon;

    private int citoScore;

    Basisschool(LeerlingGegevens leerlingGegevens) {
        this.leerlingGegevens = leerlingGegevens;
    }


    public String getNaamSchool() {
        return naamSchool;
    }

    public void setNaamSchool(String Naam_school) {
        this.naamSchool = Naam_school;
    }

    public String getPlaats() {
        return Plaats;
    }

    public void setPlaats(String Plaats) {
        this.Plaats = Plaats;
    }

    public String getSchooladvies() {
        return Schooladvies;
    }

    public void setSchooladvies(String Schooladvies) {
        this.Schooladvies = Schooladvies;
    }

    public String getContactpersoon() {
        return Contactpersoon;
    }

    public void setContactpersoon(String Contactpersoon) {
        this.Contactpersoon = Contactpersoon;
    }

    public String getTelefoon() {
        return Telefoon;
    }

    public void setTelefoon(String Telefoon) {
        this.Telefoon = Telefoon;
    }

    public int getCitoScore() {
        return citoScore;
    }

    public void setCitoScore(int citoScore) {
        this.citoScore = citoScore;
    }
}
