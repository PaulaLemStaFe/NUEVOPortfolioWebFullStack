import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Project } from '../models/project';

@Injectable({
  providedIn: 'root'
})
export class HomeprojectsService {

  projectURL = 'http://localhost:8080/project/';

  constructor(private http: HttpClient) { }

  public getProjects():Observable<Project[]> {
    return this.http.get<Project[]>(this.projectURL + 'all');
  }

  public getidproject(idProject: number):Observable<Project> {
    return this.http.get<Project>(this.projectURL + `getidproject/${idProject}`)
  }

  public createProject(project: Project):Observable<any>{
    return this.http.post<any>(this.projectURL + 'add', project);
  }

  public editProject(project: Project):Observable<Project>{
    return this.http.put<Project>(this.projectURL + 'edit', project);
  }

  public deleteProject(idProject: number):Observable<any>{
    return this.http.delete<any>(this.projectURL + `delete/${idProject}`);
  }
  
}