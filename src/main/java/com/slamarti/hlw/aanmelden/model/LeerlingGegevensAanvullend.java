package com.slamarti.hlw.aanmelden.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Aanvullende_leerlinggegevens")
public class LeerlingGegevensAanvullend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aanvullend_id;

    @OneToOne
    @JoinColumn(name="leerlingen_id", nullable=false)
    private LeerlingGegevens leerlingGegevens;

    private String medischeBijzonderheden;
    @Column(name = "Medicijn_gebruik")
    private Boolean medicijnGebruik;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date inNederlandSinds;
    private String Godsdienst;
    private Boolean Zwemdiploma;
    private Boolean behoefteAanBijzondereZorg;
    @Column(name = "Broer_Zus_op_HLW")
    private Boolean broerZusOpHLW;
    private String Plaatsingswensen;

    LeerlingGegevensAanvullend(LeerlingGegevens leerlingGegevens) {
        this.leerlingGegevens = leerlingGegevens;
    }

    public String getMedischeBijzonderheden() {
        return medischeBijzonderheden;
    }

    public void setMedischeBijzonderheden(String Medische_bijzonderheden) {
        this.medischeBijzonderheden = Medische_bijzonderheden;
    }

    public String getGodsdienst() {
        return Godsdienst;
    }

    public void setGodsdienst(String Godsdienst) {
        this.Godsdienst = Godsdienst;
    }

    public Date getInNederlandSinds() {
        return inNederlandSinds;
    }

    public void setInNederlandSinds(Date inNederlandSinds) {
        this.inNederlandSinds = inNederlandSinds;
    }

    public Boolean getZwemdiploma() {
        return Zwemdiploma;
    }

    public void setZwemdiploma(Boolean zwemdiploma) {
        Zwemdiploma = zwemdiploma;
    }

    public Boolean getBroerZusOpHLW() {
        return broerZusOpHLW;
    }

    public void setBroerZusOpHLW(Boolean broerZusOpHLW) {
        this.broerZusOpHLW = broerZusOpHLW;
    }

    public Boolean getBehoefteAanBijzondereZorg() {
        return behoefteAanBijzondereZorg;
    }

    public void setBehoefteAanBijzondereZorg(Boolean Behoefte_aan_bijzondere_zorg) {
        this.behoefteAanBijzondereZorg = Behoefte_aan_bijzondere_zorg;
    }

    public String getPlaatsingswensen() {
        return Plaatsingswensen;
    }

    public void setPlaatsingswensen(String Plaatsingswensen) {
        this.Plaatsingswensen = Plaatsingswensen;
    }

    public Boolean getMedicijnGebruik() {
        return medicijnGebruik;
    }

    public void setMedicijnGebruik(Boolean medicijnGebruik) {
        this.medicijnGebruik = medicijnGebruik;
    }
}
