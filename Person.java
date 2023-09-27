public class Person {
    private String name;
    private int weightOfPerson;

    public Person(String name, int weightOfPerson)
    {
        this.name = name;
        this.weightOfPerson = weightOfPerson;
    }



    public int getweightOfPerson()
    {
        return this.weightOfPerson;
    }

    public String getName()
    {
        return this.name;
    }

    public String getInfo()
    {
        return "\n name: " + this.name + "  weight is: " + this.weightOfPerson;
    }


}
