package Dmane;

public class Attacker extends Player {
    private int GoalsScored, GoalsMissed;

    public Attacker(String name, int age, int scored, int missed){
        super(name, age);
        GoalsScored =scored;
        GoalsMissed= missed;
    }


    public int getTotalPoints() {
        return super.setTotalPoints(3, 1, GoalsScored, GoalsMissed);
    }


    public void printInfo(){
       super.printInfo();
       System.out.println("Type: Attacker"  + "\n" + "Goals scored: "+ GoalsScored+ "\n"+ "Goals Missed: "+ GoalsMissed);
       System.out.println("Total Points: "+ getTotalPoints()+ "\n");
    }


}
