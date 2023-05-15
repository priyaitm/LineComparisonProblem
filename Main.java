package practice.linecomparison;



public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

         Line l1 = new Line();
         l1.p1 = new Point();
         l1.p1.x=12;
         l1.p1.y=78;

         l1.p2 = new Point();
         l1.p2.x=54;
         l1.p2.y=98;

         System.out.println(l1.getLength());



    }
}
