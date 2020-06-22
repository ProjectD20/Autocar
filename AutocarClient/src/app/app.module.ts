import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
// tslint:disable-next-line: import-spacing
import { FormsModule }   from '@angular/forms';
import { DropDownsModule } from '@progress/kendo-angular-dropdowns';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ItineraireListComponent } from './itineraire-list/itineraire-list.component';
import {HttpClientModule} from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    ItineraireListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    DropDownsModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
