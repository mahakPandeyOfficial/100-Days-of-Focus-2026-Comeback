//Fibonacci Series

class Day3Que1 {

    public static int fibonacci(int n ){
        if(n == 0 || n == 1) return n;

        return fibonacci(n -1) + fibonacci(n - 2);
    }

    public static void main(String [] args){
        System.out.println(fibonacci(5));  // Output 5
        System.out.println(fibonacci(10));  //output 55
        System.out.println(fibonacci(15));  //output 610

    }
}