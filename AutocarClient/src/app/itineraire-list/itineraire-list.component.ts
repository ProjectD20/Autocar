import { Component, OnInit } from '@angular/core';
import { ItineraireService } from '../service/itineraire.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-itineraire-list',
  templateUrl: './itineraire-list.component.html',
  styleUrls: ['./itineraire-list.component.scss']
})
export class ItineraireListComponent implements OnInit {
  ///declarations
    public selectedAlgorithm = "SHA-256";

  itiniraires: string[][];
 private source: string;
private budjet: number;
private duree: string;

    constructor(private itiniraireService: ItineraireService) {
  }
  
  onSubmit() {
console.log('itiniraiare list compo enter');

this.itiniraireService. RechercherItiniraires (this.source, this.budjet, this.duree).subscribe(data => {
      this. itiniraires = data;
    });
  }
  ngOnInit() {
    console.log('Hello word');
  }

}
