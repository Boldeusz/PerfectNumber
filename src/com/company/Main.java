package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPerfectNumber(6));
    }
    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
//        int divisor = 0;
        int sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){

                sum += i;
            }
            if (number == sum){
                return true;
            }
        }
        return false;
    }
}
