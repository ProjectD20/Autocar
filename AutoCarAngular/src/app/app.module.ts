import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FlexLayoutModule } from '@angular/flex-layout';
import {
  MatButtonModule,
  MatCheckboxModule,
  MatTableModule,
  MatSortModule,
  MatMenuModule,
  MatIconModule,
  MatToolbarModule,
  MatListModule,
  MatCardModule,
  MatSlideToggleModule,
  MatInputModule,
  MatRadioModule,
  MatDialogModule,
} from '@angular/material';

import { RouterModule, Routes } from '@angular/router';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { AppRoutingModule, routingComponents } from './app.routes';
import { QuizzService } from './services/quizz.service';
import { AnswerComponent } from './answer/answer.component';
import { NewQuizzDialogComponent } from './start-page/new-quizz-dialog/new-quizz.dialog.component';
import { QuizzManagerComponent } from './quizz-manager/quizz-manager.component';
import { PlayQuizzComponent } from './play-quizz/play-quizz.component';
import { QuizzResultsComponent } from './quizz-results/quizz-results.component';
import { ChuckService } from './services/chuck.service';

@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    AnswerComponent,
    NewQuizzDialogComponent,
    QuizzManagerComponent,
    PlayQuizzComponent,
    QuizzResultsComponent,
  ],
  entryComponents: [NewQuizzDialogComponent],
  imports: [
    AppRoutingModule,
    BrowserModule,
    BrowserAnimationsModule,
    FlexLayoutModule,
    MatButtonModule,
    MatCheckboxModule,
    MatTableModule,
    MatSortModule,
    MatMenuModule,
    MatIconModule,
    MatToolbarModule,
    MatListModule,
    MatCardModule,
    MatSlideToggleModule,
    MatInputModule,
    MatRadioModule,
    FormsModule,
    MatDialogModule,
    HttpModule,
  ],
  providers: [QuizzService, ChuckService],
  bootstrap: [AppComponent]
})
export class AppModule { }
