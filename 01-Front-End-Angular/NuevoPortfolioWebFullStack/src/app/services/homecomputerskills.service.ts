import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Computerskill } from '../models/computerskill';

@Injectable({
  providedIn: 'root'
})
export class HomecomputerskillsService {

  computerskillURL = 'http://localhost:8080/computerskill/';

  constructor(private http: HttpClient) { }

  public getComputerSkills():Observable<Computerskill[]> {
    return this.http.get<Computerskill[]>(this.computerskillURL + 'all');
  }

  public getidcomputerskill(idComputerSkill: number):Observable<Computerskill> {
    return this.http.get<Computerskill>(this.computerskillURL + `getidcomputerskill/${idComputerSkill}`)
  }

  public createComputerSkill(computerskill: Computerskill):Observable<any>{
    return this.http.post<any>(this.computerskillURL + 'add', computerskill);
  }

  public editComputerSkill(computerskill: Computerskill):Observable<Computerskill>{
    return this.http.put<Computerskill>(this.computerskillURL + 'edit', computerskill);
  }

  public deleteComputerSkill(idComputerSkill: number):Observable<any>{
    return this.http.delete<any>(this.computerskillURL + `delete/${idComputerSkill}`);
  }
  
}