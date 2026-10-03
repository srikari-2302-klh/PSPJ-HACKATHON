package WORK.HACKATHON_PHASE1;

import java.util.*;
public class Methods3C {
    static double calculateTotalWaste(double point1Waste, double point2Waste){
        double total = point1Waste + point2Waste;
        return total;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("AMOUNT OF WASTE COLLECTED AT POINT 1 (IN KG): ");
        double point1Waste = s.nextDouble();
        System.out.print("AMOUNT OF WASTE COLLECTED AT POINT 2 (IN KG): ");
        double point2Waste = s.nextDouble();

        double total = calculateTotalWaste(point1Waste , point2Waste);

        System.out.print("TOTAL WASTE CLLECTED: "+total);


    }
}
