package Dmane;

public class Player {
    private String Name;
    private int Age;
    private int TotalPoints;

    public Player(String name, int age){
        Name= name;
        Age=age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int setTotalPoints(int m, int n, int x, int y){
        return TotalPoints= m*x-n*y;
    }
    public int getTotalPoints() {
        return TotalPoints;
    }

    public void printInfo(){
        System.out.println("Name: "+ Name+ "\n"+ "Age: "+ Age);
    }

    public boolean isLeading(Player X)
    {
        if(this.TotalPoints > X.TotalPoints)
        {
            return true;
        }
        else return false;
    }


}


