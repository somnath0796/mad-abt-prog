/**
 *NumberGuesser: Guesses the number thought by user
 * @author RA1411008010023/Somnath
 * @version 1.0
 * @Copyright Self 
 */
package numberguesser;

import java.util.Scanner;

class NG_Call{
    int first;
    int mid;
    int last;
    String choice;
    
    Scanner sc = new Scanner(System.in);

    public NG_Call(int lower_lim, int higher_lim) {
        first = lower_lim;
        mid = 0;
        last = higher_lim;
        choice = "";
    }
       
    void compute(){
        mid = (first+last)/2;
        
        OUTER:
        do {
            System.out.println("Is your number "+mid+" ?");
            choice = sc.next().toLowerCase();
            switch (choice) {
                case "low":
                    last = mid-1;
                    break;
                case "high":
                    first = mid+1;
                    break;
                case "yes":
                    System.out.println("Yeaay!!");
                    break OUTER;
                
            }
            mid = (first+last)/2;
        } while (first<=last);
    }
}
public class NumberGuesser {

    
    public static void main(String[] args) {
        NG_Call ng = new NG_Call(0,100);
        
        ng.compute();
    }
    
}
