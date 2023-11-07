import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        RoadTrip RT1 = new RoadTrip();
        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to name the van?");
        String vanNameIn = scan.nextLine();
        RT1.vanName = vanNameIn;

       RT1.addDiaryEntry("Arrived in montana, trip is going great");
       RT1.addDiaryEntry("Arrived in North Dakota, trip is still going good");
       RT1.addDiaryEntry("Ted got dysentary");
       RT1.addDiaryEntry("continuing the trip without ted");




        while(RT1.numPassengers <= 8){ //prompts the user until the number of passengers is 8
            System.out.println("Would you like to add a passenger?");
            String decision = scan.nextLine();
            if (decision.equalsIgnoreCase("quit")) {
                break;
            }
            
                 
                System.out.println("What is the first name of the passenger?");
                String firstNameIn = scan.nextLine();

                
                
                System.out.println("What is the last name of the passenger?");
                String lastNameIn = scan.nextLine();

               

                System.out.println("What is the passenger's phone number?");
                String phoneNumber = scan.nextLine();
                

                Passenger passenger = new Passenger(firstNameIn, lastNameIn, phoneNumber);
            

                if (RT1.addPassenger(passenger)) {
                    System.out.println("The passenger has been added. The number of passengers is now: " + RT1.numPassengers);
                    RT1.passengers.add(passenger);
                    
              }else{
                break;
              }
            }  
              while(true)
              {
                System.out.println("Who would you like to add a favorite food for?");
                String target = scan.nextLine();
                
                if (target.equalsIgnoreCase("quit"))
                {
                    break;
                }


                System.out.println("What is their last name?");
                String targetLast = scan.nextLine();

                
               
                
                System.out.println("What food would you like to add?");
                String foodChoice = scan.nextLine();
                
                Passenger passenger2 = new Passenger(target, targetLast, "");
                RT1.addFavoriteFood(passenger2, foodChoice);

                 if (foodChoice.equalsIgnoreCase("quit")) {
                    break;
                }     
    }

        System.out.println("Road Trip: " + RT1.vanName + "\n");

        RT1.displayPassengers();

        System.out.println("\n");

        RT1.displayDiaryEntries();

   }
}




       


 

