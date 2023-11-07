        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.HashSet;
        import java.util.Iterator;
        import java.util.Map;
        import java.util.Scanner;
    import java.util.Map.Entry;

        public class RoadTrip {
            protected String vanName;
            private HashMap<Passenger,HashSet<String>> foodByPassenger = new HashMap();
            private ArrayList<String> diaryEntries  = new ArrayList();
            private HashSet<String> favoriteFoods  = new HashSet();
            protected HashSet<Passenger> passengers = new HashSet();
            private int vanLimit;
            protected int numPassengers;
            
            
            public RoadTrip() {
                this.vanName = vanName;
                this.foodByPassenger = foodByPassenger;
                this.diaryEntries = diaryEntries;
                this.favoriteFoods = favoriteFoods;
                this.vanLimit = 8;
                this.numPassengers = numPassengers;
            }


            public boolean addPassenger(Passenger p)
            {
                if(numPassengers < vanLimit)
                {   
                    passengers.add(p);
                    foodByPassenger.put(p,new HashSet());
                    numPassengers ++;

                    return true;
                }else
                {
                    return false;
                }

            }

            public void displayPassengers()
            {
                Iterator mapIter = foodByPassenger.entrySet().iterator();
                while (mapIter.hasNext()) {
                    System.out.println(mapIter.next());
                    
                }
            
            }

            public void addDiaryEntry(String entryInput)
            {
                diaryEntries.add(entryInput);
            }

            public void displayDiaryEntries()
            {
                

                Iterator diaryIter = diaryEntries.iterator();
                
                while(diaryIter.hasNext()){
                    System.out.println("Diary entires from the trip:" + diaryIter.next());
                }

            }


            public void addFavoriteFood(Passenger passenger, String favoriteFoodEntry)
            {
            
                if(foodByPassenger.containsKey(passenger))
                {

                HashSet<String> favoriteFoods = foodByPassenger.get(passenger);
                favoriteFoods.add(favoriteFoodEntry);
                foodByPassenger.put(passenger, favoriteFoods);
            
                }else
                {
                    System.out.println("This passenger is not in the van");
                    
                }
                    
                
            }
            



        }


            

