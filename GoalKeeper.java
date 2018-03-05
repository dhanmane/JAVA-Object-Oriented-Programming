package Dmane;

public class GoalKeeper extends Player {
    private int GoalsSaved, GoalsConceded;

    public GoalKeeper(String name, int age, int saved, int conceded){
        super(name, age);
        GoalsSaved = saved;
        GoalsConceded = conceded;
    }
    public int getTotalPoints() {
        return super.setTotalPoints(1, 1, GoalsSaved, GoalsConceded);
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Type: GoalKeeper"  + "\n"+ "Goals saved: "+ GoalsSaved+ "\n"+ "Goals Conceded: "+ GoalsConceded);
        System.out.println("Total Points: "+ getTotalPoints());
    }

}
