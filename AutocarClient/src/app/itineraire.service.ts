import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ItineraireService {
    private ItiniraireUrl: string;

  constructor(private http: HttpClient) {

    this.ItiniraireUrl = 'http://localhost:8080/GetItiniraires' ;
  }

  public RechercherItiniraires(): Observable<any[]> {
    return this.http.get<any[]>(this.ItiniraireUrl
, {
      params: {
Destination: 'id1234',
Source: 'id1234',
min: 'id1234',
MAX: '5'
      }
    }
);
  }
}
