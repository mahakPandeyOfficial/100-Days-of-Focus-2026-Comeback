class Day2Que3 {

    //Recursive function to check if a string is palindrome or not
    public static boolean isStringPalindromeRecursive(int i , String str){

        if (i >= str.length() / 2) return true;

        if(str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;

        return isStringPalindromeRecursive(i+1, str);
    }

    //Iterative approach 
    public static boolean isStringPalindromeIterative(int i , String str){
        int start = 0, end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end))  return false;

            end--;
            start++;
        }
        return true;
    }

    public static void main(String []  args){

        String str1 = "madam madam";
        String str2 = "ram is a good boy";
        System.out.println(isStringPalindromeRecursive(0, str1)); //true
        System.out.println(isStringPalindromeRecursive(0, str2)); //false
        System.out.println(isStringPalindromeIterative(0, str1)); //true
        System.out.println(isStringPalindromeIterative(0, str2)); //false
    }
}