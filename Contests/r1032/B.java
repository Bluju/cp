// Above the Clouds
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> freq = new HashMap<String,Integer>();
        ArrayList<String> solution = new ArrayList<String>();
        int t = in.nextInt();
        //two instances of a letter where 1 instance is either at the start or end of string, the other is in between or both are in between

        for(int i = 0; i < t; ++i){
            int n = in.nextInt();
            String s = in.next();
            boolean sFound = false;

            for(int j = 1; j < n - 1; ++j){
                String a = s.substring(j,j+1);
                if(freq.isEmpty() || !freq.containsKey(a)){
                    freq.put( a, 1 );
                } else{
                    // at least two instances of the letter exist
                    solution.add("YES");
                    sFound = true;
                    break;
                }
                if((a.equals(s.substring(0,1)) || (a.equals(s.substring(s.length()-1)))) ){
                    solution.add("YES");
                    sFound = true;
                    break;
                } 
            }
            if(!sFound){
                solution.add("NO");
            }
            freq.clear();
        }

        for( String s : solution){
            System.out.println(s);
        }
    }
}
