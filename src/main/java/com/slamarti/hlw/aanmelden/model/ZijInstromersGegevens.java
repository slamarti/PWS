package com.slamarti.hlw.aanmelden.model;

import javax.persistence.*;

@Entity
@Table(name = "Zij_instromers_gegevens_vorig_school")
public class ZijInstromersGegevens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer instromers_id;

    @OneToOne
    @JoinColumn(name="leerlingen_id", nullable=false)
    private LeerlingGegevens leerlingGegevens;

    private String naamSchool;
    private String Plaats;
    private String naamContactPersoon;
    private String Telefoonnummer;

    ZijInstromersGegevens(LeerlingGegevens leerlingGegevens) {
        this.leerlingGegevens = leerlingGegevens;
    }

    public String getNaamSchool(){
        return naamSchool;
    }

    public void setNaamSchool(String Naam_school){
        this.naamSchool =Naam_school;
    }

    public String getPlaats(){
        return Plaats;
    }

    public void setPlaats(String Plaats){
        this.Plaats=Plaats;
    }

    public String getNaamContactPersoon(){
        return naamContactPersoon;
    }

    public void setNaamContactPersoon(String Naam_contact_persoon){
        this.naamContactPersoon =Naam_contact_persoon;
    }

    public String getTelefoonnummer(){
        return Telefoonnummer;
    }

    public void setTelefoonnummer(String Telefoonnummer){
        this.Telefoonnummer=Telefoonnummer;
    }
}
