import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class HomeuserService {

  private apiServerUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  public getUser():Observable<User>{
    return this.http.get<User>(`${this.apiServerUrl}/user/getiduser/1`);
  };

  public editUser(user: User):Observable<any>{
    return this.http.put<any>(`${this.apiServerUrl}/user/edit/1`, user); 
  }

}
