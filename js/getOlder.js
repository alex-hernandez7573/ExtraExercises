"use strict"

let persons = [
    {
        name :'albert', age : 12},
    {
        name:'trevor', age : 51},
    {
        name:'austin', age : 28},
    {
        name:'alex', age : 56 },
    {
        name:'tucker', age : 34},
    {
        name:'kayla', age : 45},
    {
        name:'tina', age : 33},
    {
        name:'josh', age : 21 }
];

persons.forEach( function (name){
    let addOne = name.age+1;
    document.writeln( "<p> name: "+ name.name  +" age: "+ addOne +"</p>");
})

persons.forEach( function (name){
    document.writeln( "<p> *Orignal* name: "+ name.name  +" age: "+ name.age +"</p>");
})