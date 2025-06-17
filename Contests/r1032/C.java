// Those Who Are With Us
import java.util.Scanner;
import java.util.ArrayList;


public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> solution = new ArrayList<Integer>();

        int t = in.nextInt();

        for(int i = 0; i < t; i++){

            int n = in.nextInt();
            int m = in.nextInt();
            int[][] matrix = new int[n][m];
            int[][] initMatrix = new int[n][m];
            int[][] minMax = new int[n][m]; // min possible max value in matrix a after performing operation 

            // create the matrix
            for(int x = 0; x < n; ++x){
                for(int y = 0; y < m; ++y){

                    matrix[x][y] = in.nextInt();
                    initMatrix[x][y] = matrix[x][y];
                }
            }
            //// NOTE: THERE IS A LOGIC ERROR SOMEWHERE IN HERE THAT IS CAUSING INCORRECT SOLUTIONS
            // modify copy of matrix and find value of minMax
            int min = Integer.MAX_VALUE;
            for(int x = 0; x < n; ++x){
                for(int y = 0; y < m; ++y){

                    minMax[x][y] = performOperation(matrix, x, y);
                    if(minMax[x][y] < min){
                        min = minMax[x][y]; // smallest max value
                    }
                    //reset matrix
                    matrix = initMatrix;
                }
            }
            solution.add(min);

        }
        for(int s : solution){
            System.out.println(s);
        }
    }

    public static int performOperation(int[][] matrix, int r, int c){
        int max = -1;

        //modify the row
        for(int i = 0; i < matrix[r].length; i++){
            --matrix[r][i];
        }
        //modify the column
        for(int i = 0; i < matrix.length; i++){
            --matrix[i][c];
        }
        //fix the double count at matrix[r,c]
        ++matrix[r][c];

        //find the max value
        for(int i = 0; i < matrix.length; ++i){
            for(int j = 0; j < matrix[i].length; ++j){
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }

}
