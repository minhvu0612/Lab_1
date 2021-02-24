/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author vungocminh-20184156
 * a.x + b = 0
 */
public class First_with_one {
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
        if (this.a == 0 && this.b == 0){
            System.out.println("PT vo so nghiem");
        }
        if (this.a == 0 && this.b != 0){
            System.out.println("PT vo nghiem");
        }
        if (this.a !=0){
            System.out.println("PT co nghiem x = " + (-1.0*this.b)/this.a);
        }
    }
}
