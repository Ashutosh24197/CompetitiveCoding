/* problem https://www.hackerrank.com/challenges/js10-bitwise/problem  */

/* solution */

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}
function getMaxLessThanK(n,k){
    if((k|(k-1))>n){
        return k-2;
    }else{
        return k-1;
    }
}
