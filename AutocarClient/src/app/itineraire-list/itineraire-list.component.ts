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
  itiniraires: string[][];
 private source: string;
private budjet: number;
private duree: string;
public listItems: Array<string> = ['3h00', '3h30', '4h00', '4h30', '5h00', '5h30'];
form = new FormGroup({
    source: new FormControl('', Validators.required),
    budjet: new FormControl('', Validators.required),
    duree : new FormControl('', Validators.required)
   });
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
