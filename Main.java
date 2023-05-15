package practice.linecomparison;



public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

         Line l1 = new Line();
         l1.p1 = new Point();
         l1.p1.x=10;
         l1.p1.y=20;

         l1.p2 = new Point();
         l1.p2.x=100;
         l1.p2.y=200;

         System.out.println(l1.getLength());

         Line l2 = new Line();
         l2.p1 = new Point();
         l2.p1.x=10;
         l2.p1.y=20;

         l2.p2 = new Point();
         l2.p2.x=100;
         l2.p2.y=200;

        System.out.println(l2.getLength());


        System.out.println("is L1 and l2 are equal: " + l1.equals(l2));



    }
}
