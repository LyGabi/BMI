public class Mass_Calculator {

    double mass;
    double height;
    final double KG_PER_POUND = 0.45359237;
    final double METERS_PER_INCH = 0.0254;

    Mass_Calculator(){
        mass = 1;
        height = 1;
    }

    Mass_Calculator(double newMass, double newHeight){
        mass = newMass;
        height = newHeight;
    }

    double getWeight(){
        return mass * KG_PER_POUND;
    }
    double getHeight(){
        return height * METERS_PER_INCH;
    }

    double findBMI(){
        return getWeight() / (getHeight()*getHeight());
    }
    void setMass(double newMass){
        mass = newMass;
    }


}
