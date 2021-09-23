"use strict";

let hasDriverslicense = false;
const passTest = true;

if (passTest) hasDriverslicense = true;
if (hasDriverslicense) console.log("I can drive");

// const interface = 'audio'
// const private = 534;
// why we use strict mode

function logger () {
    console.log("my name is alex");
}
logger();
logger();
logger();

function fruitProcessor (apples, oranges) {
    console.log(apples, oranges);
    const juice = `Juice with ${apples} apples and ${oranges} oranges.`;
    return juice;
}

const appleJuice =fruitProcessor(5,0);
console.log(appleJuice);