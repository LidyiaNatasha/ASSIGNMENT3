


import javax.swing.*;
import java.awt.*;

abstract public class CampsDescription {

    String campName , campDescription;
    Double campPrice;
    private JTextArea resadd;
    private Container c;


    /**
     * @wbp.parser.entryPoint
     */
    public CampsDescription() {


    }

    /**
     * @wbp.parser.entryPoint
     */
    public String getCampName() {
        return campName;
    }

    /**
     * @wbp.parser.entryPoint
     */
    public void setCampName(String campName) {
        this.campName = campName;
    }

    /**
     * @wbp.parser.entryPoint
     */
    public String getCampDescription() {
        return campDescription;
    }

    /**
     * @wbp.parser.entryPoint
     */
    public void setCampDescription(String campDescription) {
        this.campDescription = campDescription;
    }

    /**
     * @wbp.parser.entryPoint
     */
    public Double getCampPrice() {
        return campPrice;
    }

    /**
     * @wbp.parser.entryPoint
     */
    public void setCampPrice(Double campPrice) {
        this.campPrice = campPrice;
    }

    /**
     * @wbp.parser.entryPoint
     */
    public void printInfo(){

        System.out.println("--------------------------CAMP DETAILS-------------------------------");
        System.out.println("You have enrolled to " + getCampName() + " camp");
        System.out.println("Price of Camp  - RM " + getCampPrice());
        System.out.println("Description of Camp  \n" + getCampDescription());

    }

    /**
     * @wbp.parser.entryPoint
     */
    public String getCampInfo() {
        return "\n--------------------------CAMP DETAILS-------------------------------\nYou have enrolled to " + getCampName() +
                " camp\nPrice of Camp  - RM " + getCampPrice()+
                "\nDescription of Camp - \n" + getCampDescription();


    }
}
