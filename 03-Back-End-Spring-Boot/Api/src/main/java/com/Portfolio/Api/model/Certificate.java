package com.Portfolio.Api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Certificate {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCertificate;
    private String imgCertificate;
    private String titleCertificate;
    private String obtainedCertificate;

    public Certificate() {
    }

    public Certificate(String imgCertificate, String titleCertificate, String obtainedCertificate) {
        this.imgCertificate = imgCertificate;
        this.titleCertificate = titleCertificate;
        this.obtainedCertificate = obtainedCertificate;
    }

    public Long getIdCertificate() {
        return idCertificate;
    }

    public void setIdCertificate(Long idCertificate) {
        this.idCertificate = idCertificate;
    }

    public String getImgCertificate() {
        return imgCertificate;
    }

    public void setImgCertificate(String imgCertificate) {
        this.imgCertificate = imgCertificate;
    }

    public String getTitleCertificate() {
        return titleCertificate;
    }

    public void setTitleCertificate(String titleCertificate) {
        this.titleCertificate = titleCertificate;
    }

    public String getObtainedCertificate() {
        return obtainedCertificate;
    }

    public void setObtainedCertificate(String obtainedCertificate) {
        this.obtainedCertificate = obtainedCertificate;
    }
    
    
    
    
}
