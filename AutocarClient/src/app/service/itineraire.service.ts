import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { JsonPipe } from '@angular/common';

@Injectable({
  providedIn: 'root'
})
export class ItineraireService {
    private ItiniraireUrl: string;
  private params :HttpParams;
  constructor(private http: HttpClient) {
    
    this.ItiniraireUrl = 'http://localhost:8080/GetItiniraires' ;
    this.params=new HttpParams();
  }
// doit etre refaite dans la phase final avec des parametres dynamique venant du composant qui permet recherche itineraire
  public RechercherItiniraires(source: string, budjet: number, duree : string): Observable<any[]> {
    //stringify budjet 
    let budjets = budjet.toString();
this.params.set('Source',source);
this.params.set('Budjet',budjets);
this.params.set('Duree', duree);

    return this.http.get<any[]>(this.ItiniraireUrl, { params: this.params});
}
}