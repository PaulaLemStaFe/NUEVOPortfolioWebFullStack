import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';
import { HomeuserService } from 'src/app/services/homeuser.service';

@Component({
  selector: 'app-homebanner',
  templateUrl: './homebanner.component.html',
  styleUrls: ['./homebanner.component.css']
})
export class HomebannerComponent implements OnInit {

  public user: User | undefined;

  public editUser: User | undefined;

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
