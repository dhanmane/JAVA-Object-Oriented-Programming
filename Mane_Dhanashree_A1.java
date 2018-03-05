
public class Mane_Dhanashree_A1 {

    private void CheckMarks(int marks) { //CheckMarks is private method for class Mane_Dhanashree_A1

        if(marks >= 40) {
            System.out.println("Pass" + "\n" + "Congratulations!!");
        } //Printing 'Pass' and 'Congratulations!!' when marks are greater or equal to 40
        else {
            System.out.println("Fail" + "\n" +"Better Luck Next Time" );
        } //Printing 'Fail' and 'Better Luck Next Time' when marks are below 40
    }

    public static void main(String[] args) {
        Mane_Dhanashree_A1 check = new Mane_Dhanashree_A1(); //Created new object to check if pass or fail
        check.CheckMarks(30); // Checking Pass or Fail for Marks=80
        System.out.println("Program Completed");
    }
}

