public class Loader {
    public static void main (String[] args)
    {
        Ball a = new Ball();

       /* a.setColor="Blue";
        a.radius=5.4f;
        a.type="Football"; */

        Ball b = new Ball();
        b.setType("Волейбольный");
        b.setRadius(3.2f);
        b.setColor("White");

        System.out.println(b);
        System.out.println();
       // System.out.println(a);
    }
}
