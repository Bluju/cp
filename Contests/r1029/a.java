import java.util.Scanner;
import java.util.ArrayList;

public class a{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // test cases 
        ArrayList<String> Solution = new ArrayList<String>();

        for(int i = 0; i < t; ++i){
            boolean accept = true;
            int n = in.nextInt(); // number of doors
            int x = in.nextInt(); // number of seconds the button works for
            boolean buttonON = false;

            for(int j = 0; j < n; ++j){

                int a = in.nextInt();
                if(!accept) continue; // still need to read the rest of the input line before continuing

                if(x == 0 && a == 1){
                    accept = false;
                }
                if(a == 1){
                    buttonON = true;
                }
                if(buttonON && x > 0){
                    --x;
                }
                
            }

            if(accept){
                Solution.add("YES");
                
            } else{
                Solution.add("NO");
            }
        }
        for(String s : Solution){
            System.out.println(s);
        }
    }
}