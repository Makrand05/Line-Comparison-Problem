import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first line co-ordinated");
        System.out.println("Enter the first (x1, y1) point");

        int x1=sc.nextInt();
        int y1=sc.nextInt();

        System.out.println("Enter the Second (x2, y2) point");

        int x2=sc.nextInt();
        int y2=sc.nextInt();
        double x=Math.pow((x2-x1), 2);
        double y=Math.pow((y2-y1), 2);
        double length = Math.floor(Math.sqrt(x+y));
        System.out.println(length);
        System.out.println("Enter the Second  line co-ordinated");
        System.out.println("Enter the first (x1, y1) point");

        int m1=sc.nextInt();
        int n1=sc.nextInt();

        System.out.println("Enter the Second (x2, y2) point");

        int m2=sc.nextInt();
        int n2=sc.nextInt();
        double a=Math.pow((m2-m1), 2);
        double b=Math.pow((n2-n1), 2);
        double length1 = Math.floor(Math.sqrt(a+b));

        if(length1==length){
            System.out.println("the length of line is equal");
        }
        else
            System.out.println("the length of line is not equal");
        System.out.println(length1);
    }
}
