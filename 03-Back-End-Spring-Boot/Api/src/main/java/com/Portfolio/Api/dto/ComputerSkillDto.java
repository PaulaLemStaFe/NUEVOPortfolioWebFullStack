package com.Portfolio.Api.dto;

public class ComputerSkillDto {
    
    private String titleComputerSkill;
    private String imgComputerSkill;

    public ComputerSkillDto() {
    }

    public ComputerSkillDto(String titleComputerSkill, String imgComputerSkill) {
        this.titleComputerSkill = titleComputerSkill;
        this.imgComputerSkill = imgComputerSkill;
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
