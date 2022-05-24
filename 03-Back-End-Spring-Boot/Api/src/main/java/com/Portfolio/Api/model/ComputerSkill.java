package com.Portfolio.Api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ComputerSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComputerSkill;
    private String titleComputerSkill;
    private String imgComputerSkill;

    public ComputerSkill() {
    }

    public ComputerSkill(String titleComputerSkill, String imgComputerSkill) {
        this.titleComputerSkill = titleComputerSkill;
        this.imgComputerSkill = imgComputerSkill;
    }

    public Long getIdComputerSkill() {
        return idComputerSkill;
    }

    public void setIdComputerSkill(Long idComputerSkill) {
        this.idComputerSkill = idComputerSkill;
    }

    public String getTitleComputerSkill() {
        return titleComputerSkill;
    }

    public void setTitleComputerSkill(String titleComputerSkill) {
        this.titleComputerSkill = titleComputerSkill;
    }

    public String getImgComputerSkill() {
        return imgComputerSkill;
    }

    public void setImgComputerSkill(String imgComputerSkill) {
        this.imgComputerSkill = imgComputerSkill;
    }

}
