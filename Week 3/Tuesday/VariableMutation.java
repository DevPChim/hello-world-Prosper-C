public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10

        a *= 10;

        System.out.println(a);

        int b = 100;
        // make b smaller by 7

        b -= 7;

        System.out.println(b);

        int c = 44;
        // please double c's value

        c *= 2;

        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value

        d /= 5;

        System.out.println(d);

        int e = 8;
        // please cube of e's value

        System.out.println(Math.pow(e, 3));


        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        boolean greater = true;

        int comp = Integer.compare(f1, f2);
        if(comp>0) {
            greater = true;
        } else {
            greater = false;
        }

        System.out.println(false);

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        int gr = (g2 *= 2);

        int compare = Integer.compare(gr, g1);
        if(comp>0) {
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)


        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
    }
}
