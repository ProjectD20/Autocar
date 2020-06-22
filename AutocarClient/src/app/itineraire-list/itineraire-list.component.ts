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

  itiniraires: any[][];
 private source: string;
private budjet: number;
private duree: string;
private destination: string;

constructor(private itiniraireService: ItineraireService) {
  this.source="Lille";
  this.budjet=10;
  this.duree="3h00";
  this.destination="Paris";


  }
/*
  onSubmit() {
console.log('itiniraiare list compo enter');
console.log(this.source);
console.log(this.budjet);
console.log(this.duree);
console.log(this.destination);


this.itiniraireService. RechercherItiniraires (this.source, this.budjet, this.duree).subscribe(data => {
      this. itiniraires = data;
    });

  }
  */
  ngOnInit() {
    console.log('Hello word');
  }

   async gt() {
       console.log('itiniraiare list compo enter');
       console.log(this.source);
       console.log(this.budjet);
       console.log(this.duree);
       console.log(this.destination);
       this.itiniraireService. RechercherItiniraires (this.source, this.budjet, this.duree).subscribe(data => {
      this. itiniraires = data;
      console.dir(this. itiniraires);

    });


    }

}
