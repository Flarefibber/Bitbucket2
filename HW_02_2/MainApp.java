package HW_02_2;

import org.junit.Assert;

public class MainApp {
    public static void main(String[] arg) {
        //Prepare test data
        int size_final = 3;
        System.out.println("Create a stack with a size: " + size_final);
        ObjectQueue queue = new ObjectQueue(size_final);
        String p1 = "String 1";
        String p2 = "String 2";
        String p3 = "String 3";
        String p4 = "String 4";

        System.out.println("Current stack size: " + queue.size());

        System.out.println("\nPutting on the stack: \n");
        queue.push(p1);
        System.out.println(p1);
        queue.push(p2);
        System.out.println(p2);
        queue.push(p3);
        System.out.println(p3);
        queue.push(p4);
        System.out.println(p4);

        //Execute code to test with test data
        Integer t = queue.size();
        String t1 = (String)queue.pullback();
        String t2 = (String)queue.pullback();
        String t3 = (String)queue.pullback();
        Integer t4 = (Integer) queue.pullback();
        Integer t5 = queue.size();
        //Check the result
        System.out.println("\nWe check the order of the received data with the expected: \n");
        System.out.println("Size " + t + " equal to size 3: " +(t.equals((Integer)3)));
        System.out.println(t1 + " equal to "+p4+": " +(t1.equals(p4)));
        System.out.println(t2 + " equal to "+p3+": " +(t2.equals(p3)));
        System.out.println(t3 + " equal to "+p2+": " +(t3.equals(p2)));
        if (t4 == null)
        System.out.println(t4 + " equal to null: true");
        else System.out.println(t4 + " equal to null: false");
        System.out.println("Size " + t5 + " equal to size 0: " +(t5.equals((Integer) 0)));
    }
}
