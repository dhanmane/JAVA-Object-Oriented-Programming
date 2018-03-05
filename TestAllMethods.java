public class TestAllMethods extends Thread {
    public void run() {

    for (int i = 1; i <= 3; i++) {

        try {

            Thread.sleep(500);

            System.out.println(Thread.currentThread().getName() + " in control");

        } catch (Exception e) {
            System.out.println(e);
        }

       //System.out.println(Thread.currentThread().getName() + " in control after sleeping "+ i);
       System.out.println(i);
    }

}
    public static void main(String args[]){

        TestAllMethods t1=new TestAllMethods();

        TestAllMethods t2=new TestAllMethods();

        TestAllMethods t3=new TestAllMethods();


        t1.start();      //start 2nd and 3rd thread after waiting for first one to complete or if it is dead
        try{
            System.out.println("Start threads t2 and t3 once t1 is completed");

            t1.join();

        }catch(Exception e){System.out.println(e);}

        t2.start();
        try{

            t2.yield();
            System.out.println(Thread.currentThread().getName() + " in control");

        }catch(Exception e){System.out.println(e);}

        t3.start(); // t3 will be executed before t2
        System.out.println("Yield"); // executed before returning to thread t2
    }
}