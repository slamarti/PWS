package com.slamarti.hlw.aanmelden.model;

import com.slamarti.hlw.aanmelden.model.types.BurgerlijkeStaat;
import com.slamarti.hlw.aanmelden.model.types.Geslacht;
import com.slamarti.hlw.aanmelden.model.types.TelephoneType;
import com.slamarti.hlw.aanmelden.model.types.VerzorgerType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Gegevens_ouder_verzorger")
public class VerzorgerGegevens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer verzorger_id;

    @ManyToOne
    @JoinColumn(name="leerlingen_id", nullable=false)
    private LeerlingGegevens leerlingGegevens;

    private String Achternaam;
    private String Voorvoegsel;
    private String Voornaam;
    private String Voorletters;
    @Enumerated(EnumType.STRING)
    @Column(name = "Geslacht")
    private Geslacht geslacht;
    private String Adres;
    private String Huisnummer;
    private String Postcode;
    private String Woonplaats;
    private String Telefoonnummer;
    @Enumerated(EnumType.STRING)
    private TelephoneType Telefoonnummer_type;
    private String Mobielnummer;
    @Enumerated(EnumType.STRING)
    private TelephoneType Mobielnummer_type;
    private String Email;
    private String Geboorteland;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date Geboortedatum;
    private String Nationaliteit;
    @Enumerated(EnumType.STRING)
    @Column(name = "Relatie_tot_leerling")
    private VerzorgerType verzorgerType;
    @Enumerated(EnumType.STRING)
    @Column(name = "Burgelijke_staat")
    private BurgerlijkeStaat burgerlijkeStaat;

    public VerzorgerGegevens(LeerlingGegevens leerlingGegevens) {
        this.leerlingGegevens = leerlingGegevens;
    }

    public String getAchternaam(){
        return Achternaam;
    }

    public void setAchternaam(String Achternaam){
        this.Achternaam=Achternaam;
    }

    public String getVoorvoegsel(){
        return Voorvoegsel;
    }

    public void setVoorvoegsel(String Voorvoegsel){
        this.Voorvoegsel=Voorvoegsel;
    }

    public String getVoornaam(){
        return Voornaam;
    }

    public void setVoornaam(String Voornaam){
        this.Voornaam=Voornaam;
    }

    public String getVoorletters(){
        return Voorletters;
    }

    public void setVoorletters(String Voorletters){
        this.Voorletters=Voorletters;
    }

    public String getAdres(){
        return Adres;
    }

    public void setAdres(String Adres){
        this.Adres=Adres;
    }

    public String getHuisnummer(){
        return Huisnummer;
    }

    public void setHuisnummer(String Huisnummer){
        this.Huisnummer=Huisnummer;
    }

    public String getPostcode(){
        return Postcode;
    }

    public void setPostcode(String Postcode){
        this.Postcode=Postcode;
    }

    public String getWoonplaats(){
        return Woonplaats;
    }

    public void setWoonplaats(String Woonplaats){
        this.Woonplaats=Woonplaats;
    }

    public String getTelefoonnummer(){
        return Telefoonnummer;
    }

    public void setTelefoonnummer(String Telefoonnummer){
        this.Telefoonnummer=Telefoonnummer;
    }

    public String getMobielnummer(){
        return Mobielnummer;
    }

    public void setMobielnummer(String Mobielnummer){
        this.Mobielnummer=Mobielnummer;
    }

    public String getEmail(){
        return Email;
    }

    public void setEmail(String Email){
        this.Email=Email;
    }

    public String getGeboorteland(){
        return Geboorteland;
    }

    public void setGeboorteland(String Geboorteland){
        this.Geboorteland=Geboorteland;
    }

    public Date getGeboortedatum(){
        return Geboortedatum;
    }

    public void setGeboortedatum(Date Geboortedatum){
        this.Geboortedatum=Geboortedatum;
    }

    public String getNationaliteit(){
        return Nationaliteit;
    }

    public void setNationaliteit(String Nationaliteit){
        this.Nationaliteit=Nationaliteit;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(Geslacht geslacht) {
        this.geslacht = geslacht;
    }

    public VerzorgerType getVerzorgerType() {
        return verzorgerType;
    }

    public void setVerzorgerType(VerzorgerType verzorgerType) {
        this.verzorgerType = verzorgerType;
    }

    public BurgerlijkeStaat getBurgerlijkeStaat() {
        return burgerlijkeStaat;
    }

    public void setBurgerlijkeStaat(BurgerlijkeStaat burgerlijkeStaat) {
        this.burgerlijkeStaat = burgerlijkeStaat;
    }

    public TelephoneType getTelefoonnummer_type() {
        return Telefoonnummer_type;
    }

    public void setTelefoonnummer_type(TelephoneType telefoonnummer_type) {
        Telefoonnummer_type = telefoonnummer_type;
    }

    public TelephoneType getMobielnummer_type() {
        return Mobielnummer_type;
    }

    public void setMobielnummer_type(TelephoneType mobielnummer_type) {
        Mobielnummer_type = mobielnummer_type;
    }
}
