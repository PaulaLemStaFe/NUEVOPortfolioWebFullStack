import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Computerskill } from 'src/app/models/computerskill';
import { HomecomputerskillsService } from 'src/app/services/homecomputerskills.service';

@Component({
  selector: 'app-editioncomputerskills',
  templateUrl: './editioncomputerskills.component.html',
  styleUrls: ['./editioncomputerskills.component.css']
})
export class EditioncomputerskillsComponent implements OnInit {

  computerskills: Computerskill[] = [];
  editComputerskill: Computerskill | undefined;
  deleteComputerskill: Computerskill | undefined;

  constructor(private computerskillsService: HomecomputerskillsService) { }

  ngOnInit(): void {
    this.getComputerskills();
  }

  getComputerskills(): void {
    this.computerskillsService.getComputerSkills().subscribe(
      data => {
        this.computerskills = data;
      },
      error => {
        console.log(error);
      }
    )
  }

  public onOpenModal(mode: String, computerskill?: Computerskill): void {
    const container = document.getElementById('main-container');
    const button = document.createElement('buttoon');
    //button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');
    if (mode === 'add') {
      button.setAttribute('data-target', '#addComputerskillModal');
    } else if (mode === 'delete') {
      button.setAttribute('data-target', '#deleteComputerskillModal');
      this.deleteComputerskill = computerskill;
    } else if (mode === 'edit') {
      button.setAttribute('data-target', '#editComputerskillModal');
      this.editComputerskill = computerskill;
    }
    container?.appendChild(button);
    button.click();
  }

  public onAddComputerskill(addForm: NgForm): void {
    document.getElementById('addComputerskillModal')?.click();
    this.computerskillsService.createComputerSkill(addForm.value).subscribe({
      next: (response:Computerskill) => {
        this.getComputerskills();
        addForm.reset();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
        addForm.reset();
      }
    })
  }

  public onEditComputerskill(computerskill: Computerskill){
    this.editComputerskill=computerskill;
    document.getElementById('editComputerskillModal')?.click();
    this.computerskillsService.editComputerSkill(computerskill).subscribe({
      next: (response:Computerskill) => {
        console.log(response);
        this.getComputerskills();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public onDeleteComputerskill(idComputerSkill:number) {
    this.computerskillsService.deleteComputerSkill(idComputerSkill).subscribe({
      next: (response:void)=>{
        this.getComputerskills();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

}