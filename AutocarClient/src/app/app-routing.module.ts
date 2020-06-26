import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItineraireListComponent } from './itineraire-list/itineraire-list.component';
import {AjouterVilleComponent} from './ajouter-ville/ajouter-ville.component';
import { from } from 'rxjs';
const routes: Routes = [
  { path: 'itineraire', component: ItineraireListComponent },
  { path: 'addville', component: AjouterVilleComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
