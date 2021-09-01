"use strict"

let randomArray = [1,2,'g6','45t',10,11,'HA','two words'];
//es6
let onlyNumbers = (val) => {
    if (typeof (val) == 'number')
        return val;
}
let theseNumbers = randomArray.filter(onlyNumbers);
document.write("<p>"+theseNumbers+"</p>")
