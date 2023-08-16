package com.code.loanapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;

@Entity(name="amoset")
public class Amoset {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long code;
    private String c_id;
    private String f_name;
    private String location;
    private String interest;
    private String loan_amt;
    private String no_years;
    private String month_pay;
    private String total_payment;
    private String status;
    private String amt_pend;
    private String date_e;
    private String profit;

    public Amoset() {
    }

    public Amoset(long code, String c_id, String f_name, String location, String interest, String loan_amt, String no_years, String month_pay, String total_payment, String status, String amt_pend, String date_e, String profit) {
        this.code = code;
        this.c_id = c_id;
        this.f_name = f_name;
        this.location = location;
        this.interest = interest;
        this.loan_amt = loan_amt;
        this.no_years = no_years;
        this.month_pay = month_pay;
        this.total_payment = total_payment;
        this.status = status;
        this.amt_pend = amt_pend;
        this.date_e = date_e;
        this.profit = profit;
    }

    public long getCode() {
        return this.code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getC_id() {
        return this.c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getF_name() {
        return this.f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInterest() {
        return this.interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getLoan_amt() {
        return this.loan_amt;
    }

    public void setLoan_amt(String loan_amt) {
        this.loan_amt = loan_amt;
    }

    public String getNo_years() {
        return this.no_years;
    }

    public void setNo_years(String no_years) {
        this.no_years = no_years;
    }

    public String getMonth_pay() {
        return this.month_pay;
    }

    public void setMonth_pay(String month_pay) {
        this.month_pay = month_pay;
    }

    public String getTotal_payment() {
        return this.total_payment;
    }

    public void setTotal_payment(String total_payment) {
        this.total_payment = total_payment;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAmt_pend() {
        return this.amt_pend;
    }

    public void setAmt_pend(String amt_pend) {
        this.amt_pend = amt_pend;
    }

    public String getDate_e() {
        return this.date_e;
    }

    public void setDate_e(String date_e) {
        this.date_e = date_e;
    }

    public String getProfit() {
        return this.profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public Amoset code(long code) {
        setCode(code);
        return this;
    }

    public Amoset c_id(String c_id) {
        setC_id(c_id);
        return this;
    }

    public Amoset f_name(String f_name) {
        setF_name(f_name);
        return this;
    }

    public Amoset location(String location) {
        setLocation(location);
        return this;
    }

    public Amoset interest(String interest) {
        setInterest(interest);
        return this;
    }

    public Amoset loan_amt(String loan_amt) {
        setLoan_amt(loan_amt);
        return this;
    }

    public Amoset no_years(String no_years) {
        setNo_years(no_years);
        return this;
    }

    public Amoset month_pay(String month_pay) {
        setMonth_pay(month_pay);
        return this;
    }

    public Amoset total_payment(String total_payment) {
        setTotal_payment(total_payment);
        return this;
    }

    public Amoset status(String status) {
        setStatus(status);
        return this;
    }

    public Amoset amt_pend(String amt_pend) {
        setAmt_pend(amt_pend);
        return this;
    }

    public Amoset date_e(String date_e) {
        setDate_e(date_e);
        return this;
    }

    public Amoset profit(String profit) {
        setProfit(profit);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Amoset)) {
            return false;
        }
        Amoset amoset = (Amoset) o;
        return code == amoset.code && Objects.equals(c_id, amoset.c_id) && Objects.equals(f_name, amoset.f_name) && Objects.equals(location, amoset.location) && Objects.equals(interest, amoset.interest) && Objects.equals(loan_amt, amoset.loan_amt) && Objects.equals(no_years, amoset.no_years) && Objects.equals(month_pay, amoset.month_pay) && Objects.equals(total_payment, amoset.total_payment) && Objects.equals(status, amoset.status) && Objects.equals(amt_pend, amoset.amt_pend) && Objects.equals(date_e, amoset.date_e) && Objects.equals(profit, amoset.profit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, c_id, f_name, location, interest, loan_amt, no_years, month_pay, total_payment, status, amt_pend, date_e, profit);
    }

    @Override
    public String toString() {
        return "{" +
            " code='" + getCode() + "'" +
            ", c_id='" + getC_id() + "'" +
            ", f_name='" + getF_name() + "'" +
            ", location='" + getLocation() + "'" +
            ", interest='" + getInterest() + "'" +
            ", loan_amt='" + getLoan_amt() + "'" +
            ", no_years='" + getNo_years() + "'" +
            ", month_pay='" + getMonth_pay() + "'" +
            ", total_payment='" + getTotal_payment() + "'" +
            ", status='" + getStatus() + "'" +
            ", amt_pend='" + getAmt_pend() + "'" +
            ", date_e='" + getDate_e() + "'" +
            ", profit='" + getProfit() + "'" +
            "}";
    }


}