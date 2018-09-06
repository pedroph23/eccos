import { Component, NgModule } from "@angular/core";
import { AppModule } from "../app.module";
import { AppRoutes } from "../app.routes";
import { RouterModule } from "@angular/router";

import {
        LoginComponent,
        loginRoute
       } from './';

@NgModule({
    imports:[
        AppModule,
        AppRoutes,
        RouterModule.forChild(loginRoute)
    ]
})
export class LoginModule{




   
}