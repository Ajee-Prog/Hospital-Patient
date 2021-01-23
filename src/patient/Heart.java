
package patient;

/**
 *
 * @author Mobholar
 */
public class Heart extends Organ {
    private int rate;

    public Heart(int rate, String name, String medicalCondition) {
        super(name, medicalCondition);
        this.rate = rate;
    }
    
    //Override Details hereeeeeeee.....
    public void getDetails(){
        super.getDetails();
        System.out.println("Heart Rate: " +this.getRate());
    }    
   
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    
    
    
    
    
}
