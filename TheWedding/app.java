import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * app
 */
public class app {
    public static void main(String[] args) {
        String brideAndGroom = getBrideAndGroom();
        int numOfGuests = getNumOfGuests();
        double squareFootage = getSquareFootage();
        ArrayList<String> djSetList = getDJSetlist();
        float guestPerFoot = getGuestPerFoot(numOfGuests, squareFootage);


        try{
            PrintWriter pw = new PrintWriter("Wedding_Info.txt");
            pw.println("Wedding Info: ");
            pw.println("The names of the bride and groom are: " + brideAndGroom);
            pw.println("The number of guests in attendance are: " + numOfGuests);
            pw.println("The DJ's Set list is: " + djSetList);
            pw.println("The square footage of the venue is: " + squareFootage);
            pw.println("The number of guests per foot is " + guestPerFoot);
            
            pw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            Scanner FileReader = new Scanner(new File("Wedding_Info.txt"));
            while(FileReader.hasNextLine()){
                System.out.println(FileReader.nextLine());
            }

        }catch(Exception e ){
            e.printStackTrace();
        }




    }

    public static String getBrideAndGroom(){
    
        System.out.println("What are the names of the bride and groom");
        Scanner scan = new Scanner(System.in);
        String brideAndGroom = scan.nextLine();

        return brideAndGroom;
    }

    public static int getNumOfGuests(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many guests will be at the wedding");

        int numOfGuests = scan.nextInt();

        return numOfGuests;
    }

    public static double getSquareFootage(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the square footage of the venue?");

        double squareFootage = scan.nextDouble();

        return squareFootage;

        
    }

    public static ArrayList<String> getDJSetlist(){
        ArrayList<String> djSetList = new ArrayList<>();
        Scanner scan =  new Scanner(System.in);
        Scanner Answer = new Scanner(System.in);
        boolean answer = false;

        while(!answer){
            System.out.println("Would you like to add to the DJ's setlist?");
            String userAnswer = Answer.nextLine();
            if(userAnswer.equals("yes")){
                System.out.println("What song would you like to add?");
                djSetList.add(scan.nextLine());
            }else{
                System.out.println("Thank you for adding to the set list");
                answer = true;
            }
            
        }

        return djSetList;
    }

    public static float getGuestPerFoot(int numOfGuests, double squareFootage){

        float footPerGuest = (float) numOfGuests / (float) squareFootage;

        return footPerGuest;


    }

    
}