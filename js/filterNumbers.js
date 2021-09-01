"use strict"

let randomArray = [4,1,'g6','45t',6,12,'HA','two words'];
// Written e6 solution
let onlyNumbers = (val) => {
    if (typeof (val) == 'number')
        return val;
}
let theseNumbers = randomArray.filter(onlyNumbers);
let ascencdingOrder = theseNumbers.sort((a,b)=> a-b);
document.write(theseNumbers);


