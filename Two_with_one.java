/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author vungocminh-20184156
 * a.x^2 + b.x = c
 */
public class Two_with_one {
    private double a,b,c;
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
    public void set_C(double c){
        this.c = c;
    }
    public double get_C(){
        return this.c;
    }
    public void equation(){
        double delta = this.b*this.b - this.a*this.c;
        if (delta == 0){
            System.out.println("Pt co nghiem kep : x = " + (-1.0*b)/(2*a));
        }
        if (delta > 0){
            System.out.println("Pt co nghiem x1 = " + (-1.0*b + Math.sqrt(delta))/(2*a));
            System.out.println("Pt co nghiem x2 = " + (-1.0*b - Math.sqrt(delta))/(2*a));
        }
        if (delta < 0){
            System.out.println("Pt vo nghiem");
        }
    }
}
