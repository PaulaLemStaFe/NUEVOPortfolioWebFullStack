import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';
import { HomeuserService } from 'src/app/services/homeuser.service';

@Component({
  selector: 'app-editionwhoiam',
  templateUrl: './editionwhoiam.component.html',
  styleUrls: ['./editionwhoiam.component.css']
})
export class EditionwhoiamComponent implements OnInit {

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
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public onOpenModal(mode: String, user?: User): void {
    const container = document.getElementById('main-container');
    const button = document.createElement('buttoon');
    //button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');
    if (mode==='edit') {
      this.editUser = user;
      button.setAttribute('data-target', '#ediWhoiamModal');
    }
    container?.appendChild(button);
    button.click();
  }

  public onEditUser(user: User){
    this.editUser=user;
    document.getElementById('editWhoiamModal')?.click();
    this.homeuserService.editUser(user).subscribe({
      next: (response:User) => {
        console.log(response);
        this.getUser();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

}
