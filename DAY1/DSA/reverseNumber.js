/* 
7. Reverse Integer
Medium

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
*/

const prompt = require("prompt-sync")();

let n = prompt("Enter the number you want to reverse: ");

//APROACH 1 : Using string
function reverse (n) {
   let isNegative = false;
   if( n < 0) {
       isNegative = true;
       n = n.slice(1);
   }
   let ans = "";
   for(let i = n.length - 1; i>=0 ; i--){
       ans += n[i];
   }
   return isNegative ? -ans : ans;
}

//TIME COMPLEXITY = O(N) , SPACE Complexity = O(N)

//APPROACH 2 : using Math
function reverse2 (x) {
    let sign = x < 0 ? -1 : 1;
    x = Math.abs(x);

    let rev = 0;

    while (x > 0) {   //Taking out last digit
        let digit = x % 10;
        rev = rev * 10 + digit;
        x = Math.floor(x / 10);
    }

    return rev *= sign;    
}

//TIME COMPLEXITY = O(N) , SPACE Complexity = O(1)

console.log(`Reversed Number by Approach 1 is -> ${reverse(n)}`)
console.log(`Reversed Number by Approach 2 is -> ${reverse2(n)}`)