import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';
import { HomeuserService } from 'src/app/services/homeuser.service';

@Component({
  selector: 'app-loginbanner',
  templateUrl: './loginbanner.component.html',
  styleUrls: ['./loginbanner.component.css']
})
export class LoginbannerComponent implements OnInit {

  public user: User | undefined;

  constructor(private homeuserService: HomeuserService) { }

  ngOnInit(): void {
    this.getUser();
  }

  public getUser(): void {
    this.homeuserService.getUser().subscribe({
      next: (response: User) => {
        this.user = response;
        console.log(response);
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

}
