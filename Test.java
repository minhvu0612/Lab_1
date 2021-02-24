/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author vungocminh-20184156
 */
public class Test {
    public static void main(String[] arg){
        First_with_one F1 = new First_with_one();
        First_with_two F2 = new First_with_two();
        Two_with_one T1   = new Two_with_one();
        Two_double Td = new Two_double();
        System.out.println("\n\n\na.x + b = 0\n");
        F1.set_A(1.0);
        F1.set_B(2.0);
        F1.equation();
        System.out.println("\n\n\na11.x1 + a12.x2 = b1 \na21.x1 + a22.x2 = b2\n");
        F2.set_D_D1_D2(1.0,2.0,3.0,4.0,5.0,6.0);
        F2.equation();
        System.out.println("\n\n\na.x^2 + b.x = c\n");
        T1.set_A(1.0);
        T1.set_B(2.0);
        T1.set_C(3.0);
        T1.equation();
        System.out.println("\n\n\nSum, Difference, Product, Quotient of a,b\n");
        Td.set_A(1.0);
        Td.set_B(2.0);
        Td.equation();
    }
}
