package com.Portfolio.Api.dto;

public class ProjectDto {
    
    private String imgProject;
    private String titleProject;
    private String textProject;
    private String btn01urlProject;
    private String btn02urlProject;

    public ProjectDto() {
    }

    public ProjectDto(String imgProject, String titleProject, String textProject, String btn01urlProject, String btn02urlProject) {
        this.imgProject = imgProject;
        this.titleProject = titleProject;
        this.textProject = textProject;
        this.btn01urlProject = btn01urlProject;
        this.btn02urlProject = btn02urlProject;
    }

    public String getImgProject() {
        return imgProject;
    }

    public void setImgProject(String imgProject) {
        this.imgProject = imgProject;
    }

    public String getTitleProject() {
        return titleProject;
    }

    public void setTitleProject(String titleProject) {
        this.titleProject = titleProject;
    }

    public String getTextProject() {
        return textProject;
    }

    public void setTextProject(String textProject) {
        this.textProject = textProject;
    }

    public String getBtn01urlProject() {
        return btn01urlProject;
    }

    public void setBtn01urlProject(String btn01urlProject) {
        this.btn01urlProject = btn01urlProject;
    }

    public String getBtn02urlProject() {
        return btn02urlProject;
    }

    public void setBtn02urlProject(String btn02urlProject) {
        this.btn02urlProject = btn02urlProject;
    }
    
    
}
