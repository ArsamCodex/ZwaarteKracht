package Zwaartekracht;

import java.util.Scanner;

public class App {
    // zwaartekracht fourmule is f = g*m1*m2/d2
    // waar m1 is massa van eerste en m2 massa twede en d afstad tussen twee  en g algemeene zwaarkracht

    private static final double g = 6.673e-8;
    private static double cal_f(double m1 , double m2,double d){
        return (g * m1 * m2 / pow(d));
    }

    private static double pow(double d){
    return  (d*d);

    }
    public static  void main ( String [] args){
        double m1 , m2 , d ;
        System.out.print("Enter m1");
        m1 = new Scanner (System.in).nextDouble();
        System.out.print("Enter m2");
        m2 = new Scanner (System.in).nextDouble();
        System.out.print("Enter D");
        d = new Scanner (System.in).nextDouble();
        System.out.printf("F is %1$s" , cal_f(m1,m2,d));
    }

}
