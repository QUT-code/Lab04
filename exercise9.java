package exercise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise9 {
    public static void main (String[] args){
        List<Integer> number = Arrays.asList(1,2,3,4,5);

        System.out.println("List: "+ number.toString());

        for(int n : number){
            System.out.println(n*n*n);
        }
    }
}
