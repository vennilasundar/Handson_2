
package numberfight;

import java.util.Scanner;


public class NumberFight {
// pull request
    
    public static void main(String[] args) {
        int M,B;
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Michel, Enter your number? ");
        M = numberInput.nextInt();
        System.out.print("Bruce, Enter your number? ");
        B = numberInput.nextInt();
        
        if(M>B){
            System.out.print("Micheal you won the girl");
        } else {
            System.out.print("Bruce you won the girl");
        }
    }
    
}
