package com.kotlinseries.simple_listviewapp


//a model class is typically is used to model the data in your application
//The data in your application,so this is a template eg you can write a modelclass
//that mirrors a database table,JSON file,listitems for the widget
//You can get data like strings,Integers
//It is for modeling data
class Countrymodel {
    var name:String=""
    var Description:String=""
    var flag:Int= 0

    constructor(name:String,Description:String,flag:Int){
        this.name=name
        this.Description=Description
        this.flag=flag
    }
}