import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EditionComponent } from './components/edition/edition.component';
import { HomeComponent } from './components/home/home.component';
import { HomebannerComponent } from './components/homebanner/homebanner.component';
import { HomecertificatesComponent } from './components/homecertificates/homecertificates.component';
import { HomecomputerskillsComponent } from './components/homecomputerskills/homecomputerskills.component';
import { HomeexperiencesComponent } from './components/homeexperiences/homeexperiences.component';
import { HomefooterComponent } from './components/homefooter/homefooter.component';
import { HomeheaderComponent } from './components/homeheader/homeheader.component';
import { HomelifelessonsComponent } from './components/homelifelessons/homelifelessons.component';
import { HomeprojectsComponent } from './components/homeprojects/homeprojects.component';
import { HomesoftskillsComponent } from './components/homesoftskills/homesoftskills.component';
import { HomewhoiamComponent } from './components/homewhoiam/homewhoiam.component';
import { LoginComponent } from './components/login/login.component';
import { LoginbannerComponent } from './components/loginbanner/loginbanner.component';
import { LoginformComponent } from './components/loginform/loginform.component';
import { EditionbannerComponent } from './components/editionbanner/editionbanner.component';
import { EditioncertificatesComponent } from './components/editioncertificates/editioncertificates.component';
import { EditioncomputerskillsComponent } from './components/editioncomputerskills/editioncomputerskills.component';
import { EditionexperiencesComponent } from './components/editionexperiences/editionexperiences.component';
import { EditionfooterComponent } from './components/editionfooter/editionfooter.component';
import { EditionheaderComponent } from './components/editionheader/editionheader.component';
import { EditionlifelessonsComponent } from './components/editionlifelessons/editionlifelessons.component';
import { EditionprojectsComponent } from './components/editionprojects/editionprojects.component';
import { EditionsoftskillsComponent } from './components/editionsoftskills/editionsoftskills.component';
import { EditionwhoiamComponent } from './components/editionwhoiam/editionwhoiam.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    EditionComponent,
    HomebannerComponent,
    HomecertificatesComponent,
    HomecomputerskillsComponent,
    HomeexperiencesComponent,
    HomefooterComponent,
    HomeheaderComponent,
    HomelifelessonsComponent,
    HomeprojectsComponent,
    HomesoftskillsComponent,
    HomewhoiamComponent,
    LoginbannerComponent,
    LoginformComponent,
    EditionbannerComponent,
    EditioncertificatesComponent,
    EditioncomputerskillsComponent,
    EditionexperiencesComponent,
    EditionfooterComponent,
    EditionheaderComponent,
    EditionlifelessonsComponent,
    EditionprojectsComponent,
    EditionsoftskillsComponent,
    EditionwhoiamComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
