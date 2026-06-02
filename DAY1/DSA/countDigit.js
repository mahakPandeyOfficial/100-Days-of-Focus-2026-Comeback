/* Count all Digits of a Number
Easy

Company
You are given an integer n. You need to return the number of digits in the number.

The number will have no leading zeroes, except when the number is 0 itself.

Example 1

Input: n = 4

Output: 1

Explanation: There is only 1 digit in 4.

Example 2

Input: n = 14

Output: 2

Explanation: There are 2 digits in 14.

*/
const prompt = require("prompt-sync")();

let n = prompt("Enter the number: ");

function countDigit(n) {
    return String(n).length;  //It convert it into String and find the length of it and return it.
}

console.log(`The number of digits: ${countDigit(n)}`);


// TIME COMPLEXITY : O(N)
// SPACE COMPLEXITY: O(1)
