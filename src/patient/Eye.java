
package patient;

/**
 *
 * @author Mobholar
 */
public class Eye extends Organ {
    private String color;
    private boolean isOpened;

    public Eye(String color, boolean isOpened, String name, String medicalCondition) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }
    
    public void getDetails(){
        super.getDetails();
        System.out.println("Color: " +this.getColor());
    }
    
    public void open(){
        this.setIsOpened(true);
        System.out.println(this.getName() + "Opened");
    }
    public void close(){
        this.setIsOpened(false);
        System.out.println(this.getName() + "Closed");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsOpened() {
        return isOpened;
    }

    public void setIsOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }
    
    
}
