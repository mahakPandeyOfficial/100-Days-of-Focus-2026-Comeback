//QUE 1: Palindrome No.

class Day1Que1 {

    // APROACH 1 : Reverse full number and compare with original number
     public static boolean isPalindrome(int x){
        int revNo = 0;
        int originalNo = x;

        if(x < 0 || x % 10 == 0 && x != 0) return false;
        else if(x >= 0 && x < 10) return true;

        else {
            while(x != 0){
                int lastdigit = x % 10;
                revNo = (revNo * 10) + lastdigit;
                x = x/10;
            }
        }
        if(revNo == originalNo) return true;
        else return false;
    }

    //APPROACH 2 : Reverse half of the number and compare with other half of the number
    //GOOD for : Overflow check and also we can avoid reversing the whole number if it is not a palindrome
    public static boolean isPalindromeHalfRev(int x) {
        int revHalfNo = 0;

        if(x < 0 || x % 10 == 0 && x != 0) return false;

        else{
            while(x  > revHalfNo){
                revHalfNo = (revHalfNo * 10) + (x % 10) ;
                x /= 10;
            }
        }
        return (x == revHalfNo  || x == revHalfNo/10);
        
    }

    public static void main (String[] args){

        System.out.println(isPalindrome(121));  //true
        System.out.println(isPalindrome(1231));  //false 
        System.out.println(isPalindrome(1598951)); //true
        System.out.println(isPalindromeHalfRev(1));  //true
        System.out.println(isPalindromeHalfRev(-121));  //false
        System.out.println(isPalindromeHalfRev(0));  //true
    }
}
