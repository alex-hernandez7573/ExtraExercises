"use strict"
// made sure the array had numbers in different places
let randomArray = [4,1,'g6','45t',6,12,'HA','two words'];
// Written e6 solution
let onlyNumbers = (val) => {
    if (typeof (val) == 'number')
        return val;
}
let theseNumbers = randomArray.filter(onlyNumbers);
// ascencding order for the array
let ascencdingOrder = theseNumbers.sort((a,b)=> a-b);
document.write(theseNumbers);
document.write("<br>");
document.write("<br>");
document.write("Original Array: "+randomArray);


