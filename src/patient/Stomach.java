
package patient;

/**
 *
 * @author Mobholar
 */
public class Stomach extends Organ {
    boolean isEmpty;

    public Stomach(boolean isEmpty, String name, String medicalCondition) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }
    public void digest(){System.out.println("Digesting begin.....");}
    
    public void getDetails(){
        super.getDetails();
        if(this.isEmpty){
            System.out.println("You need to be 'Fed'!");
        }else{System.out.println("Stomach is 'full' Ok!");}
    }

    public boolean isIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }
    
    
    
    
}
