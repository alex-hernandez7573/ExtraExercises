let breadTypes = [
    'white','wheat','rye','whole wheat', 'multigrain','sourdough','pumpernickel','brioche','challah','flatbread','sprouted grain'
];
let thereBeFillings = [
    'ham','turkey','mustard','mayonnaise','relish','roast beef','chicken','cheese','lettuce','tomato'
];

let makingTheSandwhich = breadTypes.map( function (value,index){
    return"<li>"+[value, thereBeFillings[index]]+"</li>"
});


document.write("<ul>"+makingTheSandwhich+"</ul>");