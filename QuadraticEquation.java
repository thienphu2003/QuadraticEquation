public class QuadraticEquation {
    private double a,b,c;
    private double delta;
    private double r1,r2;
    public QuadraticEquation(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant()
    {
        this.delta=Math.pow(this.getB(),2)-4*this.getA()*this.getC();
        return this.delta;
    }
    public double getRoot1()
    {
        if(this.getDiscriminant()>=0) {
            this.r1 = ((-1) * this.getB() + Math.sqrt(this.getDiscriminant())) / 2 * this.getA();
            return this.r1;
        }else return 0;
    }
    public double getRoot2()
    {
        if(this.getDiscriminant()>=0) {
            this.r2 = ((-1) * this.getB() - Math.sqrt(this.getDiscriminant())) / 2 * this.getA();
            return this.r2;
        }else return 0;
    }

}
