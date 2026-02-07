// Que 3 : Palindrome Number

/*
9. Palindrome Number
Easy

Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
*/

const prompt = require("prompt-sync")();

let n = prompt("Enter the number: ");


//Approach 1 : By reversing the number
//TIME COMPLEXITY = O(log n) , SPACE Complexity = O(1)
function isPalindrome(x) {
    let rev = 0;
    let originalNum = x;

    //BASE CASES
    if(x < 0) return false     //Negative no. camt be palindrome
    if(x >= 0 && x < 10) return true;

    //LOGIC 
    else{
        //Reverse the number
        while(x != 0){
            let lastDigit = x % 10 
            rev = (rev * 10) + lastDigit
            x = Math.floor(x / 10); 
        }
    }
    return rev == originalNum
}

//Approch 2: Travlling upto Mid and then checking 
//TIME COMPLEXITY = O(log n) , SPACE Complexity = O(1)
function isPalindrome2(x) {
    if (x < 0 || (x % 10 === 0 && x !== 0)) return false;

    let rev = 0;
  
    while (x > rev) {    //Here it will travel upto mid 
      rev = rev * 10 + (x % 10);
      x = Math.floor(x / 10);
    }
  
    // even digits OR odd digits
    return x === rev || x === Math.floor(rev / 10);
}

console.log(`The number is Palindrome:  ${isPalindrome(n)}`);
console.log(`The number is Palindrome: ${isPalindrome2(n)}`);