import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào a :");
        double number1 = sc.nextDouble();
        System.out.println("Hãy nhập vào b :");
        double number2=sc.nextDouble();
        System.out.println("Hãy nhập vào c :");
        double number3=sc.nextDouble();


        QuadraticEquation test = new QuadraticEquation(number1,number2,number3);
        System.out.println("a của phương trình bậc 2 là :" +test.getA());
        System.out.println("b của phương trình bậc 2 là :" + test.getB());
        System.out.println("c của phương trình bậc 2 là :" +test.getC());
        if(test.getDiscriminant()>0)
        {
            System.out.println("Nghiệm thứ nhất của phương trình là :" + test.getRoot1());
            System.out.println("Nghiệm thứ hai của phương trình là :" +test.getRoot2());

        }else if(test.getDiscriminant()==0)
        {
            System.out.println("Phương trình có 1 nghiệm kép là :" +test.getRoot1());
        }else
            System.out.println("The equation has no roots!");
    }
}
