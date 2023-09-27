import java.util.ArrayList;

public class Elevator {
    private int weightLimit;
    private int currentWeight;
    private Person person;
    private ArrayList<Person> peopleInElevator;

    public Elevator()
{
    this.weightLimit = 0;
    this.currentWeight = 0;
    // this.person = person;
    this.peopleInElevator = new ArrayList<>();
    

}


public void setweightLimit(int weightLimit)
{

    this.weightLimit = weightLimit;
    
}

public void setCurrentWeight(int currentWeight)
{
    this.currentWeight = currentWeight;
}

public int getCurrentWeight()
{
return this.currentWeight;
}

public int getWeightLimit()
{
    return this.weightLimit;
}

public boolean addPerson(Person p){


    if(p.getweightOfPerson() + currentWeight <= weightLimit){
        peopleInElevator.add(p);
        currentWeight += p.getweightOfPerson();
       return true;
       
       
    }else{
        return false;
    }
}

public String getInfo()
{
    String info = "The final weight of the elevator is: " + this.currentWeight;


    for(Person p: peopleInElevator){
        info += p.getInfo();
    }

    return info;

    
}

}


