package Dmane;
import java.util.Map;

public class ManeDhanashreeA6 {
    public static void main(String args[]) {
        int leadingBy;
        Attacker a = new Attacker("Lionel Messi", 29, 3, 0);
        GoalKeeper g = new GoalKeeper("Petr Cech", 34, 5, 1);

        a.printInfo();
        g.printInfo();
        a.isLeading(g);

        if (a.isLeading(g)) {
            leadingBy = a.getTotalPoints() - g.getTotalPoints();
            System.out.println(a.getName() + " leads " + g.getName() + " by " + leadingBy);
        } else {
            leadingBy = g.getTotalPoints() - a.getTotalPoints();
            System.out.println(g.getName() + " leads " + a.getName() + " by " + leadingBy);
        }
    }
}
