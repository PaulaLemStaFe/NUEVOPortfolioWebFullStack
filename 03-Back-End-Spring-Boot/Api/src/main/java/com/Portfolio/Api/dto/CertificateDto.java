package com.Portfolio.Api.dto;

public class CertificateDto {
    
    private String imgCertificate;
    private String titleCertificate;
    private String obtainedCertificate;

    public CertificateDto() {
    }

    public CertificateDto(String imgCertificate, String titleCertificate, String obtainedCertificate) {
        this.imgCertificate = imgCertificate;
        this.titleCertificate = titleCertificate;
        this.obtainedCertificate = obtainedCertificate;
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
