import java.util.Scanner;

public class FindBMI {

    public static void main(String[] args){
        Scanner answers = new Scanner(System.in);
        System.out.println("Please enter your weight in pounds: ");
        double mass = answers.nextInt();
        System.out.println("Please enter your height in inches: ");
        double height = answers.nextInt();

        Mass_Calculator personOne = new Mass_Calculator(mass, height);
        System.out.println("According to your inputs, your weight in Kg is: " + personOne.getWeight() +" and your height in meters is: " + personOne.getHeight());
        System.out.println("Therefore your BMI is: " + personOne.findBMI());

        if (personOne.findBMI() < 18.5) {
            System.out.println("You're underweight");
        }
            else if (personOne.findBMI() < 25){
                System.out.println("You're normal weight");
            }
            else if(personOne.findBMI() < 30){
                System.out.println("You're overweight");
            }
            else
                System.out.println("You're obese");

            System.out.println("Disclaimer: BMI does not accurately represent your physical capability. You must consider your daily activity and physique to evaluate your performance");
        }
    }

