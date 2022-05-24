import { Component, OnInit } from '@angular/core';
import { Computerskill } from 'src/app/models/computerskill';
import { HomecomputerskillsService } from 'src/app/services/homecomputerskills.service';

@Component({
  selector: 'app-homecomputerskills',
  templateUrl: './homecomputerskills.component.html',
  styleUrls: ['./homecomputerskills.component.css']
})
export class HomecomputerskillsComponent implements OnInit {

  computeskills: Computerskill[] = [];

  constructor(private computerskillService: HomecomputerskillsService) { }

  ngOnInit(): void {
    this.getComputerSkills();
  }

  getComputerSkills(): void {
    this.computerskillService.getComputerSkills().subscribe(
      data => {
        this.computeskills = data;
      },
      error => {
        console.log(error);
      }
    )
  }

}
