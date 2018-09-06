import { Component, ViewChild } from "@angular/core";
import { Router } from "@angular/router";

@Component({
    selector: 'login',
    templateUrl: './login.component.html'
})
export class LoginComponent{
    
    constructor(
        private router: Router,
    ){}



}
