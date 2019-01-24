import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";


@Injectable()

export class Controller {
public API = '//localhost:8080';

constructor(
            private http:HttpClient
    ){}
      getGender(): Observable<any> {
      return this.http.get(this.API + '/Gender');
      }

    
      getCarbrand(): Observable<any>{
        return this.http.get(this.API + '/Car');
      }

      getProvince(): Observable<any> {
        return this.http.get(this.API + '/Province');
        }
      
      getCarInformation(): Observable<any> {
          return this.http.get(this.API + '/CarInformation');
          }
      }

