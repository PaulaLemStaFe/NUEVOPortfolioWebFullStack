export class Project {
    idProject:number;
    imgProject:string;
    titleProject:string;
    textProject:string;
    btn01urlProject:string;
    btn02urlProject:string;

    constructor(idProject:number, imgProject:string, titleProject:string, textProject:string, btn01urlProject:string, btn02urlProject:string) {
        this.idProject = idProject;
        this.imgProject = imgProject;
        this.titleProject = titleProject;
        this.textProject = textProject;
        this.btn01urlProject = btn01urlProject;
        this.btn02urlProject = btn02urlProject;
    }
}
