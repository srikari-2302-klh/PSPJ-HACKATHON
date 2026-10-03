package WORK.HACKATHON_PHASE1;

import java.util.*;
public class Conditions3B {
    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("ENTER THE AMOUNT OF WASTE COLLECTED (IN KG): ");
        int n = s.nextInt();
        if(n >= 100){
            System.out.print("COLLECTION TARGET ACHIEVED!");
        }
        else{
            System.out.print("MORE WASTE COLLECTION REQUIRED");
        }
    }
}
