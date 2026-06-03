 class Day2Que1 {

    public static boolean isArmStrong(int num) {
 
        int originalNum = num;
        int sum = 0;
        int n = String.valueOf(num).length();    //for power calculation

        while( num != 0){
        int lastdigit = num % 10;
        sum += Math.pow(lastdigit, n);
        num /= 10;
    }
    return sum == originalNum;
    }

    public static void main(String args[]){
       
        System.out.println(isArmStrong(153)); //true    => 1^3 + 5^3 + 3^3 = 153
        System.out.println(isArmStrong(123)); //false   => 1^3 + 2^3 + 3^3 = 36
    }
 }