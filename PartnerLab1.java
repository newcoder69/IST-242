/**
 * PartnerLab1
 */

 import java.util.Scanner;

public class PartnerLab1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Elevator elevator1 = new Elevator();
        Elevator elevator2 = new Elevator();

        System.out.println("Enter the weight limit for elevator 1");
        int inputWeightLimit1 = scan.nextInt();
        elevator1.setweightLimit(inputWeightLimit1);
        scan.nextLine();    

        System.out.println("Enter the weight limit for elevator 2");
        int inputWeightLimit2 = scan.nextInt();
        elevator2.setweightLimit(inputWeightLimit2);
        scan.nextLine();

        Elevator currentElevator = elevator1;

        

        while(true){
            System.out.println("Enter the the name of the person you want to add:");
            String inputName = scan.nextLine();
            
            if(inputName.equalsIgnoreCase("q")){
                if(currentElevator ==  elevator1){
                    System.out.println("You have now switched to Elevator 2");
                    currentElevator = elevator2;
                } else{
                    break;
                }
            }else{
                System.out.println("Enter the weight of the person you would like to add");
                int inputWeight = scan.nextInt();
                scan.nextLine();

                Person person = new Person(inputName, inputWeight);
                if(currentElevator.addPerson(person)){
                    System.out.println(person.getInfo() + " the weight of the elevator is now: " + currentElevator.getCurrentWeight());
                }else{
                    System.out.println("This person could not be added");
                } 
            }
            if(currentElevator.getCurrentWeight() == currentElevator.getWeightLimit())
            {
                if(currentElevator == elevator1){
                    currentElevator = elevator2;
                    System.out.println("you have reacheed the weight limit for this elevator, switching to second elevator");
                }

        }
        }
        System.out.println("Elevator 1: " + elevator1.getInfo() );
        
        System.out.println("Elevator 2: " + elevator2.getInfo() );
            
        

    }
            

       



        
       
        

        


    }
    
