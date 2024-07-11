/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.footshape;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class FootShape {
    /**
     * @param args the command line arguments
     */
    private Foot foot;
    
    public String drawAsEllipse() {
        foot  = new Ellipse();
        return foot.draw();
    }
    
    public String drawAsRectangle() {
        foot  = new Rectangle();
        return foot.draw();
        
    }
    
    public static void main(String[] args) {
        FootShape app = new FootShape();
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? type 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                System.out.println(app.drawAsEllipse());  
                break;
            case 2:
                System.out.println(app.drawAsRectangle()); 
                break;
            
            
        }
    }
}
