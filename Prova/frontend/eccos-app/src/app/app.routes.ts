import { Routes, RouterModule } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';
import { LoginComponent } from './login/login.component';

export const routes: Routes = [
  { path: 'login', loadChildren:'app/login/login.module#LoginModule'}



];

export const AppRoutes: ModuleWithProviders = RouterModule.forRoot(routes);
