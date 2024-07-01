package org.example.entitty;

import java.util.List;

public class EmpInfo {

    private Integer id;
    private String ename;
    private String ecity;
    private String eage;
    private String edept;
    private List<String> emails;
    private Address eaddress;

    public EmpInfo(Integer id, String ename, String ecity, String eage, String edept, List<String> emails, Address eaddress) {
        this.id = id;
        this.ename = ename;
        this.ecity = ecity;
        this.eage = eage;
        this.edept = edept;
        this.emails = emails;
        this.eaddress = eaddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEcity() {
        return ecity;
    }

    public void setEcity(String ecity) {
        this.ecity = ecity;
    }

    public String getEage() {
        return eage;
    }

    public void setEage(String eage) {
        this.eage = eage;
    }

    public String getEdept() {
        return edept;
    }

    public void setEdept(String edept) {
        this.edept = edept;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public Address getEaddress() {
        return eaddress;
    }

    public void setEaddress(Address eaddress) {
        this.eaddress = eaddress;
    }

    @Override
    public String toString() {
        return "EmpInfo{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", ecity='" + ecity + '\'' +
                ", eage='" + eage + '\'' +
                ", edept='" + edept + '\'' +
                ", emails=" + emails +
                ", eaddress=" + eaddress +
                '}';
    }
}
