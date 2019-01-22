import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatIconModule} from '@angular/material/icon';
import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule, MatNativeDateModule, MatRadioModule ,MatSelectModule,MatGridListModule } from '@angular/material';
import { MatTabsModule } from '@angular/material/tabs';
import { MatTableModule } from '@angular/material/table';
import { AppComponent } from './app.component';
import { CarinformationComponent } from './carinformation/carinformation.component';
import { AppRoutingModule } from './/app-routing.module';



import {MatCheckboxModule} from '@angular/material';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';
import {MatFormFieldModule} from '@angular/material/form-field';

const appRoutes: Routes = [

];
@NgModule({
  declarations: [
    AppComponent,
    CarinformationComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    FormsModule, 
    ReactiveFormsModule,
    RouterModule.forRoot(appRoutes),
    MatTableModule,
    MatDatepickerModule,
    MatGridListModule,
    MatSelectModule,
    MatNativeDateModule,
    MatButtonModule, 
    MatCardModule, 
    MatInputModule, 
    MatListModule,
    MatToolbarModule,
    MatTabsModule,
    AppRoutingModule,
    MatFormFieldModule,
    MatCheckboxModule,
    NoopAnimationsModule,
    MatRadioModule,
    MatIconModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
