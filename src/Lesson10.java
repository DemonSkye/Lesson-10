import java.util.Scanner;

public class Lesson10 {
    public static void main(String args[]){
        //Nested loops
        /*
          Use nested loops to create the following:
          allow the user to determine how large it is..
          1
          12
          123
          1234
          12345
          1234
          123
          12
          1
         */


        //     6
        //    565
        //   45654
        //    ...
        Scanner scan = new Scanner(System.in);

        int i=1;

        //Allow a user to enter the maximum number
        System.out.println("Input a number between 0 and 9");
        int target = scan.nextInt();

        //Outer loop, is the line counter
        for(; i<= target; i++){
            //Inner loop is in charge out counting on each line and outputting the numbers
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            //We need a line break in order to keep the shape growing as we want it to (in the outer loop)
            System.out.println();
        }

        //We start with the max value (target) and we're counting to 0
        for(i= target-1; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
