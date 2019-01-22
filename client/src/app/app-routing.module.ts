import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CarinformationComponent } from './carinformation/carinformation.component';



import {  Routes } from '@angular/router';
import {RouterModule} from '@angular/router';


const routes: Routes = [
{ path: 'carinformation', component: CarinformationComponent},


{path: '',redirectTo: 'login', pathMatch: 'full'},

];

@NgModule({
  imports: [
    CommonModule,
 RouterModule.forRoot(routes),
  ],
  declarations: []
})
export class AppRoutingModule { }
