import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

const httpOptions = {
  header: new HttpHeaders({ 'Content-Type': 'application/json'})
};

@Injectable()
export class BikeService {

  constructor( private http: HttpClient) { }

  getBikes() {
    return this.http.get('server/api/v1/bikes');
  }

  getBike(id: number) {
    return this.http.get('server/api/v1/bikes' + id);
  }

  createBikeRegistration(bike) {
    let body = JSON.stringify(bike);
    return this.http.post('server/apo/v1/bikes', body, httpOptions);
  }

}
