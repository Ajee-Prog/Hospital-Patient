
package patient;

/**
 *
 * @author Mobholar
 */
public class Skin extends Organ{
    private String color;
    private int softness;

    public Skin(String color, int softness, String name, String medicalCondition) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }
    
    //Override getDetails
    public void getDetails(){
        super.getDetails();
        System.out.println("Skin Color is " +this.getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
    
    
    
}
