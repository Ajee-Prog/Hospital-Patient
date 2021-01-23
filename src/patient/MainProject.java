/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patient;

/**
 *
 * @author Mobholar
 */
public class MainProject {
    public static void Main(String[] args) {
        // TODO code application logic here
        Patient patient = new Patient("Yusuf", 30, new Eye("Blue", true, "Left eye", "Short"), 
                new Eye("Blue", true, "Right eye", "Normal"),new Heart(65, "Heart", "Normal"),
                new Stomach(false, "Stomach", "PUD"), new Skin("White", 40, "Skin", "Burned"));
        
        System.out.println("patient name: " +patient.getName());
    }
    
}
