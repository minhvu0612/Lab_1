/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

/**
 *
 * @author vungocminh-20184156
 * a11.x1 + a12.x2 = b1
 * a21.x1 + a22.x2 = b2
 */
public class First_with_two {
    private double D,D1,D2;
    public void set_D_D1_D2(double a11, double a12, double a21, double a22, double b1, double b2){
        this.D = (a11*a22 - a12*a21);
        this.D1 = (b1*a22 - b2*a12);
        this.D2 = (b2*a11 - b1*a21);
    }
    public void equation(){
        if (this.D != 0){
            System.out.println("Pt co nghiem duy nhat: ( x1, x2 )=" + (D1/D) + "," + (D2/D));
        }
        if (this.D == 0){
            if (this.D1 == 0 && this.D2 == 0){
                System.out.println("Pt co vo so nghiem");
            }
            else{
                System.out.println("Pt vo nghiem");
            }
        }
    }
}
