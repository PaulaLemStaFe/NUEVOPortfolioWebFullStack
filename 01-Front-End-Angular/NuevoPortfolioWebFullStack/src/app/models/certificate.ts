export class Certificate {
    idCertificate:number;
    imgCertificate:string;
    titleCertificate:string;
    obtainedCertificate:string;

    constructor(idCertificate:number, imgCertificate:string, titleCertificate:string, obtainedCertificate:string) {
        this.idCertificate = idCertificate;
        this.imgCertificate = imgCertificate;
        this.titleCertificate = titleCertificate;
        this.obtainedCertificate = obtainedCertificate;
    }
}
