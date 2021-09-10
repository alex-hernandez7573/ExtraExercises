"use strict"
//warm up
// function for coin flipping


document.getElementById('click').onclick = click;

let heads = 0;
let tails = 0;
function click() {
    let x = (Math.floor(Math.random() * 2) == 0);
    if(x){
        flip("<img src='https://static.thenounproject.com/png/607426-200.png'>");
    }else{
        flip("<img src='https://static.thenounproject.com/png/607428-200.png'>");
    }
};
function flip(coin) {
    document.getElementById("result").innerHTML = coin;
};

