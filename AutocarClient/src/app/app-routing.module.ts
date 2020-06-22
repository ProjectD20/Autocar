import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItineraireListComponent } from './itineraire-list/itineraire-list.component';

const routes: Routes = [
  { path: 'itineraire', component: ItineraireListComponent },
  { path: 'addville', component: ItineraireListComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
