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
public class FootShape {
    /**
     * @param args the command line arguments
     */
    private Foot customer;
    public void getCustomerTypeFromUser(String customerType) {
        switch(customerType) {
            case "Regular":
                customer = new RegularCustomer();
                break;
            //complete MountainCustomer
            case "Mountain":
                customer = new MountainCustomer();
                break;
            //complete DelinquentCustomer 
            case "Delinquent":
                customer = new DelinquentCustomer();
                break;
        }
    }
    public String generateMail() {
        return customer.createMail();
    }
    
    public static void main(String[] args) {
        CustomerMailApplication app = new CustomerMailApplication();
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                app.getCustomerTypeFromUser("Regular");
                break;
            case 2:
                app.getCustomerTypeFromUser("Mountain");
                break;
            case 3:
                app.getCustomerTypeFromUser("Delinquent");
                break;
            
        }
        System.out.println(app.generateMail());        
    }
}
