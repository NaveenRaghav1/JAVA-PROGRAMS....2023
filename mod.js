//this is custom module created by me.....
console.log("this is a module which i created-->");
function average(arr) {
    let sum = 0;
    arr.forEach(element => {
        sum += element;
    });
    return sum / arr.length;
}
module.exports = average;