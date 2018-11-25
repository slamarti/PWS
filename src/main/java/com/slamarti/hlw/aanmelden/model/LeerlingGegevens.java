package com.slamarti.hlw.aanmelden.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Leerlinggegevens")
public class LeerlingGegevens {

    public LeerlingGegevens() {
        basisschool = new Basisschool(this);
        leerlingGegevensAanvullend = new LeerlingGegevensAanvullend(this);
        zijInstromersGegevens = new ZijInstromersGegevens(this);
        verzorgers = new ArrayList<>();
        verzorgers.add(new VerzorgerGegevens(this));
        verzorgers.add(new VerzorgerGegevens(this));
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer leerlingen_id;

    private SchoolNiveau niveau;
    private int klas;
    private String Achternaam;
    private String Voorvoegsel;
    private String Voorletters;
    private String Voornamen;
    private String Roepnaam;
    @Enumerated(EnumType.STRING)
    private Geslacht geslacht;
    private String Adres;
    private String Huisnummer;
    private String Woonplaats;
    private String Postcode;
    private String Telefoon;
    private String Geboorteplaats;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Geboortedatum;
    private String Geboorteland;
    private String Nationaliteiten;
    private String BSNNummer;

    @OneToOne(mappedBy = "leerlingGegevens", cascade = {CascadeType.ALL, CascadeType.PERSIST, CascadeType.MERGE})
    private Basisschool basisschool;

    @OneToOne(mappedBy = "leerlingGegevens", cascade = {CascadeType.ALL, CascadeType.PERSIST, CascadeType.MERGE})
    private LeerlingGegevensAanvullend leerlingGegevensAanvullend;

    @OneToOne(mappedBy = "leerlingGegevens", cascade = {CascadeType.ALL, CascadeType.PERSIST, CascadeType.MERGE})
    private ZijInstromersGegevens zijInstromersGegevens;

    @OneToMany(mappedBy = "leerlingGegevens", cascade = {CascadeType.ALL, CascadeType.PERSIST, CascadeType.MERGE})
    private List<VerzorgerGegevens> verzorgers;

    public SchoolNiveau getNiveau() {
        return niveau;
    }

    public void setNiveau(SchoolNiveau niveau) {
        this.niveau = niveau;
    }

    public int getKlas() {
        return klas;
    }

    public void setKlas(int klas) {
        this.klas = klas;
    }

    public String getAchternaam() {
        return Achternaam;
    }

    public void setAchternaam(String Achternaam) {
        this.Achternaam = Achternaam;
    }

    public String getVoorvoegsel() {
        return Voorvoegsel;
    }

    public void setVoorvoegsel(String Voorvoegsel) {
        this.Voorvoegsel = Voorvoegsel;
    }

    public String getVoorletters() {
        return Voorletters;
    }

    public void setVoorletters(String Voorletters) {
        this.Voorletters = Voorletters;
    }

    public String getVoornamen() {
        return Voornamen;
    }

    public void setVoornamen(String Voornamen) {
        this.Voornamen = Voornamen;
    }

    public String getRoepnaam() {
        return Roepnaam;
    }

    public void setRoepnaam(String Roepnaam) {
        this.Roepnaam = Roepnaam;
    }

    public void setGeslacht(Geslacht geslacht) {
        this.geslacht = geslacht;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String Adres) {
        this.Adres = Adres;
    }

    public String getHuisnummer() {
        return Huisnummer;
    }

    public void setHuisnummer(String Huisnummer) {
        this.Huisnummer = Huisnummer;
    }

    public String getWoonplaats() {
        return Woonplaats;
    }

    public void setWoonplaats(String Woonplaats) {
        this.Woonplaats = Woonplaats;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getTelefoon() {
        return Telefoon;
    }

    public void setTelefoon(String Telefoon) {
        this.Telefoon = Telefoon;
    }

    public String getGeboorteplaats() {
        return Geboorteplaats;
    }

    public void setGeboorteplaats(String Geboorteplaats) {
        this.Geboorteplaats = Geboorteplaats;
    }

    public Date getGeboortedatum() {
        return Geboortedatum;
    }

    public void setGeboortedatum(Date Geboortedatum) {
        this.Geboortedatum = Geboortedatum;
    }

    public String getGeboorteland() {
        return Geboorteland;
    }

    public void setGeboorteland(String Geboorteland) {
        this.Geboorteland = Geboorteland;
    }

    public String getNationaliteiten() {
        return Nationaliteiten;
    }

    public void setNationaliteiten(String Nationaliteiten) {
        this.Nationaliteiten = Nationaliteiten;
    }

    public String getBSNNummer() {
        return BSNNummer;
    }

    public void setBSNNummer(String BSNNummer) {
        this.BSNNummer = BSNNummer;
    }

    public Basisschool getBasisschool() {
        return basisschool;
    }

    public void setBasisschool(Basisschool basisschool) {
        this.basisschool = basisschool;
    }

    public LeerlingGegevensAanvullend getLeerlingGegevensAanvullend() {
        return leerlingGegevensAanvullend;
    }

    public void setLeerlingGegevensAanvullend(LeerlingGegevensAanvullend leerlingGegevensAanvullend) {
        this.leerlingGegevensAanvullend = leerlingGegevensAanvullend;
    }

    public ZijInstromersGegevens getZijInstromersGegevens() {
        return zijInstromersGegevens;
    }

    public void setZijInstromersGegevens(ZijInstromersGegevens zijInstromersGegevens) {
        this.zijInstromersGegevens = zijInstromersGegevens;
    }

    public List<VerzorgerGegevens> getVerzorgers() {
        return verzorgers;
    }

    public void setVerzorgers(List<VerzorgerGegevens> verzorgers) {
        this.verzorgers = verzorgers;
    }
}