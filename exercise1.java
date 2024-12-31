package exercise;
import java.util.Scanner;
import java.util.function.Function;

public class exercise1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
    System.out.println("Please input a number for variable a: " );
    int variableA = input.nextInt();

    System.out.println("Please input a number for variable b: ");
    int variableB = input.nextInt();

    int sum = 0;
    for(int i= variableA; i <= variableB; i++){
        //compare
        if(i % 2 ==0){
            sum += i;
        System.out.println(i);
        }

    }
        System.out.println("The even number from "+variableA+ " to " +variableB+ "is: "+sum);
    }
    }

