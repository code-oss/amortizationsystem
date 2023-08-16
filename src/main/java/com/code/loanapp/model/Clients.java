package com.code.loanapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String middlename;
    private String sirname;
    private String spousename;
    private String civilstatus;
    private String dateob;
    private String datreg;
    private String email;
    private String contact;
    private String gender;
    private String address;
    private String representative;
    private String agent;
    private String citizenship;
    private String block;
    private String lot;
    private String phase;
    private String persq;
    private String location;
    private String nolot;
    private String lotarea;
    private String tcp;
    private String monthpay;
    private String payable;
    private String cts;

    public Clients(){

    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return this.middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getSirname() {
        return this.sirname;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    public String getSpousename() {
        return this.spousename;
    }

    public void setSpousename(String spousename) {
        this.spousename = spousename;
    }

    public String getCivilstatus() {
        return this.civilstatus;
    }

    public void setCivilstatus(String civilstatus) {
        this.civilstatus = civilstatus;
    }

    public String getDateob() {
        return this.dateob;
    }

    public void setDateob(String dateob) {
        this.dateob = dateob;
    }

    public String getDatreg() {
        return this.datreg;
    }

    public void setDatreg(String datreg) {
        this.datreg = datreg;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRepresentative() {
        return this.representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getAgent() {
        return this.agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getCitizenship() {
        return this.citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getBlock() {
        return this.block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLot() {
        return this.lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getPersq() {
        return this.persq;
    }

    public void setPersq(String persq) {
        this.persq = persq;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNolot() {
        return this.nolot;
    }

    public void setNolot(String nolot) {
        this.nolot = nolot;
    }

    public String getLotarea() {
        return this.lotarea;
    }

    public void setLotarea(String lotarea) {
        this.lotarea = lotarea;
    }

    public String getTcp() {
        return this.tcp;
    }

    public void setTcp(String tcp) {
        this.tcp = tcp;
    }

    public String getMonthpay() {
        return this.monthpay;
    }

    public void setMonthpay(String monthpay) {
        this.monthpay = monthpay;
    }

    public String getPayable() {
        return this.payable;
    }

    public void setPayable(String payable) {
        this.payable = payable;
    }

    public String getCts() {
        return this.cts;
    }

    public void setCts(String cts) {
        this.cts = cts;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstname='" + getFirstname() + "'" +
            ", middlename='" + getMiddlename() + "'" +
            ", sirname='" + getSirname() + "'" +
            ", spousename='" + getSpousename() + "'" +
            ", civilstatus='" + getCivilstatus() + "'" +
            ", dateob='" + getDateob() + "'" +
            ", datreg='" + getDatreg() + "'" +
            ", email='" + getEmail() + "'" +
            ", contact='" + getContact() + "'" +
            ", gender='" + getGender() + "'" +
            ", address='" + getAddress() + "'" +
            ", representative='" + getRepresentative() + "'" +
            ", agent='" + getAgent() + "'" +
            ", citizenship='" + getCitizenship() + "'" +
            ", block='" + getBlock() + "'" +
            ", lot='" + getLot() + "'" +
            ", phase='" + getPhase() + "'" +
            ", persq='" + getPersq() + "'" +
            ", location='" + getLocation() + "'" +
            ", nolot='" + getNolot() + "'" +
            ", lotarea='" + getLotarea() + "'" +
            ", tcp='" + getTcp() + "'" +
            ", monthpay='" + getMonthpay() + "'" +
            ", payable='" + getPayable() + "'" +
            ", cts='" + getCts() + "'" +
            "}";
    }
    
    
}
