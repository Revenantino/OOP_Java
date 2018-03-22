package Prometheus;
public class SquareRoot {
    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        double discriminant = Math.pow(b, 2) - 4*a*c;

        if (discriminant < 0 || (a == 0 && b == 0)){
            System.out.println("x1=");
            System.out.println("x2=");
        }
        else if (a == 0) {
            double x1 = c/b;
            double x2 = c/b;

            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
        else{
            double x1 = ((b*-1) + Math.sqrt(discriminant))/(2*a);
            double x2 = ((b*-1) - Math.sqrt(discriminant))/(2*a);

            System.out.println("x1="+x1);
            System.out.println("x2="+x2);
        }
    }
}
