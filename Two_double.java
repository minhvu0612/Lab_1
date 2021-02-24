/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author vungocminh-20184156
 * Sum, Difference, Product, Quotient of a,b
 */
public class Two_double {
    private double a,b;
    public void set_A(double a){
        this.a = a;
    }
    public double get_A(){
        return this.a;
    }
    public void set_B(double b){
        this.b = b;
    }
    public double get_B(){
        return this.b;
    }
    public void equation(){
        System.out.println("Sum         = " + (this.a + this.b));
        System.out.println("Difference  = " + (this.a - this.b));
        System.out.println("Product     = " + (this.a * this.b));
        System.out.println("Quotient    = " + (this.a / this.b));
    }
}
