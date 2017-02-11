import {Component} from '@angular/core';
@Component({
    selector: 'pm-app',
    template:`
<div><h1>{{pageTitle}}</h1>
<div>My first component</div>
<pm-products></pm-products>
</div>
`
})
export class AppComponent{
    pageTitle:string = "Acme Product Manager";
}