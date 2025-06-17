// Letter Home
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class A{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Integer> solution = new ArrayList<Integer>();
        
        for(int i = 0; i < t; ++i){

            int n = in.nextInt();
            int s = in.nextInt();
            ArrayList<Integer> x = new ArrayList<Integer>();

            for(int j = 0; j < n; ++j){
                x.add(in.nextInt());
            }

            if(n == 1){
                solution.add(Math.abs(s - x.get(0)));
                continue;
            }

            if(s < x.get(0)){
                solution.add(Math.abs(s - x.get(x.size()-1)));
                continue;
            }
            if(s > x.get(x.size()-1)){
                solution.add(s - x.get(0));
                continue;
            }

            if(Math.abs(s - x.get(0)) <= Math.abs(s - x.get(x.size()-1))){
                // go left then right
                solution.add( (s-x.get(0))*2 + Math.abs(s - x.get(x.size()-1)) );

            } else{
                // go right then left
                solution.add( Math.abs(s - x.get(x.size()-1))*2 + (s-x.get(0)));
            }
        }

        for(int xi : solution){
            System.out.println(xi);
        }
    }
}