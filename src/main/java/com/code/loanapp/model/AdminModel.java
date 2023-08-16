package com.code.loanapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity(name = "admin_model")
public class AdminModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String password;
    private String username;
    private String mynames;

    public AdminModel() {
    }

    public AdminModel(long id, String password, String username, String mynames) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.mynames = mynames;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMynames() {
        return this.mynames;
    }

    public void setMynames(String mynames) {
        this.mynames = mynames;
    }

    public AdminModel id(long id) {
        setId(id);
        return this;
    }

    public AdminModel password(String password) {
        setPassword(password);
        return this;
    }

    public AdminModel username(String username) {
        setUsername(username);
        return this;
    }

    public AdminModel mynames(String mynames) {
        setMynames(mynames);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AdminModel)) {
            return false;
        }
        AdminModel adminModel = (AdminModel) o;
        return id == adminModel.id && Objects.equals(password, adminModel.password) && Objects.equals(username, adminModel.username) && Objects.equals(mynames, adminModel.mynames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, username, mynames);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", password='" + getPassword() + "'" +
            ", username='" + getUsername() + "'" +
            ", mynames='" + getMynames() + "'" +
            "}";
    }
   
}
