/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FootShape;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class FootShape extends Foot {
    /**
     * @param args the command line arguments
     */
    private Foot foot;
    
    public String drawAsEllipse() {
        Ellipse e  = new Ellipse();
        return e.draw();
    }
    
    public String drawAsRectangle() {
        Rectangle r  = new Rectangle();
        return r.draw();
        
    }
    
    public static void main(String[] args) {
        FootShape app = new FootShape();
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? type 1. Ellipse, 2. Rectangle");
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
