
package patient;

import java.util.Scanner;

/**
 *
 * @author Mobholar
 */
public class Patient {
private String name;
private int age;
private Eye lefeye;
private Eye rightEye;
private Heart heart;
private Stomach stomach;
private Skin skin;

    public Patient(String name, int age, Eye lefeye, Eye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.lefeye = lefeye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eye getLefeye() {
        return lefeye;
    }

    public void setLefeye(Eye lefeye) {
        this.lefeye = lefeye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public void setRightEye(Eye rightEye) {
        this.rightEye = rightEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        // TODO code application logic here
        Patient patient = new Patient("Yusuf", 30, new Eye("Blue", true, "Left eye", "Short"), 
                new Eye("Blue", true, "Right eye", "Normal"),new Heart(65, "Heart", "Normal"),
                new Stomach(false, "Stomach", "PUD"), new Skin("White", 40, "Skin", "Burned"));
        
        System.out.println("patient name: " + patient.getName());
        System.out.println("Patient Age: " + patient.getAge());
        
        Scanner input = new Scanner(System.in);
        
        boolean shouldFinish = false;
        while(!shouldFinish){
            System.out.println("Choose an Organ: " + "\n\t1. Left Eye" + "\n\t2. Left Eye" + "\n\t3. Left Eye" + "\n\t4. Left Eye" + "\n\t5. Left Eye" + "\n\t6. Quit");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                patient.getLefeye().getDetails();
                if(patient.getLefeye().isIsOpened()){
                    System.out.println("\n\t1. Close the Eye");
                    if(input.nextInt()==1){patient.getLefeye().close();}else{continue;}
                }else{
                    System.out.println("\n\t1. Open the Eye");
                    if(input.nextInt()==1){patient.getLefeye().open();}else{continue;}
                }
                break;
            
            case 2:
                //patient.getRightEye()
                patient.getRightEye().getDetails();
                if(patient.getRightEye().isIsOpened()){
                    System.out.println("\n\t1. Close the Eye");
                    if(input.nextInt()==1){patient.getRightEye().close();}else{continue;}
                }else{
                    System.out.println("\n\t1. Open the Eye");
                    if(input.nextInt()==1){patient.getRightEye().open();}else{continue;}
                }
                break;
            case 3:
                patient.getHeart().getDetails();
                System.out.println("\t\t1.Change the Heart rate");
                if(input.nextInt()==1){
                    System.out.println("Enter new heart rate: ");
                    int newHeartRate = input.nextInt();
                    patient.getHeart().setRate(newHeartRate);
                    System.out.println("Heart rate changed to: "+patient.getHeart().getRate());
                }else{continue;}
                break;
            case 4:
                patient.getStomach().getDetails();
                System.out.println("\t\t1. Digest");
                if(input.nextInt()==1){
                    patient.getStomach().digest();
                }else{continue;}
                break;
            case 5:
                patient.getSkin().getDetails();
                break;
            default:
                shouldFinish = true;
                break;
                
        }
        }
        System.out.println("");
        
    
    }
    
}
