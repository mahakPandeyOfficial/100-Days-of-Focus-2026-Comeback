class Day2Que2 {
    
    public static boolean isPrime(int num){

        int count = 0;

        //Moving from 1 to n and counting the factors 
        /* 

        for(int i = 1; i <= num; i++){
            if(num % i == 0) count++;
        }

        */

        //Moving from 1 to sqrt of n and counting factors
        for(int i = 1; i<= Math.sqrt(num); i++){
            if(num % i  == 0) {
                count ++;

                //if the numner is not perfect square then we will have 2 factors for each i (i and num/i)
                if(num / i != i) count++;

            }
        }

     return count == 2;
    }


    public static void main(String[] args){
       
        System.out.println(isPrime(11)); //true
        System.out.println(isPrime(15)); //false
        System.out.println(isPrime(2));  //true
        System.out.println(isPrime(1));  //false

    }
}
