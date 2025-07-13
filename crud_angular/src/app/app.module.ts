import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PostCustomerComponent } from './components/post-customer/post-customer.component';
import { GetAllCustomerComponent } from './components/get-all-customer/get-all-customer.component';
import { UpdateCustomerComponent } from './components/update-customer/update-customer.component';

@NgModule({
  declarations: [
    AppComponent,
    PostCustomerComponent,
    GetAllCustomerComponent,
    UpdateCustomerComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
